package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	public void Switchtoscene1(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
		scene =new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Switchtoscene2(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
		scene =new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
