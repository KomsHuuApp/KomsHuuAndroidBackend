package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "complaints")
public class Complaint {
    @Id
    @Column(name = "complaintId", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long complaintId;
    private String date;
    private long personId;
    private String text;
    private long apartmentId;

    public Complaint() {
    }

    public Complaint(long complaintID, String date, long personID, String text, long apartmentId) {
        this.personId = personID;
        this.complaintId = complaintID;
        this.date = date;
        this.text = text;
        this.apartmentId = apartmentId;
    }

    public long getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(long complaintID) {
        this.complaintId = complaintID;
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

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }
}
