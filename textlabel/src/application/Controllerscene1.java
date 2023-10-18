package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controllerscene1 {

	@FXML
	private Label mylabel;
	@FXML
	private TextField mytextfield;
	@FXML
	private Button submitbutton;
	@FXML
	private ImageView myimage;
	Image myimageview=new Image(getClass().getResourceAsStream("alvi2.jpg"));
	Image myimageview3=new Image(getClass().getResourceAsStream("alvi3.png"));

	int age;

	public void button(ActionEvent event) {
		try {
			age = Integer.parseInt(mytextfield.getText());
			myimage.setImage(myimageview);
			if (age >= 18) {
				mylabel.setText("Congratulations you can sign up");
				myimage.setImage(myimageview);
				
			} else {
				mylabel.setText("Sorry you are below age");
				myimage.setImage(myimageview3);
				myimage.setX(-100);
				myimage.setY(20);
			}
		} catch (NumberFormatException e) {
			mylabel.setText(" Enter only number here");
		} catch (Exception e) {
			System.out.print(e);
		}

	}



}
