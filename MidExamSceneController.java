/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author AZAAN
 */
public class MidExamSceneController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private ComboBox<Integer> idCb;
    @FXML
    private TextField paystatus;
    @FXML
    private ComboBox<String> uniCriteriaCb;
    @FXML
    private ComboBox<String> payCb;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ShowTrainee(ActionEvent event) {
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }

    @FXML
    private void AddTraineeToList(ActionEvent event) {
    }
    
}
