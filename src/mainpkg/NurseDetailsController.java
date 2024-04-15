package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class NurseDetailsController implements Initializable {

    @FXML
    private TextField nurseNameField;
    @FXML
    private TextField nurseIDField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField bloodGroupField;
    @FXML
    private TextField ageField;
    @FXML
    private TableView<Nurse> nurseTableView;
    @FXML
    private TableColumn<Nurse, String> nurseNameColumn;
    @FXML
    private TableColumn<Nurse, String> nurseIDColumn;
    @FXML
    private TableColumn<Nurse, String> phoneNumberColumn;
    @FXML
    private TableColumn<Nurse, String> bloodGroupColumn;
    @FXML
    private TableColumn<Nurse, Integer> ageColumn;

    // The data as an observable list of Nurses
    private final ObservableList<Nurse> nurseData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize the table columns
        nurseNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        nurseIDColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        phoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        bloodGroupColumn.setCellValueFactory(new PropertyValueFactory<>("bloodGroup"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

        // Bind the observable list with the TableView
        nurseTableView.setItems(nurseData);
    }

    @FXML
    private void handleSaveAction(ActionEvent event) {
        // Parse the age from text to integer
        int age = Integer.parseInt(ageField.getText());

        // Create a new Nurse instance with the form data
        Nurse newNurse = new Nurse(
                nurseNameField.getText(),
                nurseIDField.getText(),
                phoneNumberField.getText(),
                bloodGroupField.getText(),
                age);

        // Add the new Nurse to the observable list
        nurseData.add(newNurse);

        // Clear the input fields after saving
        nurseNameField.clear();
        nurseIDField.clear();
        phoneNumberField.clear();
        bloodGroupField.clear();
        ageField.clear();
    }
}
