package com.banking.banco.application.service;

import com.banking.banco.domain.model.Account;
import com.banking.banco.domain.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Optional<Account> getAccountById(UUID id) {
        return accountRepository.findById(id);
    }

    public void createAccount(String owner, BigDecimal initialBalance) {
        Account account = new Account(UUID.randomUUID(), owner, initialBalance);
        accountRepository.save(account);
    }
}
