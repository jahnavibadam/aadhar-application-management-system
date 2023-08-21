public class Applicant {
    private String name;
    private String email;
    private String dob;
    private String contactNumber;
    private String address;
    private String nationality;
    private String aadharNumber;

    // Constructors

    public Applicant() {
        // Default constructor
    }

    public Applicant(String name, String email, String dob, String contactNumber, String address, String nationality) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.contactNumber = contactNumber;
        this.address = address;
        this.nationality = nationality;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
}
