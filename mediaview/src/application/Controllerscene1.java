package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Controllerscene1 implements Initializable {
	@FXML
	private MediaView mediaview;

	@FXML
	private Button play;
	@FXML
	private Button pause;
	@FXML
	private Button reset;

	private File file;
	private Media media;
	private MediaPlayer mediaplayer;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		file=new File("okita.mp4");
		media = new Media(file.toURI().toString());
		mediaplayer=new MediaPlayer(media);
		mediaview.setMediaPlayer(mediaplayer);
	}

	public void playmedia() {
		mediaplayer.play();
	}

	public void pausemedia() {
		mediaplayer.pause();
	}

	public void resetmedia() {
		if(mediaplayer.getStatus()!=MediaPlayer.Status.READY) {
		mediaplayer.seek(Duration.seconds(0.0));
		}
	}

}
