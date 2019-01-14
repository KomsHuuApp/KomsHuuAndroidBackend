package com.komshuu.komshuu.model;

import javax.persistence.*;

@Entity
@Table(name = "flats")
public class Flat {
    private long flatId;
    private int flatNumber;
    private long apartmentId;

    public Flat() {

    }

    public Flat(long flatId, int flatNumber, long apartmentId) {
        this.flatId = flatId;
        this.flatNumber = flatNumber;
        this.apartmentId = apartmentId;
    }

    @Id
    @Column(name = "flatId", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getFlatId() {
        return flatId;
    }

    public void setFlatId(long flatId) {
        this.flatId = flatId;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }
}
