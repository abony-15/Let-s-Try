package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DoctorDetailsController implements Initializable {

    @FXML
    private TableView<Doctor> doctorTableView;
    @FXML
    private TableColumn<Doctor, String> nameColumn;
    @FXML
    private TableColumn<Doctor, String> specialtyColumn;
    @FXML
    private TableColumn<Doctor, String> scheduleColumn;
    @FXML
    private TableColumn<Doctor, String> contactNumberColumn;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField specialtyTextField;
    @FXML
    private TextField scheduleTextField;
    @FXML
    private TextField contactNumberTextField;

    private ObservableList<Doctor> doctors = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Bind columns to Doctor properties
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        specialtyColumn.setCellValueFactory(cellData -> cellData.getValue().specialtyProperty());
        scheduleColumn.setCellValueFactory(cellData -> cellData.getValue().scheduleProperty());
        contactNumberColumn.setCellValueFactory(cellData -> cellData.getValue().contactNumberProperty());

        // Set the TableView's items to the list of doctors
        doctorTableView.setItems(doctors);
    }

    @FXML
    private void handleAddDoctor(ActionEvent event) {
        // Collect input data
        String name = nameTextField.getText();
        String specialty = specialtyTextField.getText();
        String schedule = scheduleTextField.getText();
        String contactNumber = contactNumberTextField.getText();

        // Create new Doctor and add to the list
        Doctor newDoctor = new Doctor(name, specialty, schedule, contactNumber);
        doctors.add(newDoctor);

        // Clear input fields after adding
        clearInputFields();
    }

    
    
    // Helper method to clear input fields
    private void clearInputFields() {
        nameTextField.clear();
        specialtyTextField.clear();
        scheduleTextField.clear();
        contactNumberTextField.clear();
    }
}
