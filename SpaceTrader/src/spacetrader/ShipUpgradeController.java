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

public class ShipUpgradeController implements Initializable{
	
	@FXML
	private Label funds;
	@FXML
	private Label priceBasicW;
	@FXML
	private Label priceNormalW;
	@FXML
	private Label priceAdvanceW;
	@FXML
	private Label priceBasicS;
	@FXML
	private Label priceNormalS;
	@FXML
	private Label priceAdvanceS;
	@FXML
	private Label priceBasicG;
	@FXML
	private Label priceNormalG;
	@FXML
	private Label priceAdvanceG;
	
    
    /**
	 * Leave button
	 * @param event
	 * @throws Exception
	 */
	@FXML
    private void handleReturnAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource(MainController.getCurrentPlanet() + ".fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		funds.setText("Funds: " + MainController.getPlayer().getFunds());
		priceBasicW.setText("" + Equipment.BASIC.getPrice());
		priceNormalW.setText("" + Equipment.NORMAL.getPrice());
		priceAdvanceW.setText("" + Equipment.ADVANCED.getPrice());
		priceBasicG.setText("" + Equipment.BASIC.getPrice());
		priceNormalG.setText("" + Equipment.NORMAL.getPrice());
		priceAdvanceG.setText("" + Equipment.ADVANCED.getPrice());
		priceBasicS.setText("" + Equipment.BASIC.getPrice());
		priceNormalS.setText("" + Equipment.NORMAL.getPrice());
		priceAdvanceS.setText("" + Equipment.ADVANCED.getPrice());
	}
}
