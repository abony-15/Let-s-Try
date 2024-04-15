/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class StaffDetailsController {

    @FXML
    private TableView<Staff> staffTableView;
    @FXML
    private TableColumn<Staff, String> staffIDColumn;
    @FXML
    private TableColumn<Staff, String> nameColumn;
    @FXML
    private TableColumn<Staff, String> contactDetailsColumn;
    @FXML
    private TableColumn<Staff, String> workingHoursColumn;
    @FXML
    private TableColumn<Staff, String> responsibilitiesColumn;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField staffIDTextField;
    @FXML
    private TextField contactDetailsTextField;
    @FXML
    private TextField workingHoursTextField;
    @FXML
    private TextField responsibilitiesTextField;

    // Create an ObservableList to store staff data
    private ObservableList<Staff> staffList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        // Link columns to appropriate properties in the Staff class
        staffIDColumn.setCellValueFactory(cellData -> cellData.getValue().staffIDProperty());
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        contactDetailsColumn.setCellValueFactory(cellData -> cellData.getValue().contactDetailsProperty());
        workingHoursColumn.setCellValueFactory(cellData -> cellData.getValue().workingHoursProperty());
        responsibilitiesColumn.setCellValueFactory(cellData -> cellData.getValue().responsibilitiesProperty());

        // Set the TableView's items to the staffList
        staffTableView.setItems(staffList);
    }

    @FXML
    private void saveDetailsButtonAction(ActionEvent event) {
        // Retrieve data from text fields
        String name = nameTextField.getText();
        String staffID = staffIDTextField.getText();
        String contactDetails = contactDetailsTextField.getText();
        String workingHours = workingHoursTextField.getText();
        String responsibilities = responsibilitiesTextField.getText();

        // Create a new Staff object with the entered data
        Staff staff = new Staff(name, staffID, contactDetails, workingHours, responsibilities);

        // Add the staff object to the staffList
        staffList.add(staff);

        // Clear text fields after saving
        clearTextFields();
    }

    private void clearTextFields() {
        nameTextField.clear();
        staffIDTextField.clear();
        contactDetailsTextField.clear();
        workingHoursTextField.clear();
        responsibilitiesTextField.clear();
    }
}
