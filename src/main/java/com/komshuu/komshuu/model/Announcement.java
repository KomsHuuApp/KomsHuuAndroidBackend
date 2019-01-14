package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "announcements")
public class Announcement {
    private long announcementId;
    private String text;
    private long apartmentId;
    private Date announcementDate;
    private int announcementImportance;
    private long announcerId;

    public Announcement() {

    }

    public Announcement(long announcementId, String text, long apartmentId, Date announcementDate, int announcementImportance, long announcerId) {
        this.setAnnouncementId(announcementId);
        this.setText(text);
        this.setApartmentId(apartmentId);
        this.setAnnouncementDate(announcementDate);
        this.setAnnouncementImportance(announcementImportance);
        this.setAnnouncerId(announcerId);
    }

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(long announcementId) {
        this.announcementId = announcementId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Date getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(Date announcementDate) {
        this.announcementDate = announcementDate;
    }

    public int getAnnouncementImportance() {
        return announcementImportance;
    }

    public void setAnnouncementImportance(int announcementImportance) {
        this.announcementImportance = announcementImportance;
    }

    public long getAnnouncerId() {
        return announcerId;
    }

    public void setAnnouncerId(long announcerId) {
        this.announcerId = announcerId;
    }
}
