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
    private void handleERRORButtonAction(ActionEvent event) throws Exception {
			if (!MainController.getCurrentPlanet().equals("ERROR")) {
				MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("NONAME"));
				MainController.setCurrentPlanet("ERROR");
				MainController.setCurrentSolarSystem("NONAME");
				//MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("NONAME"));
			}
			
			MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
			Parent config = FXMLLoader.load(getClass().getResource("ERROR.fxml"));
	        Scene sceneConfig = new Scene(config);
	        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
	        stageN.setScene(sceneConfig);
	        stageN.show();
		
		
    }
	
	@FXML
    private void handleBlankButtonAction(ActionEvent event) throws Exception {

		if (!MainController.getCurrentPlanet().equals("Blank")) {
			MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("NONAME"));
			MainController.setCurrentPlanet("Blank");
			MainController.setCurrentSolarSystem("NONAME");
			//MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("NONAME"));
		}
			
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
		Parent config = FXMLLoader.load(getClass().getResource("Blank.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
		
	
    }
	
	@FXML
    private void handleInsertNameButtonAction(ActionEvent event) throws Exception {
		if (!MainController.getCurrentPlanet().equals("InsertName")) {
			MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("NONAME"));
			MainController.setCurrentPlanet("InsertName");
			MainController.setCurrentSolarSystem("NONAME");
			//MainController.getPlayer().getShip().useFuel(MainController.getFuelCost("NONAME"));
		}
		
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
		Parent config = FXMLLoader.load(getClass().getResource("InsertName.fxml"));
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
