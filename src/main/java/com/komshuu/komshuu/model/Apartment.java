package com.komshuu.komshuu.model;

import javax.persistence.*;

/**
 * @author sozboke
 */
@Entity
@Table(name = "apartments")
public class Apartment {
    private long apartmentId;
    private String name;
    private String address;
    private String flatNumber;

    public Apartment() {

    }

    public Apartment(long apartmentId, String name, String address, String flatNumber) {
        this.apartmentId = apartmentId;
        this.name = name;
        this.address = address;
        this.flatNumber = flatNumber;
    }

    @Id
    @Column(name = "apartmentId", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}
