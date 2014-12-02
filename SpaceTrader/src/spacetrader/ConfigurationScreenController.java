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

import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Jesse
 */
public class ConfigurationScreenController implements Initializable {

    /**
     * name entered by Player
     */
    private String name = "Trader";
    private int remainingPoints = 15, pilotPoints, fighterPoints,
        traderPoints, engineerPoints; //automatically set to zero

    @FXML
    private TextField nameField;
    // @FXML
    // private Button minusPilot, plusPilot, minusFighter, plusFighter,
    // minusTrader, plusTrader, minusEngineer, plusEngineer, cancelBtn, doneBtn;
    @FXML
    private Label remainingPointsL, pilotPointsL, fighterPointsL, traderPointsL, engineerPointsL;
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
    
    private String pmd = "Remaining Points\n";

    @FXML
    private void subtractPilot(ActionEvent event) {
    if (pilotPoints > 0) {
            SoundController.click();
        remainingPoints++;
        remainingPointsL.setText(pmd + remainingPoints);
        pilotPoints--;
        pilotPointsL.setText("Pilot\n" + pilotPoints);
//      System.out.println("Remaining Points: " + remainingPoints);
//      System.out.println("Pilot Points: " + pilotPoints);
    } else {
        SoundController.deny();
    }
    }

    @FXML
    private void addPilot(ActionEvent event) {
    if (remainingPoints > 0) {
        SoundController.click();
        remainingPoints--;
        remainingPointsL.setText(pmd + remainingPoints);
        pilotPoints++;
        pilotPointsL.setText("Pilot\n" + pilotPoints);
//      System.out.println("Remaining Points: " + remainingPoints);
//      System.out.println("Pilot Points: " + pilotPoints);
    } else {
        SoundController.deny();
    }
    }

    @FXML
    private void subtractFighter(ActionEvent event) {
    if (fighterPoints > 0) {
        SoundController.click();
        remainingPoints++;
        remainingPointsL
            .setText(pmd + remainingPoints);
        fighterPoints--;
        fighterPointsL.setText("Fighter\n" + fighterPoints);
//      System.out.println("Remaining Points: " + remainingPoints);
//      System.out.println("Fighter Points: " + fighterPoints);
    } else {
        SoundController.deny();
    }
    }

    @FXML
    private void addFighter(ActionEvent event) {
    if (remainingPoints > 0) {
        SoundController.click();
        remainingPoints--;
        remainingPointsL
            .setText(pmd + remainingPoints);
        fighterPoints++;
        fighterPointsL.setText("Fighter\n" + fighterPoints);
//      System.out.println("Remaining Points: " + remainingPoints);
//      System.out.println("Fighter Points: " + fighterPoints);
    } else {
        SoundController.deny();
    }
    }

    @FXML
    private void subtractTrader(ActionEvent event) {
    if (traderPoints > 0) {
        SoundController.click();
        remainingPoints++;
        remainingPointsL
            .setText(pmd + remainingPoints);
        traderPoints--;
        traderPointsL.setText("Trader\n" + traderPoints);
//      System.out.println("Remaining Points: " + remainingPoints);
//      System.out.println("Trader Points: " + traderPoints);
    } else {
        SoundController.deny();
    }
    }

    @FXML
    private void addTrader(ActionEvent event) {
    if (remainingPoints > 0) {
        SoundController.click();
        remainingPoints--;
        remainingPointsL
            .setText(pmd + remainingPoints);
        traderPoints++;
        traderPointsL.setText("Trader\n" + traderPoints);
//      System.out.println("Remaining Points: " + remainingPoints);
//      System.out.println("Trader Points: " + traderPoints);
    } else {
        SoundController.deny();
    }
    }

    @FXML
    private void subtractEngineer(ActionEvent event) {
    if (engineerPoints > 0) {
        SoundController.click();
        remainingPoints++;
        remainingPointsL
            .setText(pmd + remainingPoints);
        engineerPoints--;
        engineerPointsL.setText("Engineer\n" + engineerPoints);
//      System.out.println("Remaining Points: " + remainingPoints);
//      System.out.println("Engineer Points: " + engineerPoints);
    } else {
        SoundController.deny();
    }
    }

    @FXML
    private void addEngineer(ActionEvent event) {
    if (remainingPoints > 0) {
        SoundController.click();
        remainingPoints--;
        remainingPointsL
            .setText(pmd + remainingPoints);
        engineerPoints++;
        engineerPointsL.setText("Engineer\n" + engineerPoints);
//      System.out.println("Remaining Points: " + remainingPoints);
//      System.out.println("Engineer Points: " + engineerPoints);
    } else {
            SoundController.deny();
        }
    }

    @FXML
    private void cancel(ActionEvent event) throws Exception {
        SoundController.click();
        SoundController.stopSong();
    Parent config = FXMLLoader.load(getClass().getResource(
        "FXMLDocument.fxml"));
    Scene sceneConfig = new Scene(config);
    Stage stageN = (Stage) ((Node) event.getSource()).getScene()
        .getWindow();
    stageN.setScene(sceneConfig);
    stageN.show();
    }

    @FXML
    private void done(ActionEvent event) throws Exception {
    if (remainingPoints == 0) {
            SoundController.stopSong();
            SoundController.swoop();
        if (nameField.getText() != null
            && !nameField.getText().trim().isEmpty()) {
        name = nameField.getText().trim();
        }
//      System.out.println(name);

        MainController.makePlayer(name, pilotPoints, fighterPoints,
            traderPoints, engineerPoints, MainController.getUniverse()
                .getPlanet("S1").getX(), MainController
                .getUniverse().getPlanet("S1").getY());

        MainController.setCurrentPlanet("S1");
        MainController.setCurrentSolarSystem("SPAAACE");
        Parent config = FXMLLoader.load(getClass().getResource("S1.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node) event.getSource()).getScene()
            .getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
        SoundController.spaceMusic();
    } else {
        SoundController.deny();
    }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    //taken care of by .fxml
    }

    public String getName() {
    return name;
    }

    public int getpilotPoints() {
    return pilotPoints;
    }

    public int getfighterPoints() {
    return fighterPoints;
    }

    public int getraderPoints() {
    return traderPoints;
    }

    public int getengineerPoints() {
    return engineerPoints;
    }

}
