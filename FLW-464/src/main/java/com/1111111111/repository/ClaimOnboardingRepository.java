@Repository
public interface ClaimOnboardingRepository {
    void selectModeOfIntimation(String mode);
    void searchMemberDetailsById(String memberId);
    void searchMemberDetailsByPAN(String pan);
    void searchMemberDetailsByAadhar(String aadhar);
    void searchMemberDetailsByVoterId(String voterId);
    void addMember();
    void captureTypeOfClaim(String typeOfClaim);
    void captureDateOfEvent(Date dateOfEvent);
    void captureCauseOfEvent(String causeOfEvent);
    void doBulkUpload();
    void save();
    void selectFurtherProcess();
    void newClaimOnboarding();
    void claimInitiation();
}