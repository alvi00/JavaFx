package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class SampleController implements Initializable{
	
	@FXML
	private TreeView<String> mytreeview;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		TreeItem<String>rootitem = new TreeItem<>("Files");
		
		
		
		TreeItem<String>branchItem1 = new TreeItem<>("Pictures");
		TreeItem<String>branchItem2 = new TreeItem<>("Games");
		TreeItem<String>branchItem3 = new TreeItem<>("Music");
		
		
		
		TreeItem<String>leafitem1 = new TreeItem<>("Alvi");
		TreeItem<String>leafitem2 = new TreeItem<>("Sami");
		TreeItem<String>leafitem3 = new TreeItem<>("Honey singn");
		TreeItem<String>leafitem4 = new TreeItem<>("tupack");
		TreeItem<String>leafitem5 = new TreeItem<>("ww2");
		TreeItem<String>leafitem6 = new TreeItem<>("ww3");
		rootitem.getChildren().addAll(branchItem1,branchItem2,branchItem3);
		branchItem1.getChildren().addAll(leafitem1,leafitem2);
		branchItem2.getChildren().addAll(leafitem3,leafitem4);
		branchItem3.getChildren().addAll(leafitem5,leafitem6);
		
		//mytreeview.setShowRoot(false);
		mytreeview.setRoot(rootitem);
		
	}
	
	public void selectitem() {
		TreeItem<String> item= (TreeItem<String>) mytreeview.getSelectionModel().getSelectedItem();
		
		if(item!=null) {
		System.out.print(item.getValue());
		}
	}

}
