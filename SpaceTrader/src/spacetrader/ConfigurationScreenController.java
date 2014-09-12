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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jesse
 */
public class ConfigurationScreenController implements Initializable {

    private String name = "";
    private int remainingPoints = 10, pilotPoints = 0, fighterPoints = 0, traderPoints = 0, engineerPoints = 0;
    
    @FXML
    private TextField nameField;
    //@FXML
    //private Button minusPilot, plusPilot, minusFighter, plusFighter, minusTrader, plusTrader, minusEngineer, plusEngineer, cancelBtn, doneBtn;
    @FXML
    private Label remainingPointsLabel, pilotPointsLabel, fighterPointsLabel, traderPointsLabel, engineerPointsLabel;
    
    @FXML
    private void subtractPilot(ActionEvent event) {
        if (pilotPoints > 0) {
            remainingPoints++;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            pilotPoints--;
            pilotPointsLabel.setText("Pilot\n" + pilotPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Pilot Points: " + pilotPoints);
        }
    }
    
    @FXML
    private void addPilot(ActionEvent event) {
        if (remainingPoints > 0) {
            remainingPoints--;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            pilotPoints++;
            pilotPointsLabel.setText("Pilot\n" + pilotPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Pilot Points: " + pilotPoints);
        }
    }
    
    @FXML
    private void subtractFighter(ActionEvent event) {
        if (fighterPoints > 0) {
            remainingPoints++;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            fighterPoints--;
            fighterPointsLabel.setText("Fighter\n" + fighterPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Fighter Points: " + fighterPoints);
        }
    }
    
    @FXML
    private void addFighter(ActionEvent event) {
        if (remainingPoints > 0) {
            remainingPoints--;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            fighterPoints++;
            fighterPointsLabel.setText("Fighter\n" + fighterPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Fighter Points: " + fighterPoints);
        }
    }
    
    @FXML
    private void subtractTrader(ActionEvent event) {
        if (traderPoints > 0) {
            remainingPoints++;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            traderPoints--;
            traderPointsLabel.setText("Trader\n" + traderPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Trader Points: " + traderPoints);
        }
    }
    
    @FXML
    private void addTrader(ActionEvent event) {
        if (remainingPoints > 0) {
            remainingPoints--;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            traderPoints++;
            traderPointsLabel.setText("Trader\n" + traderPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Trader Points: " + traderPoints);
        }
    }
    
    @FXML
    private void subtractEngineer(ActionEvent event) {
        if (engineerPoints > 0) {
            remainingPoints++;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            engineerPoints--;
            engineerPointsLabel.setText("Engineer\n" + engineerPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Engineer Points: " + engineerPoints);
        }
    }
    
    @FXML
    private void addEngineer(ActionEvent event) {
        if (remainingPoints > 0) {
            remainingPoints--;
            remainingPointsLabel.setText("Remaining Points\n" + remainingPoints);
            engineerPoints++;
            engineerPointsLabel.setText("Engineer\n" + engineerPoints);
            System.out.println("Remaining Points: " + remainingPoints);
            System.out.println("Engineer Points: " + engineerPoints);
        }
    }
    
    @FXML
    private void cancel(ActionEvent event) {
        
    }
    
    @FXML
    private void done(ActionEvent event) {
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
