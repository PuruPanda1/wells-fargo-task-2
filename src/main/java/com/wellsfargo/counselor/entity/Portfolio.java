package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Timestamp;

public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long totalAmount;

    @Column(nullable = false)
    private Timestamp timestamp;

    @Column(nullable = false)
    private String clientId;

    public Portfolio(long totalAmount, Timestamp timestamp, String clientId) {
        this.totalAmount = totalAmount;
        this.timestamp = timestamp;
        this.clientId = clientId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
