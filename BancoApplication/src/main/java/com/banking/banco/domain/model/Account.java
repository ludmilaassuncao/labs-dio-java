package com.banking.banco.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Account {
    private UUID id;
    private String owner;
    private BigDecimal balance;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Account(UUID id, String owner, BigDecimal balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public Account() {
    }
}
