package mainpkg;

import java.time.LocalDate;

public class Patient {
    private String name;
    private LocalDate dateOfBirth;
    private String contactNumber;
    private String medicalHistory;

    // Constructor
    public Patient(String name, LocalDate dateOfBirth, String contactNumber, String medicalHistory) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.medicalHistory = medicalHistory;
    }

    // Name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // DateOfBirth getter and setter
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // ContactNumber getter and setter
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // MedicalHistory getter and setter
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
