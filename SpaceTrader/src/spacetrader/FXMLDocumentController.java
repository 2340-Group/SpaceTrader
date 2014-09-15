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
import javafx.scene.control.Label;
import java.util.*;
import javax.sound.sampled.*;
import javafx.scene.media.*;
import java.io.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;


/**
 *
 * @author Jamie
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private int active;
    private String currentScene;
    private Media introSong;
    private MediaPlayer mediaPlayer;
    
    
    @FXML
    private void handleStartButtonAction(ActionEvent event) throws Exception {
        System.out.println("You clicked me!");
        //label.setText("Hello World!");
        currentScene = "configure";
        active = 0;
        Parent config = FXMLLoader.load(getClass().getResource("ConfigurationScreen.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
        mediaPlayer.stop();
    }
    
    @FXML
    private void handleQuitButtonAction(ActionEvent event) throws Exception {
        System.out.println("You clicked me!");
        //label.setText("Hello World!");
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("INIT");
        active = 1;
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
