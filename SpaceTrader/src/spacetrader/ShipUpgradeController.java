package spacetrader;

import java.io.File;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class ShipUpgradeController implements Initializable{
	
    private Media deny;
    private MediaPlayer mediaPlayer;
    
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
	 * impossible to buy something that your ship cannot hold, these checks are made elsewhere
	 * @param event
	 * @throws Exception
	 */
	@FXML
    private void handleBuy(ActionEvent event) throws Exception {
		Button clicked = (Button) event.getSource();
		Equipment e = Equipment.NOTHING;
		boolean isGadget = false;
		if(clicked.equals(weaponBasic) || clicked.equals(sheildBasic)){
			e = Equipment.BASIC;
		}else if(clicked.equals(weaponNormal) || clicked.equals(sheildNormal)){
			e = Equipment.NORMAL;
		}else if(clicked.equals(weaponAdvanced) || clicked.equals(sheildAdvanced)){
			e = Equipment.ADVANCED;
		}else if(clicked.equals(gadgetFuel)){
			e = Equipment.BASIC;
			isGadget = true;
		}else if(clicked.equals(gadgetCargo)){
			e = Equipment.NORMAL;
			isGadget = true;
		}else if(clicked.equals(gadgetEscape)){
			e = Equipment.ADVANCED;
			isGadget = true;
		}

		if(e != Equipment.NOTHING)
		{
			int fund = MainController.getPlayer().getFunds();
	   		if(fund >= e.getPrice())
	   		{
	   			fund = fund - e.getPrice();
	   			MainController.getPlayer().setFunds(fund);
	   			funds.setText("" + fund);
	   			
	   			Ship ship = MainController.getPlayer().getShip();
	   			
	   			if(isGadget){
	   				ship.addGadget(e);
	   			}else if(clicked.equals(weaponBasic) || clicked.equals(weaponNormal) || clicked.equals(weaponAdvanced)){
	   				ship.addWeapon(e);
	   			}else if(clicked.equals(sheildBasic) || clicked.equals(sheildNormal) || clicked.equals(sheildAdvanced)){
	   				ship.addSheild(e);
	   			}
                
		   		greyOut();
	   		}else{
	   			mediaPlayer = new MediaPlayer(deny);
	            mediaPlayer.play();
	   		}
		}
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
		deny = new Media(new File("./src/spacetrader/Glitch Smashvox 2.wav").toURI().toString());
        mediaPlayer = new MediaPlayer(deny);
		funds.setText("" + MainController.getPlayer().getFunds());
		priceBasicW.setText("" + Equipment.BASIC.getPrice());
		priceNormalW.setText("" + Equipment.NORMAL.getPrice());
		priceAdvanceW.setText("" + Equipment.ADVANCED.getPrice());
		priceBasicG.setText("" + Equipment.BASIC.getPrice());
		priceNormalG.setText("" + Equipment.NORMAL.getPrice());
		priceAdvanceG.setText("" + Equipment.ADVANCED.getPrice());
		priceBasicS.setText("" + Equipment.BASIC.getPrice());
		priceNormalS.setText("" + Equipment.NORMAL.getPrice());
		priceAdvanceS.setText("" + Equipment.ADVANCED.getPrice());
		
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
		
		greyOut();
	}
	
	/**
	 * greys out the buttons that the player cannot select based upon:
	 * what the player's ship can hold
	 * what the player already owns
	 */
	private void greyOut()
	{
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
				case BASIC:
					gadgetFuel.setText("Own");
					gadgetFuel.setDisable(true);
					break;
				case NORMAL:
					gadgetCargo.setText("Own");
					gadgetCargo.setDisable(true);
					break;
				case ADVANCED:
					gadgetEscape.setText("Own");
					gadgetEscape.setDisable(true);
				default:
					break;	//probably cheating
				}
			}
		}
	}
}
