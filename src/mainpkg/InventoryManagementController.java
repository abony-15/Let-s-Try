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
import javafx.scene.layout.AnchorPane;

public class InventoryManagementController implements Initializable {

    @FXML
    private AnchorPane mainAnchorPane;
    @FXML
    private TableView<Item> inventoryTableView;
    @FXML
    private TableColumn<Item, String> itemIdColumn;
    @FXML
    private TableColumn<Item, String> itemNameColumn;
    @FXML
    private TableColumn<Item, String> quantityColumn;
    @FXML
    private TextField itemIdTextField;
    @FXML
    private TextField itemNameTextField;
    @FXML
    private TextField quantityTextField;
    @FXML
    private Button submitButton;

    private ObservableList<Item> itemsList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize table columns
        itemIdColumn.setCellValueFactory(cellData -> cellData.getValue().itemIdProperty());
        itemNameColumn.setCellValueFactory(cellData -> cellData.getValue().itemNameProperty());
        quantityColumn.setCellValueFactory(cellData -> cellData.getValue().quantityProperty());

        // Initialize the items list
        itemsList = FXCollections.observableArrayList();

        // Set the items list to the table view
        inventoryTableView.setItems(itemsList);
    }

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        // Retrieve data from text fields
        String itemId = itemIdTextField.getText();
        String itemName = itemNameTextField.getText();
        String quantity = quantityTextField.getText();

        // Create a new Item object with the retrieved data
        Item newItem = new Item(itemId, itemName, quantity);

        // Add the new item to the items list
        itemsList.add(newItem);

        // Clear text fields after adding the item
        itemIdTextField.clear();
        itemNameTextField.clear();
        quantityTextField.clear();
    }
}
