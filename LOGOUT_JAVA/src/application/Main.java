package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root =FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setOnCloseRequest(event -> {
			event.consume();
			logout(primaryStage);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void logout(Stage primaryStage) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("LOGOUT");
		alert.setHeaderText("You're about to logout!");
		alert.setContentText("Do you wanna save before exiting? : ");

		if (alert.showAndWait().get() == ButtonType.OK) {
			primaryStage.close();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
