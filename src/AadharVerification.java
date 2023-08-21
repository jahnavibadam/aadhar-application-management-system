public interface AadharVerification {
    boolean verifyName(String name);
    boolean verifyEmail(String email);
    boolean verifyDOB(String dob);
    boolean verifyContactNumber(String contactNumber);
    boolean verifyNationality(String nationality);
}
