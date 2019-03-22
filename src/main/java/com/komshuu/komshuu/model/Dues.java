package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "fees")

public class Dues {

    private long duesId;
    private double totalPayment;
    private long apartmentId;
    private long flatNumber;
    private String paymentDate;

    public void Dues() {

    }


    public void Dues(long duesId, double totalPayment, long apartmentId, long flatNumber, String paymentDate) {
        this.duesId = duesId;
        this.totalPayment = totalPayment;
        this.apartmentId = apartmentId;
        this.flatNumber = flatNumber;
        this.paymentDate = paymentDate;


    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public long getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(long flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Id
    @Column(name = "duesId", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getDuesId() {
        return duesId;
    }

    public void setDuesId(long duesId) {
        this.duesId = duesId;
    }
}