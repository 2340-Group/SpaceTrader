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

public class ShipScreenController implements Initializable {
    @FXML
    private Button returnToPlanet;
    @FXML
    private Label shipType;
    @FXML
    private Label health;
    @FXML
    private Label sheild1;
    @FXML
    private Label sheild2;
    @FXML
    private Label sheild3;
    @FXML
    private Label weapon1;
    @FXML
    private Label weapon2;
    @FXML
    private Label weapon3;
    @FXML
    private Label gadget1;
    @FXML
    private Label gadget2;
    @FXML
    private Label gadget3;
    @FXML
    private Label currentFuel;
    @FXML
    private Label currentCargo;
    @FXML
    private Label maxFuel;
    @FXML
    private Label maxCargo;

    /**
     * sets display for current Ship, CargoBay, fuel, and Equipment
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
	Ship displayMe = MainController.getPlayer().getShip();
	ShipType st = displayMe.getType();
	shipType.setText("" + st);
	health.setText("" + displayMe.getHealth());
	currentFuel.setText("" + displayMe.getFuel());
	currentCargo.setText("" + displayMe.getCargo().getCurrentVolume());
	maxFuel.setText("" + displayMe.getMaxFuel());
	maxCargo.setText("" + displayMe.getMaxCargo());

	int remain = st.getSheildSlots();
	switch (remain) { // fall through on purpose
	case 3:
	    sheild3.setText(displayMe.getSheild(2));
	case 2:
	    sheild2.setText(displayMe.getSheild(1));
	case 1:
	    sheild1.setText(displayMe.getSheild(0));
	default:
	    break;
	}
	remain = st.getWeaponSlots();
	switch (remain) { // fall through on purpose
	case 3:
	    weapon3.setText(displayMe.getWeapon(2));
	case 2:
	    weapon2.setText(displayMe.getWeapon(1));
	case 1:
	    weapon1.setText(displayMe.getWeapon(0));
	default:
	    break;
	}
	remain = st.getGadgetSlots();
	switch (remain) { // fall through on purpose
	case 3:
	    gadget3.setText(displayMe.getGadget(2));
	case 2:
	    gadget2.setText(displayMe.getGadget(1));
	case 1:
	    gadget1.setText(displayMe.getGadget(0));
	default:
	    break;
	}
    }

    /**
     * goes to Planet screen
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleBackToSpaceButtonAction(ActionEvent event)
	    throws Exception {
	Parent config = FXMLLoader.load(getClass().getResource(
		MainController.getCurrentPlanet() + ".fxml"));
	Scene sceneConfig = new Scene(config);
	Stage stageN = (Stage) ((Node) event.getSource()).getScene()
		.getWindow();
	stageN.setScene(sceneConfig);
	stageN.show();
    }
}
