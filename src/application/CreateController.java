package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateController {

    @FXML
    private TextField Name;

    @FXML
    private TextField Email;

    @FXML
    private DatePicker DOB;

    @FXML
    private PasswordField Password;

    @FXML
    void home(ActionEvent event) throws IOException {
    	
    	System.out.println("you clicked on sign in");
		Parent root1= FXMLLoader.load(getClass().getResource("/application/home.fxml"));
		Scene login_scene= new Scene(root1);
		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
		login_stage.hide();
		login_stage.setScene(login_scene);
		login_stage.show();

    }

}