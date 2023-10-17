package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SampleController {
	@FXML
	ImageView myimage;
	Image myimageview=new Image(getClass().getResourceAsStream("alvi2.png"));
	Image myimageview1=new Image(getClass().getResourceAsStream("alvi1.png"));
	public void imagedisplay() {
		myimage.setImage(myimageview);
	}
	public void imagedisplay1() {
		myimage.setImage(myimageview1);
	}
	
	
}
