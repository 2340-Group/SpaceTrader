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
public class SPAAACEController implements Initializable {
    
    /**
     * Name of next screen
     */
    private String eventType;

    @FXML
    private void handleQuitMenuItemAction(ActionEvent event) throws Exception {
	System.exit(0);
    }

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
    private void handleS1ButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
	nameHelper("S1", event);
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
    private void handleS2ButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
	nameHelper("S2", event);
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
    private void handleS3ButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
	nameHelper("S3", event);
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
    private void handleS3PT2ButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
	nameHelper("S3PT2", event);
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
    private void handleYNSButtonAction(ActionEvent event) throws Exception {
        SoundController.click();
	nameHelper("Your Naming Sucks", event);
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
            MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("SPAAACE"));
            MainController.setCurrentPlanet(planet);
            MainController.setCurrentSolarSystem("SPAAACE");
            EventGeneratorSimple randEvent = new EventGeneratorSimple(MainController.getPlayer());
            this.eventType = randEvent.generateEvent(planet) + ".fxml";
        }
    }

}

