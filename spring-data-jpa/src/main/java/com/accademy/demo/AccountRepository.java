package com.accademy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findBySecondName(String lastName);

    Account findByAccountId(long id);

    Iterable<Account> findAll();


}
