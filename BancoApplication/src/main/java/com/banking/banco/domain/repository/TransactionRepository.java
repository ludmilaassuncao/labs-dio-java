package com.banking.banco.domain.repository;

import com.banking.banco.domain.model.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransactionRepository {
    List<Transaction> findByAccountId(UUID accountId);
    void save(Transaction transaction);
}
