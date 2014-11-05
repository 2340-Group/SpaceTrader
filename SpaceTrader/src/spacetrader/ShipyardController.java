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

/**
 * Shipyard controller
 *
 * @author Jamie
 */
public class ShipyardController implements Initializable {

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
     *
     * @param event
     *            - clicked BuyFuel
     * @throws Exception
     */
    @FXML
    private void handleBuyFuelAction(ActionEvent event) throws Exception {
    if (MainController.getPlayer().getFunds() >= 10
        && MainController.getPlayer().getShip().getFuel() < MainController
        .getPlayer().getShip().getMaxFuel()) {
            SoundController.click();
        MainController.getPlayer().subtractFunds(10);
        MainController.getPlayer().getShip().addFuel(1);
        fundsLabel.setText("Funds\n"
            + MainController.getPlayer().getFunds());
        fuelLabel.setText("Fuel\n"
            + MainController.getPlayer().getShip().getFuel());
    } else {
            SoundController.deny();
        }
    }

    /**
     * buys the ship destroys all cargo, weapons, sheilds, and gadgets can
     * easily result in losing the game drops successful buyer off at the
     * ShipUpgrade.fxml screen
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleBuyShip(ActionEvent event) throws Exception {
    Button clicked = (Button) event.getSource();
    ShipType st;
    if (clicked.equals(buyFLEA)) {
        st = ShipType.FLEA;
    } else if (clicked.equals(buyGNAT)) {
        st = ShipType.GNAT;
    } else if (clicked.equals(buyBUMBLEBEE)) {
        st = ShipType.BUMBLEBEE;
    } else if (clicked.equals(buyBEETLE)) {
        st = ShipType.BEETLE;
    } else if (clicked.equals(buyHORNET)) {
        st = ShipType.HORNET;
    } else if (clicked.equals(buyGRASSHOPPER)) {
        st = ShipType.GRASSHOPPER;
    } else if (clicked.equals(buyTERMITE)) {
        st = ShipType.TERMITE;
    } else if (clicked.equals(buyWASP)) {
        st = ShipType.WASP;
    } else if (clicked.equals(buyMOSQUITO)) {
        st = ShipType.MOSQUITO;
    } else if (clicked.equals(buyFIREFLY)) {
        st = ShipType.FIREFLY;
    } else {
        st = ShipType.NOSHIP;
    }

    int funds = MainController.getPlayer().getFunds();
    if (funds >= st.getPrice()) {
            SoundController.click();
        funds = funds - st.getPrice();
        MainController.getPlayer().setFunds(funds);
        Ship newShip = new Ship(st, MainController.getPlayer().getShip()
            .getReputation(), MainController.getPlayer().getName(),
            null, null, null, st.getMaxDistance(), 100);
        MainController.getPlayer().setShip(newShip);
        fundsLabel.setText("Funds\n" + funds);

        handleShipUpgrade(event);
    } else {
        SoundController.deny();
    }
    }

    /**
     * leaves screen for ShipUpgrade.fxml
     *
     * @param event
     *            - clicked buyShipUpgrade
     * @throws Exception
     */
    @FXML
    private void handleShipUpgrade(ActionEvent event) throws Exception {
        SoundController.click();
    Parent config = FXMLLoader.load(getClass().getResource(
        "ShipUpgrade.fxml"));
    Scene sceneConfig = new Scene(config);
    Stage stageN = (Stage) fuelLabel.getScene().getWindow();
    stageN.setScene(sceneConfig);
    stageN.show();
    }

    /**
     * Leave button goes back to planet
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleLeaveShipyardAction(ActionEvent event) throws Exception {
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
     * sets displayed numbers for: prices ability to buy based on tech level
     * ability to buy based on what ship owned currrent fuel max fuel current
     * funds
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    fundsLabel.setText("Funds\n" + MainController.getPlayer().getFunds());
    fuelLabel.setText("Fuel\n"
        + MainController.getPlayer().getShip().getFuel());
    maxFuelLabel.setText("Max Fuel\n"
        + MainController.getPlayer().getShip().getMaxFuel());
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
    
    String current = "Current Ship";
    ShipType st = MainController.getPlayer().getShip().getType();
    switch (st) {
    case FLEA:
        buyFLEA.setDisable(true);
        buyFLEA.setText(current);
        break;
    case GNAT:
        buyGNAT.setDisable(true);
        buyGNAT.setText(current);
        break;
    case FIREFLY:
        buyFIREFLY.setDisable(true);
        buyFIREFLY.setText(current);
        break;
    case MOSQUITO:
        buyMOSQUITO.setDisable(true);
        buyMOSQUITO.setText(current);
        break;
    case BUMBLEBEE:
        buyBUMBLEBEE.setDisable(true);
        buyBUMBLEBEE.setText(current);
        break;
    case BEETLE:
        buyBEETLE.setDisable(true);
        buyBEETLE.setText(current);
        break;
    case HORNET:
        buyHORNET.setDisable(true);
        buyHORNET.setText(current);
        break;
    case GRASSHOPPER:
        buyGRASSHOPPER.setDisable(true);
        buyGRASSHOPPER.setText(current);
        break;
    case TERMITE:
        buyTERMITE.setDisable(true);
        buyTERMITE.setText(current);
        break;
    case WASP:
        buyWASP.setDisable(true);
        buyWASP.setText(current);
        break;
    default:
        // using ESCAPE
        break;
    }
    
    String out = "Out of Stock";
    switch (tech) // fall through on purpose
    {
    case 3:
        buyFIREFLY.setDisable(true);
        buyFIREFLY.setText(out);
        buyMOSQUITO.setDisable(true);
        buyMOSQUITO.setText(out);
    case 4:
        buyBUMBLEBEE.setDisable(true);
        buyBUMBLEBEE.setText(out);
        buyBEETLE.setDisable(true);
        buyBEETLE.setText(out);
    case 5:
        buyHORNET.setDisable(true);
        buyHORNET.setText(out);
        buyGRASSHOPPER.setDisable(true);
        buyGRASSHOPPER.setText(out);
    case 6:
        buyWASP.setDisable(true);
        buyWASP.setText(out);
        buyTERMITE.setDisable(true);
        buyTERMITE.setText(out);
    default:
        break; // tech level seven has all ships
    }
    }
}
