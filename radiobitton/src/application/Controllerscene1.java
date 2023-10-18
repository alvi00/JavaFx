package application;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controllerscene1 {
	
	@FXML
	
	ImageView myimage;
	@FXML
	RadioButton REDBUTTON;
	@FXML
	RadioButton GREENBUTTON;
	@FXML
	RadioButton BLUEBUTTON;
	
	Image redcar = new Image(getClass().getResourceAsStream("redcar.jpg"));
	Image greencar = new Image(getClass().getResourceAsStream("greencar.jpg"));
	Image bluecar = new Image(getClass().getResourceAsStream("bluecar.jpg"));
	
	public void colorchange() {
		if(REDBUTTON.isSelected()) {
			myimage.setImage(redcar);
		}
		if(GREENBUTTON.isSelected()) {
			myimage.setImage(greencar);
		}
		if(BLUEBUTTON.isSelected()) {
			myimage.setImage(bluecar);
		}
		
	}
}
