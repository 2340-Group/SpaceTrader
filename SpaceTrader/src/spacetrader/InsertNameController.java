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
public class InsertNameController implements Initializable {
	@FXML
	private Label fuelLabel;
	@FXML
	private Label fundsLabel;
	
	@FXML
    private void handleQuitMenuItemAction(ActionEvent event) throws Exception {
        System.exit(0);
    }
	
	@FXML
    private void handleExitMenuItemAction(ActionEvent event) throws Exception {
		if (MainController.getPlayer().getShip().getFuel() > 0) {
			Parent config = FXMLLoader.load(getClass().getResource("NONAME.fxml"));
	        Scene sceneConfig = new Scene(config);
	        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
	        stageN.setScene(sceneConfig);
	        stageN.show();
		}
		
    }
	
	/**
	 * market pop up
	 * @param event
	 * @throws Exception
	 */
	@FXML
	public void handleMarket(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource("Marketplace.fxml"));
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
    	fundsLabel.setText("FUNDS\n" + MainController.getPlayer().getFunds());
    	fuelLabel.setText("FUEL\n" + MainController.getPlayer().getShip().getFuel());
    }    
    
}
