package com.academy.SpringJdbcExample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;


    @GetMapping("/details")
    public Account detail(int accountId) {
        return null;
    }

    @PostMapping("/new")
    public String newAccount(@RequestBody Account account) {
        return accountRepository.create(account);
    }

    @PutMapping
    String updateAccount(@RequestBody Account account) {
        return accountRepository.update(account);
    }

    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable Long id) {
        accountRepository.delete(id);
    }

    @GetMapping()
    public List allAccount() {
        return accountRepository.getAllAccounts();
    }

    @PostMapping("/save")
    public String saveAccounts(@RequestBody AccountLIst list) {
        return accountRepository.saveBatch(list.getAccounts());
    }

}
