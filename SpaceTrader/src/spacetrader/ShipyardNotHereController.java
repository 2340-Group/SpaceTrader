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

public class ShipyardNotHereController implements Initializable {
    /**
     * Exits to the Planet
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleLeaveShipyard(ActionEvent event) throws Exception {
        SoundController.click();
	Parent config = FXMLLoader.load(getClass().getResource(
		MainController.getCurrentPlanet() + ".fxml"));
	Scene sceneConfig = new Scene(config);
	Stage stageN = (Stage) ((Node) event.getSource()).getScene()
		.getWindow();
	stageN.setScene(sceneConfig);
	stageN.show();
    }

    /**
     * entirely set up by the .fxml
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	// entirely set up by .fxml
    }

}
