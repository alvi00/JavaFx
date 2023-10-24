package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller_Scene2 {

	private Stage stage;
	private Scene scene;
	private Parent root;

	private Car car1;

	public void gotoscene1(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void gotoscene3(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene3.fxml"));
		root = loader.load();
		// Controller_Scene2 controller2 = loader.getController();
		car1 = new Car();
		car1.setBrandName("BMW");
		System.out.println(car1.getBrandName());
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setUserData(car1);
		stage.setScene(scene);
		stage.show();
	}
	
	public void gotoscene4(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene4.fxml"));
		root = loader.load();
		// Controller_Scene2 controller2 = loader.getController();
		car1 = new Car();
		car1.setBrandName("Porsche");
//		System.out.println(car1.getBrandName());
//		System.out.println(car1.toString());
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setUserData(car1);
		stage.setScene(scene);
		stage.show();
	}
	

}