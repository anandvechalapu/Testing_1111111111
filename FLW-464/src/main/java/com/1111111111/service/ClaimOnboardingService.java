package com.1111111111.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.1111111111.repository.ClaimOnboardingRepository;

@Service
public class ClaimOnboardingService {

    private ClaimOnboardingRepository claimOnboardingRepository;

    public ClaimOnboardingService(ClaimOnboardingRepository claimOnboardingRepository) {
        this.claimOnboardingRepository = claimOnboardingRepository;
    }

    public void selectModeOfIntimation(String mode) {
        this.claimOnboardingRepository.selectModeOfIntimation(mode);
    }

    public void searchMemberDetailsById(String memberId) {
        this.claimOnboardingRepository.searchMemberDetailsById(memberId);
    }

    public void searchMemberDetailsByPAN(String pan) {
        this.claimOnboardingRepository.searchMemberDetailsByPAN(pan);
    }

    public void searchMemberDetailsByAadhar(String aadhar) {
        this.claimOnboardingRepository.searchMemberDetailsByAadhar(aadhar);
    }

    public void searchMemberDetailsByVoterId(String voterId) {
        this.claimOnboardingRepository.searchMemberDetailsByVoterId(voterId);
    }

    public void addMember() {
        this.claimOnboardingRepository.addMember();
    }

    public void captureTypeOfClaim(String typeOfClaim) {
        this.claimOnboardingRepository.captureTypeOfClaim(typeOfClaim);
    }

    public void captureDateOfEvent(Date dateOfEvent) {
        this.claimOnboardingRepository.captureDateOfEvent(dateOfEvent);
    }

    public void captureCauseOfEvent(String causeOfEvent) {
        this.claimOnboardingRepository.captureCauseOfEvent(causeOfEvent);
    }

    public void doBulkUpload() {
        this.claimOnboardingRepository.doBulkUpload();
    }

    public void save() {
        this.claimOnboardingRepository.save();
    }

    public void selectFurtherProcess() {
        this.claimOnboardingRepository.selectFurtherProcess();
    }

    public void newClaimOnboarding() {
        this.claimOnboardingRepository.newClaimOnboarding();
    }

    public void claimInitiation() {
        this.claimOnboardingRepository.claimInitiation();
    }

}