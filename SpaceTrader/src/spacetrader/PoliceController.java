package spacetrader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * FXML Controller class
 *
 * @author lewisdiego
 */
public class PoliceController implements Initializable {

    private PoliceEvent policeEvent = new PoliceEvent();
    @FXML
    private Label funds;

    @FXML
    private void handleContinueButtonAction(ActionEvent event) throws Exception {
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
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    policeEvent.act(MainController.getPlayer());
    funds.setText("" + (MainController.getPlayer().getFunds()));
    }

}
