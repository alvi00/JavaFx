package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class SampleController {
		
	@FXML
	
	private Circle circle;
	private int x;
	private int y;
	
	
	public void up(ActionEvent e) {
		circle.setCenterY(y=y-5);
	}
	public void down(ActionEvent e) {
		circle.setCenterY(y=y+5);
	}
	public void left(ActionEvent e) {
		circle.setCenterX(x=x-5);
	}
	public void right(ActionEvent e) {
		circle.setCenterX(x=x+5);
	}

	
}
