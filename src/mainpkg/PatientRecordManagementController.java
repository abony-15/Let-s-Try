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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PatientRecordManagementController implements Initializable {

    @FXML
    private TextField patientNameField;
    @FXML
    private DatePicker dateOfBirthPicker;
    @FXML
    private TextField contactNumberField;
    @FXML
    private TextArea medicalHistoryArea;
    @FXML
    private Button saveRecordButton;
    @FXML
    private Button checkRecordButton;
    @FXML
    private TableView<Patient> patientRecordTable; // Use Patient as the type
    @FXML
    private TableColumn<Patient, String> patientNameColumn; // Adjusted types
    @FXML
    private TableColumn<Patient, LocalDate> dateOfBirthColumn; // Adjusted types
    @FXML
    private TableColumn<Patient, String> contactNumberColumn; // Adjusted types
    @FXML
    private TableColumn<Patient, String> medicalHistoryColumn; // Adjusted types

    private ObservableList<Patient> patientRecords = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Bind columns to Patient properties
        patientNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        dateOfBirthColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));
        contactNumberColumn.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));
        medicalHistoryColumn.setCellValueFactory(new PropertyValueFactory<>("medicalHistory"));

        // Set the TableView's items to our ObservableList
        patientRecordTable.setItems(patientRecords);
    }

    @FXML
    private void handleSaveRecord(ActionEvent event) {
        // Collect input data
        String name = patientNameField.getText();
        LocalDate dateOfBirth = dateOfBirthPicker.getValue();
        String contactNumber = contactNumberField.getText();
        String medicalHistory = medicalHistoryArea.getText();

        // Create new Patient and add to the list
        Patient newPatient = new Patient(name, dateOfBirth, contactNumber, medicalHistory);
        patientRecords.add(newPatient);

        // Optional: Clear inputs after saving
        clearInputFields();
    }

    @FXML
    private void handleCheckRecord(ActionEvent event) {
        // For this example, we'll focus the table and select the first item
        if (!patientRecords.isEmpty()) {
            patientRecordTable.requestFocus();
            patientRecordTable.getSelectionModel().selectFirst();
            patientRecordTable.scrollTo(0);
        }
    }
    
    private void clearInputFields() {
        patientNameField.clear();
        dateOfBirthPicker.setValue(null);
        contactNumberField.clear();
        medicalHistoryArea.clear();
    }
}
