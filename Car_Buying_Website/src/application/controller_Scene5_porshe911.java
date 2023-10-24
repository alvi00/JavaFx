package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class controller_Scene5_porshe911 {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	ImageView myimage1;
	@FXML
	ImageView myimage2;
	@FXML
	ImageView myimage3;

	Image photo1 = new Image(getClass().getResourceAsStream("porshe_911_photo1.jpg"));
	Image photo2 = new Image(getClass().getResourceAsStream("porshe_911_photo2.jpg"));
	Image photo3 = new Image(getClass().getResourceAsStream("porshe_911_photo3.jpg"));
	Image photo4 = new Image(getClass().getResourceAsStream("porshe_911_photo4.jpg"));
	Image photo5 = new Image(getClass().getResourceAsStream("porshe_911_photo5.jpg"));
	Image photo6 = new Image(getClass().getResourceAsStream("porshe_911_photo6.jpg"));


	public void photodisplay1() {
		myimage1.setImage(photo1);
	}

	public void photodisplay2() {
		myimage1.setImage(photo2);
	}
	public void photodisplay3() {
		myimage2.setImage(photo3);
	}

	public void photodisplay4() {
		myimage2.setImage(photo4);
	}
	public void photodisplay5() {
		myimage3.setImage(photo5);
	}

	public void photodisplay6() {
		myimage3.setImage(photo6);
	}
	
	
	public void gotoscene6_porshe911_gt3(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		car1.setCarmodelname("GT3");
		stage.setUserData(car1);
//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	

}
