package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Transaction {
    
    @Id
    @GeneratedValue()
    private long transactionId;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Security security;

    protected Transaction(){

    }

    public Transaction(LocalDate purchaseDate, double purchasePrice, int quantity, Client client, Security security){
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.client = client;
        this.security = security;
    }

    public long getTransactionId(){
        return transactionId;
    }

    public LocalDate getPurchaseDate(){
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public double getPurchasePrice(){
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public Security getSecurity(){
        return security;
    }

    public void setSecurity(Security security){
        this.security = security;
    }
}
