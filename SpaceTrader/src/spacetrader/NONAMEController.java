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
import javafx.stage.Stage;

/**
 * Universe Controller class
 *
 * @author Ryan
 */
public class NONAMEController implements Initializable {

    @FXML
    private void handleQuitMenuItemAction(ActionEvent event) throws Exception {
    System.exit(0);
    }

    /**
     * This is the name of the next screen
     */
    private String eventType;

    @FXML
    private void handleExitMenuItemAction(ActionEvent event) throws Exception {
    if (MainController.getPlayer().getShip().getFuel() > 1) {
            SoundController.click();
        Parent config = FXMLLoader.load(getClass().getResource(
            "Universe.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node) event.getSource()).getScene()
            .getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    } else {
            SoundController.deny();
        }

    }

    @FXML
    private void handleERRORButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
    nameHelper("ERROR", event);
    MainController.getPlayer().setLocation(
        MainController.getUniverse()
        .getPlanet(MainController.getCurrentPlanet()).getX(),
        MainController.getUniverse()
        .getPlanet(MainController.getCurrentPlanet()).getY());
    Parent config = FXMLLoader.load(getClass().getResource(eventType));
    Scene sceneConfig = new Scene(config);
    Stage stageN = (Stage) ((Node) event.getSource()).getScene()
        .getWindow();
    stageN.setScene(sceneConfig);
    stageN.show();
    }

    @FXML
    private void handleBlankButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
    nameHelper("Blank", event);
    MainController.getPlayer().setLocation(
        MainController.getUniverse()
        .getPlanet(MainController.getCurrentPlanet()).getX(),
        MainController.getUniverse()
        .getPlanet(MainController.getCurrentPlanet()).getY());
    Parent config = FXMLLoader.load(getClass().getResource(eventType));
    Scene sceneConfig = new Scene(config);
    Stage stageN = (Stage) ((Node) event.getSource()).getScene()
        .getWindow();
    stageN.setScene(sceneConfig);
    stageN.show();
    }

    @FXML
    private void handleInsertNameButtonAction(ActionEvent event)
        throws Exception {
        SoundController.click();
    nameHelper("InsertName", event);
    MainController.getPlayer().setLocation(
        MainController.getUniverse()
        .getPlanet(MainController.getCurrentPlanet()).getX(),
        MainController.getUniverse()
        .getPlanet(MainController.getCurrentPlanet()).getY());
    Parent config = FXMLLoader.load(getClass().getResource(eventType));
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
    // taken care of by the .fxml
    } 
    

    private void nameHelper(String planet, ActionEvent event)throws Exception{
    if (MainController.getCurrentPlanet().equals(planet)) {
            this.eventType = planet + ".fxml";
        } else {
            MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("NONAME"));
            MainController.setCurrentPlanet(planet);
            MainController.setCurrentSolarSystem("NONAME");
            EventGeneratorSimple randEvent = new EventGeneratorSimple(MainController.getPlayer());
            this.eventType = randEvent.generateEvent(planet) + ".fxml";
        }
    }
}
