package com.academy.hdemo.dto;

import javax.persistence.*;

@Entity
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Long accountId;
    private String firstName;

    @Column(name = "last_name")
    private String secondName;
    @Column(nullable = true)
    private Long balance;

    public Account() {
    }

    public Account(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Account(long accountId, Long balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public Account(Long accountId, String firstName, String secondName) {
        this.accountId = accountId;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Account(Long accountId, Long balance, String firstName, String secondName) {
        this.accountId = accountId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.balance = balance;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
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

    public void setBalance(Long balance) {
        this.balance = balance;
    }


}
