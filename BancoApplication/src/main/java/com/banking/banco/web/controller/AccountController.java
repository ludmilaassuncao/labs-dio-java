package com.banking.banco.web.controller;

import com.banking.banco.application.service.AccountService;
import com.banking.banco.domain.model.Account;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable UUID id) {
        return accountService.getAccountById(id);
    }

    @PostMapping
    public void createAccount(@RequestParam String owner, @RequestParam BigDecimal initialBalance) {
        accountService.createAccount(owner, initialBalance);
    }
}
