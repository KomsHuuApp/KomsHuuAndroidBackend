package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "revenues")
public class Revenue {
    private long revenueID;
    private Date date;
    private double totalAmount;
    private String statement;
    private long apartmentID;

    public Revenue() {
    }

    public Revenue(Date date, double totalAmount, String statement, long apartmentID) {
        this.date = date;
        this.totalAmount = totalAmount;
        this.statement = statement;
        this.apartmentID = apartmentID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public long getApartmentID() {
        return apartmentID;
    }

    public void setApartmentID(long apartmentID) {
        this.apartmentID = apartmentID;
    }

    @Id
    @Column(name = "revenueId", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getRevenueID() {
        return revenueID;
    }

    public void setRevenueID(long revenueID) {
        this.revenueID = revenueID;
    }
}
