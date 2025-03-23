package com.banking.banco.domain.repository;

import com.banking.banco.domain.model.Account;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountRepository {
    List<Account> findAll();
    Optional<Account> findById(UUID id);
    void save(Account account);
}
