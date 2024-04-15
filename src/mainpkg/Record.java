package mainpkg;

import java.time.LocalDate;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class Record {
    private final SimpleStringProperty patientId;
    private final SimpleObjectProperty<LocalDate> appointmentDate;
    private final SimpleStringProperty appointmentTime;

    public Record(String patientId, LocalDate appointmentDate, String appointmentTime) {
        this.patientId = new SimpleStringProperty(patientId);
        this.appointmentDate = new SimpleObjectProperty<>(appointmentDate);
        this.appointmentTime = new SimpleStringProperty(appointmentTime);
    }

    public String getPatientId() {
        return patientId.get();
    }

    public void setPatientId(String patientId) {
        this.patientId.set(patientId);
    }

    public SimpleStringProperty patientIdProperty() {
        return patientId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate.get();
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate.set(appointmentDate);
    }

    public SimpleObjectProperty<LocalDate> appointmentDateProperty() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime.get();
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime.set(appointmentTime);
    }

    public SimpleStringProperty appointmentTimeProperty() {
        return appointmentTime;
    }
}
