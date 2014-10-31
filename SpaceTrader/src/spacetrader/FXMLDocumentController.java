/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.*;
import java.io.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

/**
 *
 * @author Jamie
 */
public class FXMLDocumentController implements Initializable {

    /**
     * Goes to ConfigurationScreen to start new game
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleStartButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
	Parent config = FXMLLoader.load(getClass().getResource(
		"ConfigurationScreen.fxml"));
	Scene sceneConfig = new Scene(config);
	Stage stageN = (Stage) ((Node) event.getSource()).getScene()
		.getWindow();
	stageN.setScene(sceneConfig);
	stageN.show();
    }

    /**
     * Loads the saved game file
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleLoadButtonAction(ActionEvent event) throws Exception {
	MainController.loadGame();
        SoundController.stopSong();
	SoundController.click();
	String planetName = MainController.getCurrentPlanet();
	Parent currentPlanet = FXMLLoader.load(getClass().getResource(
		planetName + ".fxml"));
	Scene scenePlanet = new Scene(currentPlanet);
	Stage stageN = (Stage) ((Node) event.getSource()).getScene()
		.getWindow();
	stageN.setScene(scenePlanet);
	stageN.show();
    }

    /**
     * Quits the game
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleQuitButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
	System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
	/* try {
	introSong = new Media(new File("./src/spacetrader/OpenTrack.mp3")
	.toURI().toString());
	mediaPlayer = new MediaPlayer(introSong);
	mediaPlayer.play();
	mediaPlayer.setCycleCount(4);
	// } catch (Exception e) {
	// System.err.println(e.getMessage());
	// }
        */
        SoundController.init();
        SoundController.intro();

    }

}
