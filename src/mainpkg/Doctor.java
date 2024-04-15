package mainpkg;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Doctor {
    private final StringProperty name;
    private final StringProperty specialty;
    private final StringProperty schedule;
    private final StringProperty contactNumber;

    public Doctor(String name, String specialty, String schedule, String contactNumber) {
        this.name = new SimpleStringProperty(name);
        this.specialty = new SimpleStringProperty(specialty);
        this.schedule = new SimpleStringProperty(schedule);
        this.contactNumber = new SimpleStringProperty(contactNumber);
    }

    // Getter and setter for name
    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    // Getter and setter for specialty
    public String getSpecialty() {
        return specialty.get();
    }

    public void setSpecialty(String specialty) {
        this.specialty.set(specialty);
    }

    public StringProperty specialtyProperty() {
        return specialty;
    }

    // Getter and setter for schedule
    public String getSchedule() {
        return schedule.get();
    }

    public void setSchedule(String schedule) {
        this.schedule.set(schedule);
    }

    public StringProperty scheduleProperty() {
        return schedule;
    }

    // Getter and setter for contactNumber
    public String getContactNumber() {
        return contactNumber.get();
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber.set(contactNumber);
    }

    public StringProperty contactNumberProperty() {
        return contactNumber;
    }
}
