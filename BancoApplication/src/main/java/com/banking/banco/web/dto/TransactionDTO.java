package com.banking.banco.web.dto;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class TransactionDTO {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionDTO that = (TransactionDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(accountId, that.accountId) && Objects.equals(amount, that.amount) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, amount, timestamp);
    }

    public TransactionDTO() {
    }

    public TransactionDTO(LocalDateTime timestamp, BigDecimal amount, UUID accountId, UUID id) {
        this.timestamp = timestamp;
        this.amount = amount;
        this.accountId = accountId;
        this.id = id;
    }
}
