package com.academy.SpringJdbcExample;

public class Account {

    private long accountId;
    private String firstName;
    private String secondName;

    private long balance;

    public Account() {
    }

    public Account(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Account(long accountId, String firstName, String secondName) {
        this.accountId = accountId;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

}
