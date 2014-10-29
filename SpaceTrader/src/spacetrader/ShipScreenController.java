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
		switch (remain) {		// fall through on purpose
		case 3:
			sheild3.setText("EMPTY");
		case 2:
			sheild2.setText("EMPTY");
		case 1:
			sheild1.setText("EMPTY");
		default:
			break;
		}
		remain = st.getWeaponSlots();
		switch (remain) {		// fall through on purpose
		case 3:
			weapon3.setText("EMPTY");
		case 2:
			weapon2.setText("EMPTY");
		case 1:
			weapon1.setText("EMPTY");
		default:
			break;
		}
		remain = st.getGadgetSlots();
		switch (remain) {		// fall through on purpose
		case 3:
			gadget3.setText("EMPTY");
		case 2:
			gadget2.setText("EMPTY");
		case 1:
			gadget1.setText("EMPTY");
		default:
			break;
		}
		
		
		ArrayList<Equipment> l = displayMe.getSheilds();
		switch (l.size()) {		// fall through on purpose
		case 3:
			sheild3.setText("" + l.get(2));
		case 2:
			sheild2.setText("" + l.get(1));
		case 1:
			sheild1.setText("" + l.get(0));
		default:
			break;
		}
		
		l = displayMe.getWeapons();
		switch (l.size()) {		// fall through on purpose
		case 3:
			weapon3.setText("" + l.get(2));
		case 2:
			weapon2.setText("" + l.get(1));
		case 1:
			weapon1.setText("" + l.get(0));
		default:
			break;
		}
		
		l = displayMe.getGadgets();
		switch (l.size()) {		// fall through on purpose
		case 3:
			gadget3.setText(l.get(2).getGadgetName());
		case 2:
			gadget2.setText(l.get(1).getGadgetName());
		case 1:
			gadget1.setText(l.get(0).getGadgetName());
		default:
			break;
		}
	}
	
	/**
	 * goes to Planet screen
	 * @param event
	 * @throws Exception
	 */
	@FXML
	private void handleBackToSpaceButtonAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource(MainController.getCurrentPlanet() + ".fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
}
