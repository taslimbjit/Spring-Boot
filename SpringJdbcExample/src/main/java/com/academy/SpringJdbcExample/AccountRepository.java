package com.academy.SpringJdbcExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
public class AccountRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String create(Account account) {

        String SQL = "insert into account (first_name, last_name) values (?, ?)";
        int i = jdbcTemplate.update(SQL, new Object[]{account.getFirstName(), account.getSecondName()});

        return "data inserted Successfully";
    }

    public String update(Account account) {

        String SQL = "UPDATE account SET balance = ? WHERE account_id = ?";
        int res = jdbcTemplate.update(SQL, account.getBalance(), account.getAccountId());

        if (res > 0) {
            return "Successfully updated";
        } else {
            return "failed to update";
        }
    }

    public String delete(long id) {
        String SQL = "delete from Student where id = ?";
        int res = jdbcTemplate.update(SQL, id);
        if (res > 0) {
            return "Successfully updated";
        } else {
            return "failed to update";
        }
    }

    public List getAllAccounts(){
        String sql = "SELECT * FROM account";
        List<Map<String, Object>> accounts = jdbcTemplate.queryForList(sql);


        List<Account> result = new ArrayList<>();
        for(Map<String, Object> row:accounts){
            Account account = new Account((int)row.get("account_id"), (String) row.get("first_name"), (String) row.get("lastName_name"));
            result.add(account);
        }
        return result;
    }


    public String saveBatch(List<Account> accounts){
        String sql = "INSERT INTO account " + "(first_name, last_name) VALUES (?, ?)";

        int []ar =jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Account account = accounts.get(i);
                ps.setString(1, account.getFirstName());
                ps.setString(2, account.getSecondName());
            }

            @Override
            public int getBatchSize() {
                return accounts.size();
            }
        });
        return ar.length + " account added";
    }

}
