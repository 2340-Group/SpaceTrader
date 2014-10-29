package spacetrader;

import java.io.File;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class ShipyardController implements Initializable {
	
    private Media deny;
    private MediaPlayer mediaPlayer;
	
    @FXML
	private Label techLevelLabel;
	@FXML
	private Label fuelLabel;
	@FXML
	private Label fundsLabel;
	@FXML
	private Label maxFuelLabel;
	@FXML
	private Label fleaPrice;
	@FXML
	private Label gnatPrice;
	@FXML
	private Label bumblebeePrice;
	@FXML
	private Label beetlePrice;
	@FXML
	private Label hornetPrice;
	@FXML
	private Label grasshopperPrice;
	@FXML
	private Label termitePrice;
	@FXML
	private Label waspPrice;
	@FXML
	private Label mosquitoPrice;
	@FXML
	private Label fireflyPrice;
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
	
	/**
	 * buys one unit of fuel if sufficient funds
	 * @param event - clicked BuyFuel
	 * @throws Exception
	 */
   	@FXML
   	private void handleBuyFuelAction(ActionEvent event) throws Exception {
   		if (MainController.getPlayer().getFunds() >= 10 && MainController.getPlayer().getShip().getFuel() < MainController.getPlayer().getShip().getMaxFuel()) {
   			MainController.getPlayer().subtractFunds(10);
   			MainController.getPlayer().getShip().addFuel(1);
   	   		fundsLabel.setText("Funds\n" + MainController.getPlayer().getFunds());
   	   		fuelLabel.setText("Fuel\n" + MainController.getPlayer().getShip().getFuel());
   		}
   	}
   	
   	/**
   	 * buys the ship
   	 * destroys all cargo, weapons, sheilds, and gadgets
   	 * can easily result in losing the game
   	 * drops successful buyer off at the ShipUpgrade.fxml screen
   	 * @param event
   	 * @throws Exception
   	 */
   	@FXML
   	private void handleBuyShip(ActionEvent event) throws Exception {
	   	Button clicked = (Button) event.getSource();
	   	ShipType st;
	   	if(clicked.equals(buyFLEA)){
	   		st = ShipType.FLEA;
	   	}else if(clicked.equals(buyGNAT)){
	   		st = ShipType.GNAT;
	   	}else if(clicked.equals(buyBUMBLEBEE)){
	   		st = ShipType.BUMBLEBEE;
	   	}else if(clicked.equals(buyBEETLE)){
	   		st = ShipType.BEETLE;
	   	}else if(clicked.equals(buyHORNET)){
	   		st = ShipType.HORNET;
	   	}else if(clicked.equals(buyGRASSHOPPER)){
	   		st = ShipType.GRASSHOPPER;
	   	}else if(clicked.equals(buyTERMITE)){
	   		st = ShipType.TERMITE;
	   	}else if(clicked.equals(buyWASP)){
	   		st = ShipType.WASP;
	   	}else if(clicked.equals(buyMOSQUITO)){
	   		st = ShipType.MOSQUITO;
	   	}else if(clicked.equals(buyFIREFLY)){
	   		st = ShipType.FIREFLY;
	   	}else{
	   		st = ShipType.NOSHIP;
	   	}
	   	
		int funds = MainController.getPlayer().getFunds();
	   	if(funds >= st.getPrice())
	   	{
	   		funds = funds - st.getPrice();
	   		MainController.getPlayer().setFunds(funds);
		   	Ship newShip = new Ship(st, MainController.getPlayer().getShip().getReputation(), MainController.getPlayer().getName(), null, null, null, st.getMaxDistance(), 100);
		   	MainController.getPlayer().setShip(newShip);
		   	fundsLabel.setText("Funds\n" + funds);
		   	
		   	handleShipUpgrade(event);
	   	}else{
	   		mediaPlayer = new MediaPlayer(deny);
	        mediaPlayer.play();
	   	}
   	}
   	
   	/**
   	 * leaves screen for ShipUpgrade.fxml
   	 * @param event - clicked buyShipUpgrade
   	 * @throws Exception
   	 */
   	@FXML
   	private void handleShipUpgrade(ActionEvent event) throws Exception {
   		Parent config = FXMLLoader.load(getClass().getResource("ShipUpgrade.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) fuelLabel.getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
   	}
   	
    /**
	 * Leave button goes back to planet
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
	
	/**
	 * sets displayed numbers for:
	 *  prices
	 *  ability to buy based on tech level
	 *  ability to buy based on what ship owned
	 *  currrent fuel
	 *  max fuel
	 *  current funds
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		deny = new Media(new File("./src/spacetrader/Glitch Smashvox 2.wav").toURI().toString());
        mediaPlayer = new MediaPlayer(deny);
		fundsLabel.setText("Funds\n" + MainController.getPlayer().getFunds());
	   	fuelLabel.setText("Fuel\n" + MainController.getPlayer().getShip().getFuel());
	   	maxFuelLabel.setText("Max Fuel\n" + MainController.getPlayer().getShip().getMaxFuel());
	   	fleaPrice.setText(" " + ShipType.FLEA.getPrice());
	   	gnatPrice.setText(" " + ShipType.GNAT.getPrice());
	   	bumblebeePrice.setText(" " + ShipType.BUMBLEBEE.getPrice());
	   	beetlePrice.setText(" " + ShipType.BEETLE.getPrice());
	   	hornetPrice.setText(" " + ShipType.HORNET.getPrice());
	   	grasshopperPrice.setText(" " + ShipType.GRASSHOPPER.getPrice());
	   	termitePrice.setText(" " + ShipType.TERMITE.getPrice());
	   	waspPrice.setText(" " + ShipType.WASP.getPrice());
	   	mosquitoPrice.setText(" " + ShipType.MOSQUITO.getPrice());
	   	fireflyPrice.setText(" " + ShipType.FIREFLY.getPrice());
	   	int tech = MainController.getPlanetNotString().getTechLevel();
	   	techLevelLabel.setText("TechLevel\n" + tech);
		
	   	ShipType st = MainController.getPlayer().getShip().getType();
	   	switch (st) {
			case FLEA:
				buyFLEA.setDisable(true);
				buyFLEA.setText("Current Ship");
				break;
			case GNAT:
				buyGNAT.setDisable(true);
				buyGNAT.setText("Current Ship");
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
				// using ESCAPE
				break;
		}
	   	
	   	switch(tech)	// fall through on purpose
	   	{
	   	case 3:
	   		buyFIREFLY.setDisable(true);
			buyFIREFLY.setText("Out of Stock");
			buyMOSQUITO.setDisable(true);
			buyMOSQUITO.setText("Out of Stock");
	   	case 4:
			buyBUMBLEBEE.setDisable(true);
			buyBUMBLEBEE.setText("Out of Stock");
			buyBEETLE.setDisable(true);
			buyBEETLE.setText("Out of Stock");
	   	case 5:
			buyHORNET.setDisable(true);
			buyHORNET.setText("Out of Stock");
			buyGRASSHOPPER.setDisable(true);
			buyGRASSHOPPER.setText("Out of Stock");
	   	case 6:
	   		buyWASP.setDisable(true);
			buyWASP.setText("Out of Stock");
			buyTERMITE.setDisable(true);
			buyTERMITE.setText("Out of Stock");
	   	default:
	   		break;	//tech level seven has all ships
	   	}
	}
}
