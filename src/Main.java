import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AadharGenerator aadharGenerator = new AadharGenerator();

        while (true) {
            System.out.println("Enter applicant details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("DOB (dd/mm/yyyy): ");
            String dob = scanner.nextLine();
            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Nationality: ");
            String nationality = scanner.nextLine();

            Applicant applicant = new Applicant();
            applicant.setName(name);
            applicant.setEmail(email);
            applicant.setDob(dob);
            applicant.setContactNumber(contactNumber);
            applicant.setAddress(address);
            applicant.setNationality(nationality);

            aadharGenerator.processAadharApplication(applicant);

            System.out.print("Do you want to enter another applicant? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("\nApplicant Database:");
        aadharGenerator.printApplicantDatabase();
    }
}
