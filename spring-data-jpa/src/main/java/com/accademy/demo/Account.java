package com.accademy.demo;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;
    private String firstName;
    private String secondName;
    @Column(nullable = true)
    private Long balance;


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

    public Account(long accountId, String firstName, String secondName, Long balance) {
        this.accountId = accountId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.balance = balance;
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

    public Long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

}
