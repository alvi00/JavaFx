package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		Group node=new Group();
		Scene scene=new Scene(node,Color.LAVENDER);
		stage.setScene(scene);
		stage.setTitle("alvi is a good boy");
		Image icon=new Image("My project (2).png");
		stage.getIcons().add(icon);
		stage.setWidth(430);
		stage.setHeight(430);
		stage.setResizable(false);
//		stage.setX(100);
//		stage.setY(100);
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("alvi");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("r"));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
