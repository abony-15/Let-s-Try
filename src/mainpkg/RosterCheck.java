package mainpkg;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.time.LocalDate;

public class RosterCheck {
    private final StringProperty nurseName = new SimpleStringProperty(this, "nurseName");
    private final StringProperty shift = new SimpleStringProperty(this, "shift");
    private final StringProperty date = new SimpleStringProperty(this, "date");
    private final StringProperty id = new SimpleStringProperty(this, "id");

    public RosterCheck(String nurseName, String shift, LocalDate date, String id) {
        this.nurseName.set(nurseName);
        this.shift.set(shift);
        this.date.set(date.toString());
        this.id.set(id);
    }

    // Getters and setters
    public String getNurseName() { return nurseName.get(); }
    public StringProperty nurseNameProperty() { return nurseName; }
    public void setNurseName(String nurseName) { this.nurseName.set(nurseName); }

    public String getShift() { return shift.get(); }
    public StringProperty shiftProperty() { return shift; }
    public void setShift(String shift) { this.shift.set(shift); }

    public String getDate() { return date.get(); }
    public StringProperty dateProperty() { return date; }
    public void setDate(LocalDate date) { this.date.set(date.toString()); }

    public String getId() { return id.get(); }
    public StringProperty idProperty() { return id; }
    public void setId(String id) { this.id.set(id); }
}
