package com.banking.banco.web.controller;

import com.banking.banco.application.service.TransactionService;
import com.banking.banco.domain.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{accountId}")
    public List<Transaction> getTransactionsByAccount(@PathVariable UUID accountId) {
        return transactionService.getTransactionsByAccountId(accountId);
    }

    @PostMapping
    public boolean processTransaction(@RequestParam UUID accountId, @RequestParam BigDecimal amount) {
        return transactionService.processTransaction(accountId, amount);
    }
}

