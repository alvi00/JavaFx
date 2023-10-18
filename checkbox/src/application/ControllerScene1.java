package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControllerScene1 {

	@FXML
	private CheckBox redcheckbox;
	@FXML
	private CheckBox greencheckbox;
	@FXML
	private CheckBox bluecheckbox;
	@FXML
	private ImageView myimage;

	Image redcar = new Image(getClass().getResourceAsStream("redcar.jpg"));
	Image greencar = new Image(getClass().getResourceAsStream("greencar.jpg"));
	Image bluecar = new Image(getClass().getResourceAsStream("bluecar.jpg"));

	public void changeimage(ActionEvent e) {
		if (redcheckbox.isSelected()) {
			myimage.setImage(redcar);
		}
		if (greencheckbox.isSelected()) {
			myimage.setImage(greencar);
		}
		if (bluecheckbox.isSelected()) {
			myimage.setImage(bluecar);
		}
		
		
		
		
	}

}
