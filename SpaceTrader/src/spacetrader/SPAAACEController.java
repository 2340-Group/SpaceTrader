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
	
	@FXML
    private void handleQuitMenuItemAction(ActionEvent event) throws Exception {
        System.exit(0);
    }
	
	@FXML
    private void handleExitMenuItemAction(ActionEvent event) throws Exception {
		if (MainController.getPlayer().getShip().getFuel() > 1) {
			Parent config = FXMLLoader.load(getClass().getResource("Universe.fxml"));
	        Scene sceneConfig = new Scene(config);
	        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
	        stageN.setScene(sceneConfig);
	        stageN.show();
		}
		
    }
	
	@FXML
    private void handleS1ButtonAction(ActionEvent event) throws Exception {
                String eventType;
		if (!MainController.getCurrentPlanet().equals("S1")) {
			MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("SPAAACE"));
			MainController.setCurrentPlanet("S1");
			MainController.setCurrentSolarSystem("SPAAACE");
			EventGeneratorSimple randEvent = new EventGeneratorSimple(MainController.getPlayer());
                    String trigger = randEvent.generate();
                    if (trigger.compareTo("none") != 0) {
                        eventType = randEvent.generate() + ".fxml";
                    } else {
                        eventType = "S1.fxml";
                    }
                } else {
                    eventType = "S1.fxml";
                }
		
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
        Parent config = FXMLLoader.load(getClass().getResource(eventType));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
             
    }
	
	@FXML
    private void handleS2ButtonAction(ActionEvent event) throws Exception {
		if (!MainController.getCurrentPlanet().equals("S2")) {
			MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("SPAAACE"));
			MainController.setCurrentPlanet("S2");
			MainController.setCurrentSolarSystem("SPAAACE");
			
		}
		
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
		Parent config = FXMLLoader.load(getClass().getResource("S2.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	@FXML
    private void handleS3ButtonAction(ActionEvent event) throws Exception {
		if (!MainController.getCurrentPlanet().equals("S3")) {
			MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("SPAAACE"));
			MainController.setCurrentPlanet("S3");
			MainController.setCurrentSolarSystem("SPAAACE");
			
		}
		
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
		Parent config = FXMLLoader.load(getClass().getResource("S3.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	@FXML
    private void handleS3PT2ButtonAction(ActionEvent event) throws Exception {
		if (!MainController.getCurrentPlanet().equals("S3PT2")) {
			MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("SPAAACE"));
			MainController.setCurrentPlanet("S3PT2");
			MainController.setCurrentSolarSystem("SPAAACE");
			
		}
		
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
		Parent config = FXMLLoader.load(getClass().getResource("S3PT2.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	@FXML
    private void handleYNSButtonAction(ActionEvent event) throws Exception {
		if (!MainController.getCurrentPlanet().equals("Your Naming Sucks")) {
			MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("SPAAACE"));
			MainController.setCurrentPlanet("Your Naming Sucks");
			MainController.setCurrentSolarSystem("SPAAACE");
			
		}
		//MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("SPAAACE"));
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
		Parent config = FXMLLoader.load(getClass().getResource("Your Naming Sucks.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
