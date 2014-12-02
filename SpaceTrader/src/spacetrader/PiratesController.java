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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lewisdiego
 */
public class PiratesController implements Initializable {

    public PirateEvent pirateEvent = new PirateEvent();
    @FXML
    private Label text;
    @FXML
    private Label text1;
    @FXML
    private Button surrenderBtn;
    @FXML
    private Button fightBtn;
    @FXML
    private Button fleeBtn;
    @FXML
    private Button continueBtn;
    @FXML
    private Button okayBtn;

    /**
     * Surrender to pirates and lose your cargo
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleSurrenderButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
        pirateEvent.stealResources(MainController.getShip());

        text.setText("You surrendered and\nlost all of your cargo.");
        surrenderBtn.setVisible(false);
        fightBtn.setVisible(false);
        fleeBtn.setVisible(false);
        continueBtn.setVisible(true);
    }

    /**
     * Try to fight the pirates to defend your cargo
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleFightButtonAction(ActionEvent event)
            throws Exception {
        SoundController.click();
        surrenderBtn.setVisible(false);
        fightBtn.setVisible(false);
        fleeBtn.setVisible(false);
        
        if (pirateEvent.fight(MainController.getShip())) {
            text.setText("You fought off the\npirates, but your ship\nhas taken"
                    + "damage.");
            continueBtn.setVisible(true);
        } else {
            text.setText("You tried to fight off the\npirates, but your "
                    + "fighting\nability was not high\nenough. Your ship has"
                    + "\nbeen destroyed.");
            okayBtn.setVisible(true);
            text1.setVisible(true);
        }
    }

    /**
     * Try to flee the pirates to defend your cargo
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleFleeButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
        pirateEvent.flee(MainController.getShip());

        text.setText("You fled the pirates,\nbut your ship has taken\ndamage.");
        surrenderBtn.setVisible(false);
        fightBtn.setVisible(false);
        fleeBtn.setVisible(false);
        continueBtn.setVisible(true);
    }

    @FXML
    private void handleContinueButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
        Parent config = FXMLLoader.load(getClass().getResource(
            MainController.getCurrentPlanet() + ".fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node) event.getSource()).getScene()
            .getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
    
    @FXML
    private void handleOkayButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
        Parent config = FXMLLoader.load(getClass().getResource(
            "FXMLDocument.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node) event.getSource()).getScene()
            .getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    pirateEvent.act(MainController.getPlayer());
    //funds.setText("" + (MainController.getPlayer().getFunds()));
    }

}
