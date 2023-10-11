package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Portfolio{

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToMany
    private List<Security> securities;

    private long clientId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDateTime;

    
    protected Portfolio(){}

    public Portfolio(long clientId,Date creationDateTime){
        this.clientId = clientId;
        this.securities = new ArrayList<>();
        this.creationDateTime = creationDateTime;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void addSecuritY(Security security) {
        this.securities.add(security);
    }

    public void deleteSecurity(Security security){
        this.securities.remove(security);
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }


}