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
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ShipUpgradeController implements Initializable{
	
	@FXML
	private Button weaponBasic;
	@FXML
	private Button weaponNormal;
	@FXML
	private Button weaponAdvanced;
	@FXML
	private Button sheildBasic;
	@FXML
	private Button sheildNormal;
	@FXML
	private Button sheildAdvanced;
	@FXML
	private Button gadgetFuel;
	@FXML
	private Button gadgetCargo;
	@FXML
	private Button gadgetEscape;
	@FXML
	private Label maxWeapon;
	@FXML
	private Label maxSheild;
	@FXML
	private Label maxGadget;
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
	 * tried to buy something
	 * @param event
	 * @throws Exception
	 */
	@FXML
    private void handleBuy(ActionEvent event) throws Exception {
		// Not coding this until after lunch (currently 5:57pm)
	}
	
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
	
	/**
	 * sets:
	 *  price of each Equipment
	 *  how much of each you can get
	 *  how much you currently have
	 *  unbuyable based on tech level
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		funds.setText("" + MainController.getPlayer().getFunds());
		priceBasicW.setText("" + Equipment.BASIC_FUEL.getPrice());
		priceNormalW.setText("" + Equipment.NORMAL_CARGO.getPrice());
		priceAdvanceW.setText("" + Equipment.ADVANCED_ESC.getPrice());
		priceBasicG.setText("" + Equipment.BASIC_FUEL.getPrice());
		priceNormalG.setText("" + Equipment.NORMAL_CARGO.getPrice());
		priceAdvanceG.setText("" + Equipment.ADVANCED_ESC.getPrice());
		priceBasicS.setText("" + Equipment.BASIC_FUEL.getPrice());
		priceNormalS.setText("" + Equipment.NORMAL_CARGO.getPrice());
		priceAdvanceS.setText("" + Equipment.ADVANCED_ESC.getPrice());
		Ship ship = MainController.getPlayer().getShip();
		ShipType st = ship.getType();
		int have = ship.getWeapons().size();
		int canHave = st.getWeaponSlots();
		maxWeapon.setText("Own: " + have + "\nof possible " + canHave);
		if(have == canHave)
		{
			weaponBasic.setDisable(true);
			weaponNormal.setDisable(true);
			weaponAdvanced.setDisable(true);
		}
		
		have = ship.getSheilds().size();
		canHave = st.getSheildSlots();
		maxSheild.setText("Own: " + have + "\nof possible " + canHave);
		if(have == canHave)
		{
			sheildBasic.setDisable(true);
			sheildNormal.setDisable(true);
			sheildAdvanced.setDisable(true);
		}
		
		int tech = MainController.getPlanetNotString().getTechLevel();
		switch(tech)	// fall through on purpose
	   	{
	   	case 3:
	   		gadgetFuel.setDisable(true);
	   		gadgetFuel.setText("Out of Stock");
	   	case 4:
	   		sheildNormal.setDisable(true);
	   		sheildNormal.setText("Out of Stock");
	   		weaponNormal.setDisable(true);
	   		weaponNormal.setText("Out of Stock");
	   	case 5:
	   		gadgetCargo.setDisable(true);
	   		gadgetCargo.setText("Out of Stock");
	   		sheildAdvanced.setDisable(true);
	   		sheildAdvanced.setText("Out of Stock");
	   		weaponAdvanced.setDisable(true);
	   		weaponAdvanced.setText("Out of Stock");
	   	case 6:
	   		gadgetEscape.setDisable(true);
	   		gadgetEscape.setText("Out of Stock");
	   	default:
	   		break;	//tech level seven has all ships
	   	}
		
		have = ship.getGadgets().size();
		canHave = st.getGadgetSlots();
		maxGadget.setText("Own: " + have + "\nof possible " + canHave);
		if(have == canHave)
		{
			gadgetFuel.setDisable(true);
			gadgetCargo.setDisable(true);
			gadgetEscape.setDisable(true);
		}
		if(have > 0)
		{
			ArrayList<Equipment> gadgets = ship.getGadgets();
			for(Equipment e: gadgets)
			{
				switch (e) {
				case BASIC_FUEL:
					gadgetFuel.setText("Own");
					gadgetFuel.setDisable(true);
					break;
				case NORMAL_CARGO:
					gadgetCargo.setText("Own");
					gadgetCargo.setDisable(true);
					break;
				case ADVANCED_ESC:
					gadgetEscape.setText("Own");
					gadgetEscape.setDisable(true);
				default:
					break;	//probably cheating
				}
			}
		}
	}
}
