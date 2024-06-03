package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Securities {

    @Id
    @GeneratedValue
    private long securitiesId;

    @Column(nullable = false)
    private String securitiesName;

    @Column(nullable = false)
    private String securitiesCategory;

    @Column(nullable = false)
    private String securitiesPurchaseDate;

    @Column(nullable = false)
    private String securitiesPurchasePrice;

    @Column(nullable = false)
    private String securitiesQuantity;

    @Column(nullable = false)
    private long portfolioId;

    public Securities(String securitiesName, String securitiesCategory, String securitiesPurchaseDate, String securitiesPurchasePrice, String securitiesQuantity, long portfolioId) {
        this.securitiesName = securitiesName;
        this.securitiesCategory = securitiesCategory;
        this.securitiesPurchaseDate = securitiesPurchaseDate;
        this.securitiesPurchasePrice = securitiesPurchasePrice;
        this.securitiesQuantity = securitiesQuantity;
        this.portfolioId = portfolioId;
    }

    public long getSecuritiesId() {
        return securitiesId;
    }

    public String getSecuritiesName() {
        return securitiesName;
    }

    public void setSecuritiesName(String securitiesName) {
        this.securitiesName = securitiesName;
    }

    public String getSecuritiesCategory() {
        return securitiesCategory;
    }

    public void setSecuritiesCategory(String securitiesCategory) {
        this.securitiesCategory = securitiesCategory;
    }

    public String getSecuritiesPurchaseDate() {
        return securitiesPurchaseDate;
    }

    public void setSecuritiesPurchaseDate(String securitiesPurchaseDate) {
        this.securitiesPurchaseDate = securitiesPurchaseDate;
    }

    public String getSecuritiesPurchasePrice() {
        return securitiesPurchasePrice;
    }

    public void setSecuritiesPurchasePrice(String securitiesPurchasePrice) {
        this.securitiesPurchasePrice = securitiesPurchasePrice;
    }

    public String getSecuritiesQuantity() {
        return securitiesQuantity;
    }

    public void setSecuritiesQuantity(String securitiesQuantity) {
        this.securitiesQuantity = securitiesQuantity;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }
}
