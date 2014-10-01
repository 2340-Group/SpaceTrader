/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Universe Controller class
 *
 * @author Ryan
 */
public class S1Controller implements Initializable {
	
	/**
	 * quit button
	 * @param event
	 * @throws Exception
	 */
	@FXML
    private void handleQuitMenuItemAction(ActionEvent event) throws Exception {
        System.exit(0);
    }
	
	/**
	 * exit button
	 * @param event
	 * @throws Exception
	 */
	@FXML
    private void handleExitMenuItemAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource("SPAAACE.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	/**
	 * market pop up
	 * @param event
	 * @throws Exception
	 */
	public void handleMarket(ActionEvent event) throws Exception {
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        //dialog.initOwner(primaryStage);
        VBox dialogVbox = new VBox(20);
        
        ArrayList<Resource> richMerchant = new ArrayList<>();
		richMerchant.add(new Resource(ResourceType.WATER, 100));
		richMerchant.add(new Resource(ResourceType.ORE, 100));
		richMerchant.add(new Resource(ResourceType.FOOD, 100));
		richMerchant.add(new Resource(ResourceType.FURS, 100));
		richMerchant.add(new Resource(ResourceType.GAMES, 100));
		richMerchant.add(new Resource(ResourceType.FIREARMS, 100));
		richMerchant.add(new Resource(ResourceType.MEDICINE, 100));
		richMerchant.add(new Resource(ResourceType.MACHINES, 100));
		richMerchant.add(new Resource(ResourceType.NARCOTICS, 100));
		richMerchant.add(new Resource(ResourceType.ROBOTS, 100));
        Universe u = new Universe();
        u.generateUniverse();
        //ArrayList<Planet> pl = u.getplanetList();
        Planet s1 = u.getPlanet("S1");
        s1.setEcon(new Marketplace(richMerchant, s1.getTechLevel()));
        Marketplace m = s1.getEcon();
        ArrayList<Resource> resources = m.getResources();
        
        dialogVbox.getChildren().add(new Text("Market Items\n"));
        
        for (Resource r: resources) {
        	dialogVbox.getChildren().add(new Text(r.getName() + " costs " + r.getPrice() + " credits."));

        }
        //dialogVbox.getChildren().add(new Text("HI\n"));
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        dialog.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}