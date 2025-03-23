package com.banking.banco.infrastructure.repository;

import com.banking.banco.domain.model.Account;
import com.banking.banco.domain.repository.AccountRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    private final Map<UUID, Account> accounts = new HashMap<>();

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accounts.values());
    }

    @Override
    public Optional<Account> findById(UUID id) {
        return Optional.ofNullable(accounts.get(id));
    }

    @Override
    public void save(Account account) {
        accounts.put(account.getId(), account);
    }
}
