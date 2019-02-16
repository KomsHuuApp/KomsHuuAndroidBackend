package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "complaints")
public class Complaint {
    private long complaintID;
    private String date;
    private long personID;
    private String text;
    private long apartmentId;

    public Complaint() {
    }

    public Complaint(long complaintID, String date, long personID, String text, long apartmentId) {
        this.personID = personID;
        this.complaintID = complaintID;
        this.date = date;
        this.text = text;
        this.apartmentId = apartmentId;
    }

    @Id
    @Column(name = "complaintId", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getComplaintID() {
        return complaintID;
    }

    public void setComplaintID(long complaintID) {
        this.complaintID = complaintID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getPersonID() {
        return personID;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }
}
