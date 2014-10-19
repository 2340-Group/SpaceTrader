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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ShipyardController implements Initializable {
	@FXML
	private Label fuelLabel;
	@FXML
	private Label fundsLabel;
	@FXML
	private Label maxFuelLabel;
	@FXML
	private Button buyFLEA;
	@FXML
	private Button buyGNAT;
	@FXML
	private Button buyBUMBLEBEE;
	@FXML
	private Button buyBEETLE;
	@FXML
	private Button buyHORNET;
	@FXML
	private Button buyGRASSHOPPER;
	@FXML
	private Button buyTERMITE;
	@FXML
	private Button buyWASP;
	@FXML
	private Button buyMOSQUITO;
	@FXML
	private Button buyFIREFLY;
	
   	@FXML
   	private void handleBuyFuelAction(ActionEvent event) throws Exception {
   		if (MainController.getPlayer().getFunds() >= 10 && (MainController.getPlayer().getShip().getFuel() <= (MainController.getPlayer().getShip().getType().getMaxDistance() - 1))) {
   			MainController.getPlayer().subtractFunds(10);
   			MainController.getPlayer().getShip().addFuel(1);
   	   		fundsLabel.setText("Funds\n" + MainController.getPlayer().getFunds());
   	   		fuelLabel.setText("Fuel\n" + MainController.getPlayer().getShip().getFuel());
   		}
   	}
   	
    /**
	 * Leave button
	 * @param event
	 * @throws Exception
	 */
	@FXML
    private void handleLeaveShipyardAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource(MainController.getCurrentPlanet() + ".fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		fundsLabel.setText("Funds\n" + MainController.getPlayer().getFunds());
	   	fuelLabel.setText("Fuel\n" + MainController.getPlayer().getShip().getFuel());
	   	maxFuelLabel.setText("Max Fuel\n" + MainController.getPlayer().getShip().getType().getMaxDistance());
	   	ShipType st = MainController.getPlayer().getShip().getType();
	   	switch (st) {
			case FLEA:
				buyFLEA.setDisable(true);
				buyFLEA.setText("Current Ship");
				break;
			case FIREFLY:
				buyFIREFLY.setDisable(true);
				buyFIREFLY.setText("Current Ship");
				break;
			case MOSQUITO:
				buyMOSQUITO.setDisable(true);
				buyMOSQUITO.setText("Current Ship");
				break;
			case BUMBLEBEE:
				buyBUMBLEBEE.setDisable(true);
				buyBUMBLEBEE.setText("Current Ship");
				break;
			case BEETLE:
				buyBEETLE.setDisable(true);
				buyBEETLE.setText("Current Ship");
				break;
			case HORNET:
				buyHORNET.setDisable(true);
				buyHORNET.setText("Current Ship");
				break;
			case GRASSHOPPER:
				buyGRASSHOPPER.setDisable(true);
				buyGRASSHOPPER.setText("Current Ship");
				break;
			case TERMITE:
				buyTERMITE.setDisable(true);
				buyTERMITE.setText("Current Ship");
				break;
			case WASP:
				buyWASP.setDisable(true);
				buyWASP.setText("Current Ship");
				break;
			default:
				buyGNAT.setDisable(true);
				//GNAT already says current Ship
				break;
		}
	}
}
