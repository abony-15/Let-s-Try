package mainpkg;

import java.net.URL;
import mainpkg.RosterController;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CheckRosterController implements Initializable {

    @FXML
    private TableView<RosterCheck> nurseRosterTableView;
    @FXML
    private TableColumn<RosterCheck, String> nurseNameColumn;
    @FXML
    private TableColumn<RosterCheck, String> shiftColumn;
    @FXML
    private TableColumn<RosterCheck, String> dateColumn;
    @FXML
    private Button submitButton;
    @FXML
    private TextField nurseNameField;
    @FXML
    private TextField idField;

    private RosterController rosterController;

    public void setRosterController(RosterController rosterController) {
        this.rosterController = rosterController;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize table columns
        nurseNameColumn.setCellValueFactory(cellData -> cellData.getValue().nurseNameProperty());
        shiftColumn.setCellValueFactory(cellData -> cellData.getValue().shiftProperty());
        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
    }    

    @FXML
    private void handleSubmitButtonClick(ActionEvent event) {
        String nurseName = nurseNameField.getText();
        String id = idField.getText();

        if (rosterController != null) {
            RosterCheck entry = rosterController.findRosterEntry(nurseName, id);
            if (entry != null) {
                nurseRosterTableView.getItems().clear();
                nurseRosterTableView.getItems().add(entry);
            } else {
                // Clear the table if entry not found
                nurseRosterTableView.getItems().clear();
            }
        } else {
            System.out.println("RosterController is not initialized!");
        }
    }   
}
