package com.accademy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public Account newAccount(@RequestBody Account account) {
         return accountService.saveAccount(account);
    }

    @GetMapping("/")
    public Iterable<Account> allAccount() {
        return accountService.getAllAccounts();
    }

    @PatchMapping("/update")
    public void patchUser(@RequestBody Account account) {
        accountService.update(account);
    }


    @DeleteMapping("/delete/{customerId}")
    void deleteCustomer(@PathVariable Integer customerId) {
        accountService.deleteAccount(detail(customerId));
    }

}
