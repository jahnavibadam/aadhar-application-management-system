import java.util.regex.*;
import java.util.*;

public class AadharGenerator implements AadharVerification {
    private Map<String, Applicant> applicantDatabase = new HashMap<>();
    private int currentAadharNumber = 100000000;

    // Constructor

    @Override
    public boolean verifyName(String name) {
        return name != null && name.matches("^[a-zA-Z\\s]+$");
    }

    @Override
    public boolean verifyEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    @Override
    public boolean verifyDOB(String dob) {
        return dob != null && dob.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }

    @Override
    public boolean verifyContactNumber(String contactNumber) {
        return contactNumber != null && contactNumber.matches("^\\d{10}$");
    }

    @Override
    public boolean verifyNationality(String nationality) {
        return nationality != null && nationality.equals("Indian");
    }

    public void processAadharApplication(Applicant applicant) {
        if (verifyName(applicant.getName()) &&
                verifyEmail(applicant.getEmail()) &&
                verifyDOB(applicant.getDob()) &&
                verifyContactNumber(applicant.getContactNumber()) &&
                verifyNationality(applicant.getNationality())) {

            generateAadharNumber(applicant);
            applicantDatabase.put(applicant.getName(), applicant);
            System.out.println("Aadhar Card generated successfully for " + applicant.getName());
        } else {
            System.out.println("Aadhar Card verification failed for " + applicant.getName());
        }
    }

    private void generateAadharNumber(Applicant applicant) {
        String aadharNumber = String.valueOf(currentAadharNumber);
        aadharNumber = "0".repeat(Math.max(0, 12 - aadharNumber.length())) + aadharNumber;
        applicant.setAadharNumber(aadharNumber);
        currentAadharNumber++;
    }

    public void printApplicantDatabase() {
        for (Applicant applicant : applicantDatabase.values()) {
            System.out.println("Name: " + applicant.getName());
            System.out.println("Aadhar Number: " + applicant.getAadharNumber());
            System.out.println();
        }
    }
}
