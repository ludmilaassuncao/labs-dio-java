package com.banking.banco.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private UUID accountId;
    private BigDecimal amount;
    private LocalDateTime timestamp;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Transaction() {
    }

    public Transaction(UUID id, UUID accountId, BigDecimal amount, LocalDateTime timestamp) {
        this.id = id;
        this.accountId = accountId;
        this.amount = amount;
        this.timestamp = timestamp;
    }
}
