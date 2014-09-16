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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.media.*;
import java.io.*;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Jesse
 */
public class ConfigurationScreenController implements Initializable {

    private String name = "Trader";
    private int remainingPoints = 15, pilotPoints = 0, fighterPoints = 0, traderPoints = 0, engineerPoints = 0;
    private Media click;
    private Media deny;
    private MediaPlayer mediaPlayer;
    
    @FXML
    private TextField nameField;
    //@FXML
    //private Button minusPilot, plusPilot, minusFighter, plusFighter, minusTrader, plusTrader, minusEngineer, plusEngineer, cancelBtn, doneBtn;
    @FXML
    private Label remainingPointsLabel, pilotPointsLabel, fighterPointsLabel, traderPointsLabel, engineerPointsLabel;
    @FXML
    private Button minusPilot;
    @FXML
    private Button minusFighter;
    @FXML
    private Button minusTrader;
    @FXML
    private Button minusEngineer;
    @FXML
    private Button plusPilot;
    @FXML
    private Button plusFighter;
    @FXML
    private Button plusTrader;
    @FXML
    private Button plusEngineer;
    @FXML
    private Button cancelBtn;
    @FXML
    private Button doneBtn;
    
    @FXML
    private void subtractPilot(ActionEvent event) {
        if (pilotPoints > 0) {
            mediaPlayer = new MediaPlayer(click);
            mediaPlayer.play();
            remainingPoints++;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            pilotPoints--;
            pilotPointsLabel.setText("Pilot\n" + pilotPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Pilot Points: " + pilotPoints);
        } else {
            mediaPlayer = new MediaPlayer(deny);
            mediaPlayer.play();
        }
    }
    
    @FXML
    private void addPilot(ActionEvent event) {
        if (remainingPoints > 0) {
            mediaPlayer = new MediaPlayer(click);
            mediaPlayer.play();
            remainingPoints--;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            pilotPoints++;
            pilotPointsLabel.setText("Pilot\n" + pilotPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Pilot Points: " + pilotPoints);
        } else {
            mediaPlayer = new MediaPlayer(deny);
            mediaPlayer.play();
        }
    }
    
    @FXML
    private void subtractFighter(ActionEvent event) {
        if (fighterPoints > 0) {
            mediaPlayer = new MediaPlayer(click);
            mediaPlayer.play();
            remainingPoints++;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            fighterPoints--;
            fighterPointsLabel.setText("Fighter\n" + fighterPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Fighter Points: " + fighterPoints);
        } else {
            mediaPlayer = new MediaPlayer(deny);
            mediaPlayer.play();
        }
    }
    
    @FXML
    private void addFighter(ActionEvent event) {
        if (remainingPoints > 0) {
            mediaPlayer = new MediaPlayer(click);
            mediaPlayer.play();
            remainingPoints--;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            fighterPoints++;
            fighterPointsLabel.setText("Fighter\n" + fighterPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Fighter Points: " + fighterPoints);
        } else {
            mediaPlayer = new MediaPlayer(deny);
            mediaPlayer.play();
        }
    }
    
    @FXML
    private void subtractTrader(ActionEvent event) {
        if (traderPoints > 0) {
            mediaPlayer = new MediaPlayer(click);
            mediaPlayer.play();
            remainingPoints++;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            traderPoints--;
            traderPointsLabel.setText("Trader\n" + traderPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Trader Points: " + traderPoints);
        } else {
            mediaPlayer = new MediaPlayer(deny);
            mediaPlayer.play();
        }
    }
    
    @FXML
    private void addTrader(ActionEvent event) {
        if (remainingPoints > 0) {
            mediaPlayer = new MediaPlayer(click);
            mediaPlayer.play();
            remainingPoints--;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            traderPoints++;
            traderPointsLabel.setText("Trader\n" + traderPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Trader Points: " + traderPoints);
        } else {
            mediaPlayer = new MediaPlayer(deny);
            mediaPlayer.play();
        }
    }
    
    @FXML
    private void subtractEngineer(ActionEvent event) {
        if (engineerPoints > 0) {
            mediaPlayer = new MediaPlayer(click);
            mediaPlayer.play();
            remainingPoints++;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            engineerPoints--;
            engineerPointsLabel.setText("Engineer\n" + engineerPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Engineer Points: " + engineerPoints);
        } else {
            mediaPlayer = new MediaPlayer(deny);
            mediaPlayer.play();
        }
    }
    
    @FXML
    private void addEngineer(ActionEvent event) {
        if (remainingPoints > 0) {
            mediaPlayer = new MediaPlayer(click);
            mediaPlayer.play();
            remainingPoints--;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            engineerPoints++;
            engineerPointsLabel.setText("Engineer\n" + engineerPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Engineer Points: " + engineerPoints);
        }
    }
    
    @FXML
    private void cancel(ActionEvent event) throws Exception {
        Parent config = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
    
    @FXML
    private void done(ActionEvent event) throws Exception {
        if (remainingPoints == 0) {
            if (nameField.getText() != null && !nameField.getText().trim().isEmpty()) {
                name = nameField.getText().trim();
            }
            System.out.println(name);
            
            Parent config = FXMLLoader.load(getClass().getResource("Placeholder.fxml"));
            Scene sceneConfig = new Scene(config);
            Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stageN.setScene(sceneConfig);
            stageN.show();
        } else {
            //Make a pop-up dialog that tells user to use remaining points.
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        click = new Media(new File("./src/spacetrader/Click Silencer 2.wav").toURI().toString());
        deny = new Media(new File("./src/spacetrader/Glitch Smashvox 2.wav").toURI().toString());
        mediaPlayer = new MediaPlayer(click);
    }    
    
}
