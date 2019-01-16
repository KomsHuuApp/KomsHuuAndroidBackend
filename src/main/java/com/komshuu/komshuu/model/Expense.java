package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "expenses")
public class Expense {

    private long expenseId;
    private double totalMoneySpent;
    private String statement;
    private Date expenseDate;
    private long apartmentId;

    public void Expense() {

    }

    public void Expense(long expenseId, double totalMoneySpent, String statement, Date expenseDate, long apartmentId) {
        this.expenseId = expenseId;
        this.totalMoneySpent = totalMoneySpent;
        this.statement = statement;
        this.expenseDate = expenseDate;
        this.apartmentId = apartmentId;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(double totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }

    @Id
    @Column(name = "expenseId", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(long expenseId) {
        this.expenseId = expenseId;
    }
}
