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
public class NAMEController implements Initializable {
	
	@FXML
    private void handleQuitMenuItemAction(ActionEvent event) throws Exception {
        System.exit(0);
    }
	
	@FXML
    private void handleExitMenuItemAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource("Universe.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	@FXML
    private void handleBigButtonAction(ActionEvent event) throws Exception {
		MainController.setCurrentPlanet("Big");
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
		Parent config = FXMLLoader.load(getClass().getResource("Big.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	@FXML
    private void handleGiantButtonAction(ActionEvent event) throws Exception {
		MainController.setCurrentPlanet("Giant");
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
		Parent config = FXMLLoader.load(getClass().getResource("Giant.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	@FXML
    private void handlePlanetButtonAction(ActionEvent event) throws Exception {
		MainController.setCurrentPlanet("Planet");
		MainController.getPlayer().setLocation(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getX(), MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getY());
		Parent config = FXMLLoader.load(getClass().getResource("Planet.fxml"));
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
