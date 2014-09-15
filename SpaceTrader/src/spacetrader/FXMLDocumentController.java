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
    
    @FXML
    private Media introSong;
    private MediaPlayer mediaPlayer;

    @FXML
    private void handleStartButtonAction(ActionEvent event) throws Exception {
        mediaPlayer.stop();
        Media swoop = new Media(new File("./src/spacetrader/Sweep Droga.wav").toURI().toString());
        mediaPlayer = new MediaPlayer(swoop);
        mediaPlayer.play();
        Parent config = FXMLLoader.load(getClass().getResource("ConfigurationScreen.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
    
    @FXML
    private void handleQuitButtonAction(ActionEvent event) throws Exception {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
          introSong = new Media(new File("./src/spacetrader/OpenTrack.mp3").toURI().toString());
          mediaPlayer = new MediaPlayer(introSong);
          mediaPlayer.play();
          mediaPlayer.setCycleCount(4);
        } catch (Exception e) {
          System.err.println(e.getMessage());
        }

    }    
    
}
