package com.1111111111.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.1111111111.service.ClaimOnboardingService;

@RestController
@RequestMapping("/claimOnboarding")
public class ClaimOnboardingController {

    @Autowired
    private ClaimOnboardingService claimOnboardingService;

    @PostMapping("/selectModeOfIntimation")
    public void selectModeOfIntimation(@RequestParam String mode) {
        claimOnboardingService.selectModeOfIntimation(mode);
    }

    @PostMapping("/searchMemberDetailsById")
    public void searchMemberDetailsById(@RequestParam String memberId) {
        claimOnboardingService.searchMemberDetailsById(memberId);
    }

    @PostMapping("/searchMemberDetailsByPAN")
    public void searchMemberDetailsByPAN(@RequestParam String pan) {
        claimOnboardingService.searchMemberDetailsByPAN(pan);
    }

    @PostMapping("/searchMemberDetailsByAadhar")
    public void searchMemberDetailsByAadhar(@RequestParam String aadhar) {
        claimOnboardingService.searchMemberDetailsByAadhar(aadhar);
    }

    @PostMapping("/searchMemberDetailsByVoterId")
    public void searchMemberDetailsByVoterId(@RequestParam String voterId) {
        claimOnboardingService.searchMemberDetailsByVoterId(voterId);
    }

    @PostMapping("/addMember")
    public void addMember() {
        claimOnboardingService.addMember();
    }

    @PostMapping("/captureTypeOfClaim")
    public void captureTypeOfClaim(@RequestParam String typeOfClaim) {
        claimOnboardingService.captureTypeOfClaim(typeOfClaim);
    }

    @PostMapping("/captureDateOfEvent")
    public void captureDateOfEvent(@RequestParam Date dateOfEvent) {
        claimOnboardingService.captureDateOfEvent(dateOfEvent);
    }

    @PostMapping("/captureCauseOfEvent")
    public void captureCauseOfEvent(@RequestParam String causeOfEvent) {
        claimOnboardingService.captureCauseOfEvent(causeOfEvent);
    }

    @PostMapping("/doBulkUpload")
    public void doBulkUpload() {
        claimOnboardingService.doBulkUpload();
    }

    @PostMapping("/save")
    public void save() {
        claimOnboardingService.save();
    }

    @PostMapping("/selectFurtherProcess")
    public void selectFurtherProcess() {
        claimOnboardingService.selectFurtherProcess();
    }

    @PostMapping("/newClaimOnboarding")
    public void newClaimOnboarding() {
        claimOnboardingService.newClaimOnboarding();
    }

    @PostMapping("/claimInitiation")
    public void claimInitiation() {
        claimOnboardingService.claimInitiation();
    }

}