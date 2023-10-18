package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class SampleController implements Initializable{
	@FXML
	private Label label;
	@FXML
	private ChoiceBox<String> choicebox;
	
	private String[] food= {"pizza","sushi","ramen"};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choicebox.getItems().addAll(food);
		choicebox.setOnAction(this::getlabel);
	}
	
	public void getlabel(ActionEvent e) {
		String myfood=choicebox.getValue();
		label.setText(myfood);
	}
	
	
}
