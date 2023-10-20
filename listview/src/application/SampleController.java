package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class SampleController implements Initializable {

	public void myfood(ActionEvent e) {

	}

	@FXML
	private ListView<String> mylistview;
	@FXML
	Label mylabel;

	String []food= {"Pizza","ramen","sushu"};
	
	String currentfood;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		mylistview.getItems().addAll(food);
		mylistview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				currentfood=mylistview.getSelectionModel().getSelectedItem();
				mylabel.setText(currentfood);
				
			}
			
		});
	}
}
