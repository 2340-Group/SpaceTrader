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
public class MoonController implements Initializable {
	/**
     * Exits to the SolarSystem
     * @param event
     * @throws Exception 
     */
    @FXML
    private void handleStupidity(ActionEvent event) throws Exception {
        if (MainController.getPlayer().getShip().getFuel() > 0) {
            Parent config = FXMLLoader.load(getClass().getResource("S1.fxml"));
            Scene sceneConfig = new Scene(config);
            Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stageN.setScene(sceneConfig);
            stageN.show();
        }	
    }
	
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	    // entriely delt with by the .fxml
    }  
    
}
