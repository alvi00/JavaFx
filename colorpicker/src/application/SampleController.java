package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class SampleController {
	@FXML
	private ColorPicker colorpicker;
	@FXML
	private AnchorPane pane;
	public void color(ActionEvent e) {
		Color mycolor=colorpicker.getValue();
		pane.setBackground(new Background(new BackgroundFill(mycolor,null,null)));
	}
	
}
