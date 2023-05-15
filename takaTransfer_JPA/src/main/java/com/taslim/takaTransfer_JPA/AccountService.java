package com.taslim.takaTransfer_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void createAccount(String name, BigDecimal balance) {
        Account account = new Account();
        account.setName(name);
        account.setBalance(balance);
        accountRepository.save(account);
    }
}
