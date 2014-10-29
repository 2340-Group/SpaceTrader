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
public class UniverseController implements Initializable {

    @FXML
    private void handleQuitMenuItemAction(ActionEvent event) throws Exception {
	System.exit(0);
    }

    @FXML
    private void handleSPAAACEButtonAction(ActionEvent event) throws Exception {
	Parent config = FXMLLoader.load(getClass().getResource("SPAAACE.fxml"));
	Scene sceneConfig = new Scene(config);
	Stage stageN = (Stage) ((Node) event.getSource()).getScene()
		.getWindow();
	stageN.setScene(sceneConfig);
	stageN.show();
    }

    @FXML
    private void handleNameButtonAction(ActionEvent event) throws Exception {
	Parent config = FXMLLoader.load(getClass().getResource("NAME.fxml"));
	Scene sceneConfig = new Scene(config);
	Stage stageN = (Stage) ((Node) event.getSource()).getScene()
		.getWindow();
	stageN.setScene(sceneConfig);
	stageN.show();
    }

    @FXML
    private void handleNoNameButtonAction(ActionEvent event) throws Exception {
	Parent config = FXMLLoader.load(getClass().getResource("NONAME.fxml"));
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
	// TODO
    }

}
