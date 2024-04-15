package mainpkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SetRosterController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField nameField;
    @FXML
    private ComboBox<String> shiftComboBox;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField idField;

    // List to store roster entries
    private List<RosterEntry> rosterEntries;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize the ComboBox with shift options
        shiftComboBox.getItems().addAll("Morning", "Afternoon", "Evening");

        // Initialize rosterEntries list
        rosterEntries = new ArrayList<>();
    }    

    @FXML
    private void handleSubmitButtonClick(ActionEvent event) {
        // Retrieve data from input fields
        String name = nameField.getText();
        String shift = shiftComboBox.getValue();
        LocalDate date = datePicker.getValue();
        String id = idField.getText();
        
        // Validate if any field is empty
        if (name.isEmpty() || shift == null || date == null || id.isEmpty()) {
            // Handle validation error (you can show an alert or message)
            System.out.println("Please fill in all fields");
            return;
        }
        
        // Create a new RosterEntry object
        RosterEntry entry = new RosterEntry(name, shift, date, id);
        
        // Add the entry to the list
        rosterEntries.add(entry);
        
        // Clear input fields after submission
        clearFields();
        
        // You can add further logic here, such as saving the data to a database
        
        // For now, let's print the entry for verification
        System.out.println("Roster Entry Added: " + entry);
    }
    
    // Method to clear input fields
    private void clearFields() {
        nameField.clear();
        shiftComboBox.getSelectionModel().clearSelection();
        datePicker.getEditor().clear();
        idField.clear();
    }
}
