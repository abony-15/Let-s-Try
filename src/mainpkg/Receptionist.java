package mainpkg;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Receptionist {

    private final StringProperty name;
    private final StringProperty email;
    private final StringProperty phoneNumber;
    private final StringProperty dob;
    private final StringProperty startTime;
    private final StringProperty endTime;

    public Receptionist(String name, String email, String phoneNumber, LocalDate dob, String startTime, String endTime) {
        this.name = new SimpleStringProperty(name);
        this.email = new SimpleStringProperty(email);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.dob = new SimpleStringProperty(dob.toString()); // Convert LocalDate to String
        this.startTime = new SimpleStringProperty(startTime);
        this.endTime = new SimpleStringProperty(endTime);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public String getDob() {
        return dob.get();
    }

    public void setDob(String dob) {
        this.dob.set(dob);
    }

    public String getStartTime() {
        return startTime.get();
    }

    public void setStartTime(String startTime) {
        this.startTime.set(startTime);
    }

    public String getEndTime() {
        return endTime.get();
    }

    public void setEndTime(String endTime) {
        this.endTime.set(endTime);
    }
}
