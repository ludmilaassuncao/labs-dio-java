package com.banking.banco.infrastructure.repository;

import com.banking.banco.domain.model.Transaction;
import com.banking.banco.domain.repository.TransactionRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    @Override
    public List<Transaction> findByAccountId(UUID accountId) {
        return transactions.stream()
                .filter(tx -> tx.getAccountId().equals(accountId))
                .toList();
    }

    @Override
    public void save(Transaction transaction) {
        transactions.add(transaction);
    }
}
