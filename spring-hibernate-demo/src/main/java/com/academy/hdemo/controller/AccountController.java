package com.academy.hdemo.controller;

import com.academy.hdemo.dto.Account;
import com.academy.hdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/detail")
    public Account detail(@RequestParam long accountId) {
        return accountService.findById(accountId);
    }

    @PostMapping("/new")
    public void newAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

    @PutMapping
    void updateAccount(@RequestBody Account account) {
        accountService.update(account);
    }

    @DeleteMapping("/delete/{accountId}")
    void delete(@PathVariable Long accountId) {
        accountService.deleteAccount(detail(accountId));
    }

    @GetMapping()
    public List allAccount() {
        return accountService.getAllAccounts();
    }


    // transaction
    @PutMapping("/{toId}/{amount}/{fromId}")
    void transferBalance(@PathVariable Long toId ,@PathVariable Long amount, @PathVariable Long fromId) {
        accountService.transferBalance(toId , amount, fromId);
    }

}
