package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controllerscene1 {
	@FXML
	private Button logoutbutton;
	@FXML
	private AnchorPane scenePane;
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	Stage primaryStage;

	public void logout(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("LOGOUT");
		alert.setHeaderText("You're about to logout!");
		alert.setContentText("Do you wanna save before exiting? : ");

		if (alert.showAndWait().get() == ButtonType.OK) {
			primaryStage = (Stage) scenePane.getScene().getWindow();
			System.out.println("You successfully logged out !");
			primaryStage.close();
		}
	}

	public void Switchtoscene2(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
