package com.banking.banco.web.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class AccountDTO {
    private UUID id;
    private String owner;
    private BigDecimal balance;

    public AccountDTO() {
    }

    public AccountDTO(UUID id, String owner, BigDecimal balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

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
}
