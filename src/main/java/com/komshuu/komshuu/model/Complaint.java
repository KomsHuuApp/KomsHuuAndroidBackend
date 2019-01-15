package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "complaints")
public class Complaint {
    private long complaintID;
    private Date date;
    private long personID;
    private String text;

    public Complaint() {
    }

    public Complaint(long complaintID, Date date, long personID, String text) {
        this.personID = personID;
        this.complaintID = complaintID;
        this.date = date;
        this.text = text;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getPersonID() {
        return personID;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
    }


}
