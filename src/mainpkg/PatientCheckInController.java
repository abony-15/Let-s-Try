package mainpkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PatientCheckInController implements Initializable {

    @FXML
    private TextField patientIdField;
    @FXML
    private DatePicker appointmentDatePicker;
    @FXML
    private TextField appointmentTimeField;
    @FXML
    private Button submitButton;
    @FXML
    private Button checkRecordsButton;
    @FXML
    private TableView<Record> recordsTableView;
    @FXML
    private TableColumn<Record, String> patientIdColumn;
    @FXML
    private TableColumn<Record, LocalDate> appointmentDateColumn;
    @FXML
    private TableColumn<Record, String> appointmentTimeColumn;

    // ObservableList to store records
    private ObservableList<Record> records = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize TableView columns
        patientIdColumn.setCellValueFactory(cellData -> cellData.getValue().patientIdProperty());
        appointmentDateColumn.setCellValueFactory(cellData -> cellData.getValue().appointmentDateProperty());
        appointmentTimeColumn.setCellValueFactory(cellData -> cellData.getValue().appointmentTimeProperty());

        // Set the items to the TableView
        recordsTableView.setItems(records);
    }

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        // Retrieve data from fields
        String patientId = patientIdField.getText();
        LocalDate appointmentDate = appointmentDatePicker.getValue();
        String appointmentTime = appointmentTimeField.getText();

        // Create a new record
        Record newRecord = new Record(patientId, appointmentDate, appointmentTime);

        // Add the new record to the list
        records.add(newRecord);

        // Clear input fields after submitting
        clearInputFields();
    }

    @FXML
    private void handleCheckRecordsButtonAction(ActionEvent event) {
        // Explicitly refresh the TableView to display existing records
        recordsTableView.refresh();
    }

    private void clearInputFields() {
        // Clear input fields
        patientIdField.clear();
        appointmentDatePicker.setValue(null);
        appointmentTimeField.clear();
    }
}
