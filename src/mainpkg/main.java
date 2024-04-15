package mainpkg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load PatientRecordManagement.fxml
        Parent root = FXMLLoader.load(getClass().getResource("PatientRecordManagement.fxml"));
        Scene scene1 = new Scene(root);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Patient Record Management System");
        primaryStage.show();

        // Load DoctorDetails.fxml
        Stage doctorDetailsStage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("DoctorDetails.fxml"));
        Scene scene2 = new Scene(root2);
        doctorDetailsStage.setScene(scene2);
        doctorDetailsStage.setTitle("Doctor Details Management System");
        doctorDetailsStage.show();

        // Load PatientCheckIn.fxml
        Stage patientCheckInStage = new Stage();
        Parent root3 = FXMLLoader.load(getClass().getResource("PatientCheckIn.fxml"));
        Scene scene3 = new Scene(root3);
        patientCheckInStage.setScene(scene3);
        patientCheckInStage.setTitle("Patient Check-in Process");
        patientCheckInStage.show();

        // Load ReceptionistDetails.fxml
        Stage receptionistDetailsStage = new Stage();
        Parent root4 = FXMLLoader.load(getClass().getResource("ReceptionistDetails.fxml"));
        Scene scene4 = new Scene(root4);
        receptionistDetailsStage.setScene(scene4);
        receptionistDetailsStage.setTitle("Receptionist Details Management System");
        receptionistDetailsStage.show();

        // Load NurseDetails.fxml - assuming you have a NurseDetails.fxml that corresponds to the NurseDetailsController
        Stage nurseDetailsStage = new Stage();
        Parent root5 = FXMLLoader.load(getClass().getResource("NurseDetails.fxml"));
        Scene scene5 = new Scene(root5);
        nurseDetailsStage.setScene(scene5);
        nurseDetailsStage.setTitle("Nurse Details Management System");
        nurseDetailsStage.show();
        
//        // Load SetRoster.fxml
//        Stage setRosterStage = new Stage();
//        Parent root6 = FXMLLoader.load(getClass().getResource("SetRoster.fxml"));
//        Scene scene6 = new Scene(root6);
//        setRosterStage.setScene(scene6);
//        setRosterStage.setTitle("Set Roster");
//        setRosterStage.show();
//        
//        // Load CheckRoster.fxml
//        Stage checkRosterStage = new Stage();
//        Parent root7 = FXMLLoader.load(getClass().getResource("CheckRoster.fxml"));
//        Scene scene7 = new Scene(root7);
//        checkRosterStage.setScene(scene7);
//        checkRosterStage.setTitle("Check Roster");
//        checkRosterStage.show();

          Stage StaffDetailsStage = new Stage();
          Parent root8 = FXMLLoader.load(getClass().getResource("StaffDetails.fxml")); 
          Scene scene8 = new Scene(root8);
          StaffDetailsStage.setScene(scene8);
          StaffDetailsStage.setTitle("Staff Details");
          StaffDetailsStage.show();
          
          Stage InventoryManagementStage = new Stage();
          Parent root9 = FXMLLoader.load(getClass().getResource("InventoryManagement.fxml")); 
          Scene scene9 = new Scene(root9);
          InventoryManagementStage.setScene(scene9);
          InventoryManagementStage.setTitle("Inventory Management Details");
          InventoryManagementStage.show();
          
          
    }

    public static void main(String[] args) {
        launch(args);
    }
}
