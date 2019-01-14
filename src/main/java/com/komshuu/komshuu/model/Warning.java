package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "warnings")
public class Warning {
    private long warningId;
    private long flatNumber;
    private String warningText;
    private long personId;
    private Date warningDate;

    public Warning() {

    }

    public Warning(long warningId, long flatNumber, String warningText, long personId, Date warningDate) {
        this.setWarningId(warningId);
        this.setFlatNumber(flatNumber);
        this.setWarningText(warningText);
        this.setPersonId(personId);
        this.setWarningDate(warningDate);
    }

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getWarningId() {
        return warningId;
    }

    public void setWarningId(long warningId) {
        this.warningId = warningId;
    }

    public long getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(long flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getWarningText() {
        return warningText;
    }

    public void setWarningText(String warningText) {
        this.warningText = warningText;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public Date getWarningDate() {
        return warningDate;
    }

    public void setWarningDate(Date warningDate) {
        this.warningDate = warningDate;
    }
}
