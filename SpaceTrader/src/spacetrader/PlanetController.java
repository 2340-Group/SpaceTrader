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
import javafx.stage.Stage;

/**
 * Universe Controller class
 *
 * @author Ryan
 */
public class PlanetController implements Initializable {
    private int minTechNeeded = 3;

    @FXML
    private Label fuelLabel;
    @FXML
    private Label fundsLabel;

    /**
     * Saves the game
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleSaveMenuItemAction(ActionEvent event) throws Exception {
    MainController.saveGame();
        SoundController.click();
    }

    @FXML
    private void handleBuyMoon(ActionEvent event) throws Exception {
    if (MainController.getPlayer().getFunds() >= 200000000) {
            SoundController.click();
            MainController.getPlayer().subtractFunds(200000000);
        Parent config = FXMLLoader
            .load(getClass().getResource("Moon.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node) event.getSource()).getScene()
            .getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    } else {
            SoundController.deny();
        }
    }

    /**
     * Quits the game
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleQuitMenuItemAction(ActionEvent event) throws Exception {
    System.exit(0);
    }

    /**
     * Exits to the SolarSystem
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleExitMenuItemAction(ActionEvent event) throws Exception {
    if (MainController.getPlayer().getShip().getFuel() > 0) {
            SoundController.click();
        Parent config = FXMLLoader.load(getClass().getResource(
            MainController.getCurrentSolarSystem() + ".fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node) event.getSource()).getScene()
            .getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    } else {
            SoundController.deny();
        }
    }

    /**
     * market pop up
     *
     * @param event
     * @throws Exception
     */
    @FXML
    public void handleMarket(ActionEvent event) throws Exception {
        SoundController.click();
    Parent config = FXMLLoader.load(getClass().getResource(
        "Marketplace.fxml"));
    Scene sceneConfig = new Scene(config);
    Stage stageN = (Stage) ((Node) event.getSource()).getScene()
        .getWindow();
    stageN.setScene(sceneConfig);
    stageN.show();
    }

    /**
     * to the shipyard
     *
     * @param event
     * @throws Exception
     */
    @FXML
    public void handleShipyard(ActionEvent event) throws Exception {
        SoundController.click();
    Parent config;
    if (MainController.getPlanetNotString().getTechLevel() < minTechNeeded) {
        config = FXMLLoader.load(getClass().getResource(
            "ShipyardNotHere.fxml"));
    } else {
        config = FXMLLoader.load(getClass().getResource("Shipyard.fxml"));
    }
    Scene sceneConfig = new Scene(config);
    Stage stageN = (Stage) ((Node) event.getSource()).getScene()
        .getWindow();
    stageN.setScene(sceneConfig);
    stageN.show();
    }

    /**
     * ship stats
     *
     * @param event
     * @throws Exception
     */
    @FXML
    public void handleAccessShip(ActionEvent event) throws Exception {
        SoundController.click();
    Parent config = FXMLLoader.load(getClass().getResource("Ship.fxml"));
    Scene sceneConfig = new Scene(config);
    Stage stageN = (Stage) fuelLabel.getScene().getWindow();
    stageN.setScene(sceneConfig);
    stageN.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    // TODO
    fundsLabel.setText("FUNDS\n" + MainController.getPlayer().getFunds());
    fuelLabel.setText("FUEL\n"
        + MainController.getPlayer().getShip().getFuel());
    }

}
