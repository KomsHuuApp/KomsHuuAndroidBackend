package com.komshuu.komshuu.model;

import javax.persistence.*;

/**
 * @author ecyamak
 */

@Entity
@Table(name = "options")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long optionId;
    private String status;
    private long pollId;
    private int pollNumber;

    public Option() {

    }

    public Option(long optionId, String status, long pollId, int pollNumber) {
        this.optionId = optionId;
        this.status = status;
        this.pollId = pollId;
        this.pollNumber = pollNumber;
    }

    public long getOptionId() {
        return optionId;
    }

    public void setOptionId(long optionId) {
        this.optionId = optionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getPollId() {
        return pollId;
    }

    public void setPollId(long pollId) {
        this.pollId = pollId;
    }

    public int getPollNumber() {
        return pollNumber;
    }

    public void setPollNumber(int pollNumber) {
        this.pollNumber = pollNumber;
    }
}
