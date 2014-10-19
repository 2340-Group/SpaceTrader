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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Ship displayMe = MainController.getPlayer().getShip();
		shipType.setText("" + displayMe.getType());
		currentCargo.setText("" + displayMe.getCargo().getCurrentVolume());
		currentFuel.setText("" + displayMe.getFuel());
		maxFuel.setText("" + displayMe.getType().getMaxDistance());
		maxCargo.setText("" + displayMe.getType().getCargoSlots());
		
		ArrayList<Equipment> l = displayMe.getSheilds();	//Sorry
		if(!l.isEmpty())
		{
			sheild1.setText("" + l.remove(0));
		}
		if(!l.isEmpty())
		{
			sheild2.setText("" + l.remove(0));
		}
		if(!l.isEmpty())
		{
			sheild3.setText("" + l.remove(0));
		}
		l = displayMe.getWeapons();
		if(!l.isEmpty())
		{
			weapon1.setText("" + l.remove(0));
		}
		if(!l.isEmpty())
		{
			weapon2.setText("" + l.remove(0));
		}
		if(!l.isEmpty())
		{
			weapon3.setText("" + l.remove(0));
		}
		l = displayMe.getGadgets();
		if(!l.isEmpty())
		{
			gadget1.setText("" + l.remove(0));
		}
		if(!l.isEmpty())
		{
			gadget2.setText("" + l.remove(0));
		}
		if(!l.isEmpty())
		{
			gadget3.setText("" + l.remove(0));
		}
	}
	
	@FXML
	private void handleBackToSpaceButtonAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource(MainController.getCurrentPlanet() + ".fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
    }
}
