package poker.app.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import poker.app.MainApp;

public class WinnerController extends Application implements Initializable {
	private String playerWinner;
	private MainApp mainapp;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@Override
	public void start(Stage stage) {
        Text text = new Text(10, 40, this.getPlayerWinner());
        text.setFont(new Font(40));
        Scene scene = new Scene(new Group(text));
        scene.fillProperty().set(Color.GREEN);
        stage.setTitle("Poker"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    public String getPlayerWinner() {
		return playerWinner;
	}

	public void setPlayerWinner(String playerWinner) {
		this.playerWinner = playerWinner;
	}

	public static void main(String[] args) {
        Application.launch(args);
    }
    
    @FXML
	public void initialize() {
		
	}


	public MainApp getMainapp() {
		return mainapp;
	}

	public void setMainapp(MainApp mainapp) {
		this.mainapp = mainapp;
	}
}
