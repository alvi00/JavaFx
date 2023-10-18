package application;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controllerscene1 {
	@FXML
	private Label label;
	@FXML
	private DatePicker datepicker;
	
	public void date() {
			
		LocalDate mydate=datepicker.getValue();
		label.setText(mydate.toString());
	}
	
}
