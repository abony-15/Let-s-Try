package mainpkg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ReceptionistDetailsController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private ComboBox<String> startTimeComboBox;
    @FXML
    private ComboBox<String> endTimeComboBox;
    @FXML
    private DatePicker dobDatePicker;
    @FXML
    private Button submitButton;
    @FXML
    private TableView<Receptionist> nurseTableView;
    @FXML
    private TableColumn<Receptionist, String> nameColumn;
    @FXML
    private TableColumn<Receptionist, String> emailColumn;
    @FXML
    private TableColumn<Receptionist, String> phoneNumberColumn;
    @FXML
    private TableColumn<Receptionist, String> dobColumn;
    @FXML
    private TableColumn<Receptionist, String> startTimeColumn;
    @FXML
    private TableColumn<Receptionist, String> endTimeColumn;
    @FXML
    private Button deleteButton;

    private final ObservableList<Receptionist> receptionistList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize ComboBoxes
        startTimeComboBox.getItems().addAll("9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM");
        endTimeComboBox.getItems().addAll("3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM");

        // Initialize TableView columns
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        phoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        dobColumn.setCellValueFactory(new PropertyValueFactory<>("dob"));
        startTimeColumn.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        endTimeColumn.setCellValueFactory(new PropertyValueFactory<>("endTime"));

        // Set TableView items
        nurseTableView.setItems(receptionistList);
    }

    @FXML
    private void handleSubmitAction(ActionEvent event) {
        String name = nameField.getText();
        String email = emailField.getText();
        String phoneNumber = phoneNumberField.getText();
        LocalDate dob = dobDatePicker.getValue();
        String startTime = startTimeComboBox.getValue();
        String endTime = endTimeComboBox.getValue();

        if (name != null && !name.isEmpty() && email != null && !email.isEmpty() && phoneNumber != null && !phoneNumber.isEmpty() && dob != null && startTime != null && endTime != null) {
            Receptionist newReceptionist = new Receptionist(name, email, phoneNumber, dob, startTime, endTime);
            receptionistList.add(newReceptionist);
            clearFields();
        } else {
            // Handle empty fields or invalid input
            System.out.println("Please fill in all fields.");
        }
    }

    @FXML
    private void handleDeleteAction(ActionEvent event) {
        Receptionist selectedReceptionist = nurseTableView.getSelectionModel().getSelectedItem();
        if (selectedReceptionist != null) {
            receptionistList.remove(selectedReceptionist);
        } else {
            // Handle no selection
            System.out.println("Please select a receptionist to delete.");
        }
    }

    private void clearFields() {
        nameField.clear();
        emailField.clear();
        phoneNumberField.clear();
        dobDatePicker.setValue(null);
        startTimeComboBox.setValue(null);
        endTimeComboBox.setValue(null);
    }
}
