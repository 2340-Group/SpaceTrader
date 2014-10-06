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
import javafx.stage.Stage;

public class MarketplaceController implements Initializable {

	@FXML
	private void handleBuyButtonAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource("MarketplaceBuy.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	@FXML
	private void handleSellButtonAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource("MarketplaceSell.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	@FXML
	private void handleLeaveButtonAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource(MainController.getCurrentPlanet() + ".fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		ArrayList<Resource> Merchant = new ArrayList<>();
		Merchant.add(new Resource(ResourceType.WATER, 100));
		Merchant.add(new Resource(ResourceType.ORE, 100));
		Merchant.add(new Resource(ResourceType.FOOD, 100));
		Merchant.add(new Resource(ResourceType.FURS, 100));
		Merchant.add(new Resource(ResourceType.GAMES, 100));
		Merchant.add(new Resource(ResourceType.FIREARMS, 100));
		Merchant.add(new Resource(ResourceType.MEDICINE, 100));
		Merchant.add(new Resource(ResourceType.MACHINES, 100));
		Merchant.add(new Resource(ResourceType.NARCOTICS, 100));
		Merchant.add(new Resource(ResourceType.ROBOTS, 100));
		
		MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).setEcon(new Marketplace(Merchant, MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getTechLevel()));
		
	}

}
