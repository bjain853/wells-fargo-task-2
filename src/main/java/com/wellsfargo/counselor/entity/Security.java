package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Security{
    @Id
    @GeneratedValue()
    private long securityId;
    private String name;

    @Enumerated(EnumType.STRING)
    private SecurityCategory category;

    private float purchasePrice;

    private Date purchaseDate;

    private float quantity;

    protected Security(){}

    public Security(String name,SecurityCategory category,float purchasePrice,float quantity,Date purchaseDate){
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public SecurityCategory getCategory() {
        return category;
    }


    public void setName(String name) {
        this.name = name;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchase_price) {
        this.purchasePrice = purchase_price;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setCategory(SecurityCategory category) {
        this.category = category;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }


}


