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
import sun.audio.*;
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
    private String currentScene;
    
    
    @FXML
    private void handleStartButtonAction(ActionEvent event) throws Exception {
        System.out.println("You clicked me!");
        //label.setText("Hello World!");
        currentScene = "configure";
        Parent config = FXMLLoader.load(getClass().getResource("ConfigurationScreen.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("INIT");
        try {
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(AudioPlayer.class.getResourceAsStream("OpenTrack.wav"));         
          clip.open(inputStream);
          clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
          System.err.println(e.getMessage());
        }

    }    
    
}
