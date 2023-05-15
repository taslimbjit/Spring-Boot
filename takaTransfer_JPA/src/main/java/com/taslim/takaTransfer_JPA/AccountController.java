package com.taslim.takaTransfer_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/accounts")
    public ResponseEntity<Void> createAccount(@RequestParam String name, @RequestParam BigDecimal balance) {
        accountService.createAccount(name, balance);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
