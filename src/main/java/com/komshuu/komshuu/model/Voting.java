package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;

@Entity
@Table(name = "polls")
public class Voting {
    private long voteID;
    private String voteName;
    private long apartmentID;
    private Date voteDate;
    private boolean voteState;
    private List options;

    public Voting() {
    }

    public Voting(long voteID, String voteName, long apartmentID, Date voteDate, boolean voteState, List options) {
        this.voteID = voteID;
        this.voteName = voteName;
        this.apartmentID = apartmentID;
        this.voteDate = voteDate;
        this.voteState = voteState;
        this.options = options;
    }

    @Id
    @Column(name = "voteId", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getVoteID() {
        return voteID;
    }

    public void setVoteID(long voteID) {
        this.voteID = voteID;
    }

    public String getVoteName() {
        return voteName;
    }

    public void setVoteName(String voteName) {
        this.voteName = voteName;
    }

    public long getApartmentID() {
        return apartmentID;
    }

    public void setApartmentID(long apartmentID) {
        this.apartmentID = apartmentID;
    }

    public Date getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(Date voteDate) {
        this.voteDate = voteDate;
    }

    public boolean isVoteState() {
        return voteState;
    }

    public void setVoteState(boolean voteState) {
        this.voteState = voteState;
    }

    public List getOptions() {
        return options;
    }

    public void setOptions(List options) {
        this.options = options;
    }
}
