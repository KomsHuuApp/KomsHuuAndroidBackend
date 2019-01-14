package com.komshuu.komshuu.model;

/**
 * @author ecyamak
 */

import javax.persistence.*;

@Entity
@Table(name = "emergencynumbers")
public class EmergencyCallNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numberId;
    private String name;
    private String phoneNumber;
    private long apartmentId;

    public EmergencyCallNumber(){

    }

    public EmergencyCallNumber(long numberId, String name, String phoneNumber, long apartmentId) {
        this.numberId = numberId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.apartmentId = apartmentId;
    }

    public long getId() {
        return numberId;
    }

    public void setId(long numberId) {
        this.numberId = numberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }
}
