package com.1111111111.model;

import java.util.Date;

public class ClaimOnboarding {

    private String mode;
    private String memberId;
    private String pan;
    private String aadhar;
    private String voterId;
    private String typeOfClaim;
    private Date dateOfEvent;
    private String causeOfEvent;
    private String furtherProcess;

    public ClaimOnboarding() {}

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getTypeOfClaim() {
        return typeOfClaim;
    }

    public void setTypeOfClaim(String typeOfClaim) {
        this.typeOfClaim = typeOfClaim;
    }

    public Date getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public String getCauseOfEvent() {
        return causeOfEvent;
    }

    public void setCauseOfEvent(String causeOfEvent) {
        this.causeOfEvent = causeOfEvent;
    }

    public String getFurtherProcess() {
        return furtherProcess;
    }

    public void setFurtherProcess(String furtherProcess) {
        this.furtherProcess = furtherProcess;
    }
}