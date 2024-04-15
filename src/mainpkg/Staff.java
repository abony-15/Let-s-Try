package mainpkg;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Staff {
    private final StringProperty name;
    private final StringProperty staffID;
    private final StringProperty contactDetails;
    private final StringProperty workingHours;
    private final StringProperty responsibilities;

    public Staff(String name, String staffID, String contactDetails, String workingHours, String responsibilities) {
        this.name = new SimpleStringProperty(name);
        this.staffID = new SimpleStringProperty(staffID);
        this.contactDetails = new SimpleStringProperty(contactDetails);
        this.workingHours = new SimpleStringProperty(workingHours);
        this.responsibilities = new SimpleStringProperty(responsibilities);
    }

    // Name property
    public StringProperty nameProperty() {
        return name;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    // StaffID property
    public StringProperty staffIDProperty() {
        return staffID;
    }

    public String getStaffID() {
        return staffID.get();
    }

    public void setStaffID(String staffID) {
        this.staffID.set(staffID);
    }

    // ContactDetails property
    public StringProperty contactDetailsProperty() {
        return contactDetails;
    }

    public String getContactDetails() {
        return contactDetails.get();
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails.set(contactDetails);
    }

    // WorkingHours property
    public StringProperty workingHoursProperty() {
        return workingHours;
    }

    public String getWorkingHours() {
        return workingHours.get();
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours.set(workingHours);
    }

    // Responsibilities property
    public StringProperty responsibilitiesProperty() {
        return responsibilities;
    }

    public String getResponsibilities() {
        return responsibilities.get();
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities.set(responsibilities);
    }
}
