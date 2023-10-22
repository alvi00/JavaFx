package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class SampleController implements Initializable {
	@FXML
	private WebView webview;
	@FXML
	private TextField textfilled;

	private String homepage;
	private WebEngine engine;
	private double webzoom;
	private WebHistory history;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = webview.getEngine();
		homepage = "www.google.com";
		textfilled.setText(homepage);
		webzoom = 1;
		loadpage();
	}

	public void loadpage() {
		// engine.load("https://www.porsche.com/usa/");
		engine.load("https://" + textfilled.getText());

	}

	public void refreshpage() {
		engine.reload();
	}

	public void zoomin() {
		webzoom += 0.25;
		webview.setZoom(webzoom);
	}

	public void zoomout() {
		webzoom -= 0.25;
		webview.setZoom(webzoom);
	}

	public void displayhostory() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();

		for (WebHistory.Entry entry : entries) {
			// System.out.println(entry);
			System.out.println(entry.getUrl() + " " + entry.lastVisitedDateProperty());
		}
	}

	public void back() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		history.go(-1);
		textfilled.setText(entries.get(history.getCurrentIndex()).getUrl());
		
	}

	public void forward() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		history.go(1);
		textfilled.setText(entries.get(history.getCurrentIndex()).getUrl());
	}
	public void magic() {
		engine.executeScript("window.location= \"https://www.youtube.com\";");
	}

}
