package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller2 {

	@FXML

	Label label;

	public void usernamer(String name) {
		label.setText("HELLO " + name);
	}
}
