package com.banking.banco.application.service;

import com.banking.banco.domain.model.Account;
import com.banking.banco.domain.model.Transaction;
import com.banking.banco.domain.repository.AccountRepository;
import com.banking.banco.domain.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;

    public TransactionService(TransactionRepository transactionRepository, AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    public List<Transaction> getTransactionsByAccountId(UUID accountId) {
        return transactionRepository.findByAccountId(accountId);
    }

    public boolean processTransaction(UUID accountId, BigDecimal amount) {
        Optional<Account> accountOpt = accountRepository.findById(accountId);
        if (accountOpt.isPresent()) {
            Account account = accountOpt.get();
            BigDecimal newBalance = account.getBalance().add(amount);
            if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
                return false;
            }
            account.setBalance(newBalance);
            accountRepository.save(account);

            Transaction transaction = new Transaction(UUID.randomUUID(), accountId, amount, LocalDateTime.now());
            transactionRepository.save(transaction);
            return true;
        }
        return false;
    }
}
