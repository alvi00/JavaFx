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
		String myFormattedDate = mydate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		label.setText(myFormattedDate.toString());
	}
	
}
