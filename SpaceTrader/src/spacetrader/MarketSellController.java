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
 * Marketplace Sell
 * @author
 */
public class MarketSellController implements Initializable {

    private int waterTotal = 0, oreTotal = 0, foodTotal = 0, fursTotal = 0,
	    gamesTotal = 0, firearmsTotal = 0, medicineTotal = 0,
	    machinesTotal = 0, narcoticsTotal = 0, robotsTotal = 0,
	    tempFunds = 0;
    private Marketplace missingNo;
    @FXML
    private Label capacityLabel;
    @FXML
    private Label fundsLabel;
    @FXML
    private Label costLabel;
    @FXML
    private Label inventoryLabel;
    @FXML
    private Label waterLabel;
    @FXML
    private Label oreLabel;
    @FXML
    private Label foodLabel;
    @FXML
    private Label fursLabel;
    @FXML
    private Label gamesLabel;
    @FXML
    private Label firearmsLabel;
    @FXML
    private Label medicineLabel;
    @FXML
    private Label machinesLabel;
    @FXML
    private Label narcoticsLabel;
    @FXML
    private Label robotsLabel;
    @FXML
    private Button minusWater;
    @FXML
    private Button minusOre;
    @FXML
    private Button minusFood;
    @FXML
    private Button minusFurs;
    @FXML
    private Button minusGames;
    @FXML
    private Button minusFirearms;
    @FXML
    private Button minusMedicine;
    @FXML
    private Button minusMachines;
    @FXML
    private Button minusNarcotics;
    @FXML
    private Button minusRobots;
    @FXML
    private Button plusWater;
    @FXML
    private Button plusOre;
    @FXML
    private Button plusFood;
    @FXML
    private Button plusFurs;
    @FXML
    private Button plusGames;
    @FXML
    private Button plusFirearms;
    @FXML
    private Button plusMedicine;
    @FXML
    private Button plusMachines;
    @FXML
    private Button plusNarcotics;
    @FXML
    private Button plusRobots;

    // Water
    @FXML
    private void subtractWater(ActionEvent event) {
	if (waterTotal > 0) {
            SoundController.click();
	    waterTotal--;
	    waterLabel.setText("WATER\n" + waterTotal);
	} else {
            SoundController.deny();
        }
    }

    @FXML
    private void addWater(ActionEvent event) {
	if (waterTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.WATER, 100))) {
            SoundController.click();
	    waterTotal++;
	    waterLabel.setText("WATER\n" + waterTotal);
	} else {
            SoundController.deny();
        }
    }

    // ORE
    @FXML
    private void subtractOre(ActionEvent event) {
	if (oreTotal > 0) {
            SoundController.click();
	    oreTotal--;
	    oreLabel.setText("ORE\n" + oreTotal);
	} else {
            SoundController.deny();
        }
	// add deny sound for else
    }

    @FXML
    private void addOre(ActionEvent event) {
	if (oreTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.ORE, 100))) {
            SoundController.click();
	    oreTotal++;
	    oreLabel.setText("ORE\n" + oreTotal);
	} else {
            SoundController.deny();
        }

    }

    // Food
    @FXML
    private void subtractFood(ActionEvent event) {
	if (foodTotal > 0) {
            SoundController.click();
	    foodTotal--;
	    foodLabel.setText("FOOD\n" + foodTotal);
	} else {
            SoundController.deny();
        }
	// add deny sound for else
    }

    @FXML
    private void addFood(ActionEvent event) {
	if (foodTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.FOOD, 100))) {
            SoundController.click();
	    foodTotal++;
	    foodLabel.setText("FOOD\n" + foodTotal);
	} else {
            SoundController.deny();
        }

    }

    // Furs
    @FXML
    private void subtractFurs(ActionEvent event) {
	if (fursTotal > 0) {
            SoundController.click();
	    fursTotal--;
	    fursLabel.setText("FURS\n" + fursTotal);
	} else {
            SoundController.deny();
        }
	// add deny sound for else
    }

    @FXML
    private void addFurs(ActionEvent event) {
	if (fursTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.FURS, 100))) {
            SoundController.click();
	    fursTotal++;
	    fursLabel.setText("FURS\n" + fursTotal);
	} else {
            SoundController.deny();
        }

    }

    // Games
    @FXML
    private void subtractGames(ActionEvent event) {
	if (gamesTotal > 0) {
            SoundController.click();
	    gamesTotal--;
	    gamesLabel.setText("GAMES\n" + gamesTotal);
	} else {
            SoundController.deny();
        }
    }

    @FXML
    private void addGames(ActionEvent event) {
	if (gamesTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.GAMES, 100))) {
            SoundController.click();
	    gamesTotal++;
	    gamesLabel.setText("GAMES\n" + gamesTotal);
	} else {
            SoundController.deny();
        }

    }

    // Firearms
    @FXML
    private void subtractFirearms(ActionEvent event) {
	if (firearmsTotal > 0) {
            SoundController.click();
	    firearmsTotal--;
	    firearmsLabel.setText("FIREARMS\n" + firearmsTotal);
	} else {
            SoundController.deny();
        }
    }

    @FXML
    private void addFirearms(ActionEvent event) {
	if (firearmsTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.FIREARMS, 100))) {
            SoundController.click();
	    firearmsTotal++;
	    firearmsLabel.setText("FIREARMS\n" + firearmsTotal);
	} else {
            SoundController.deny();
        }

    }

    // Medicine
    @FXML
    private void subtractMedicine(ActionEvent event) {
	if (medicineTotal > 0) {
            SoundController.click();
	    medicineTotal--;
	    medicineLabel.setText("MEDICINE\n" + medicineTotal);
	} else {
            SoundController.deny();
        }
    }

    @FXML
    private void addMedicine(ActionEvent event) {
	if (medicineTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.MEDICINE, 100))) {
            SoundController.click();
	    medicineTotal++;
	    medicineLabel.setText("MEDICINE\n" + medicineTotal);
	} else {
            SoundController.deny();
        }

    }

    // Machines
    @FXML
    private void subtractMachines(ActionEvent event) {
	if (machinesTotal > 0) {
            SoundController.click();
	    machinesTotal--;
	    machinesLabel.setText("MACHINES/n" + machinesTotal);
	} else {
            SoundController.deny();
        }
    }

    @FXML
    private void addMachines(ActionEvent event) {
	if (machinesTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.MACHINES, 100))) {
            SoundController.click();
	    machinesTotal++;
	    machinesLabel.setText("MACHINES\n" + machinesTotal);
	} else {
            SoundController.deny();
        }

    }

    // Narcotics
    @FXML
    private void subtractNarcotics(ActionEvent event) {
	if (narcoticsTotal > 0) {
            SoundController.click();
	    narcoticsTotal--;
	    narcoticsLabel.setText("NARCOTICS\n" + narcoticsTotal);
	} else {
            SoundController.deny();
        }
    }

    @FXML
    private void addNarcotics(ActionEvent event) {
	if (narcoticsTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.NARCOTICS, 100))) {
            SoundController.click();
	    narcoticsTotal++;
	    narcoticsLabel.setText("NARCOTICS\n" + narcoticsTotal);
	} else {
            SoundController.deny();
        }

    }

    // Robots
    @FXML
    private void subtractRobot(ActionEvent event) {
	if (robotsTotal > 0) {
            SoundController.click();
	    robotsTotal--;
	    robotsLabel.setText("ROBOTS\n" + robotsTotal);
	} else {
            SoundController.deny();
        }
    }

    @FXML
    private void addRobot(ActionEvent event) {
	if (robotsTotal < MainController.getPlayer().getShip().getCargo()
		.getResourceStock(new Resource(ResourceType.ROBOTS, 100))) {
            SoundController.click();
	    robotsTotal++;
	    robotsLabel.setText("ROBOTS\n" + robotsTotal);
	} else {
            SoundController.deny();
        }

    }

    /**
     * sell button
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleSellMarketAction(ActionEvent event) throws Exception {
	// subtract inventory & add funds
        SoundController.click();
	missingNo = MainController.getUniverse()
		.getPlanet(MainController.getCurrentPlanet()).getEcon();
	if (waterTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(0), waterTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (oreTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(1), oreTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (foodTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(2), foodTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (fursTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(3), fursTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (gamesTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(4), gamesTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (firearmsTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(5), firearmsTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (medicineTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(6), medicineTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (machinesTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(7), machinesTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (narcoticsTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(8), narcoticsTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (robotsTotal > 0) {
	    missingNo.sell(missingNo.getResources().get(9), robotsTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}

	// cargoTotal =
	// MainController.getPlayer().getShip().getCargo().getCurrentVolume();
	resetMarket();
	tempFunds = MainController.getPlayer().getFunds();
	fundsLabel.setText("FUNDS\n" + tempFunds);
	inventoryLabel.setText(MainController.getPlayer().getShip().getCargo()
		.printCargo());
    }

    /**
     * sell all button
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleSellAllMarketAction(ActionEvent event) throws Exception {
	// subtract all inventory and add funds
        SoundController.click();
	missingNo = MainController.getUniverse()
		.getPlanet(MainController.getCurrentPlanet()).getEcon();
	for (int i = 0; i < missingNo.getResources().size(); i++) {
	    missingNo.sell(missingNo.getResources().get(i), missingNo
		    .getResources().get(i).getQuantity(), MainController
		    .getPlayer(), MainController.getPlayer().getShip());
	}
	resetMarket();
	tempFunds = MainController.getPlayer().getFunds();
	fundsLabel.setText("FUNDS\n" + tempFunds);
	inventoryLabel.setText(MainController.getPlayer().getShip().getCargo()
		.printCargo());
    }

    private void resetMarket() {
	waterTotal = 0;
	oreTotal = 0;
	foodTotal = 0;
	fursTotal = 0;
	gamesTotal = 0;
	firearmsTotal = 0;
	medicineTotal = 0;
	machinesTotal = 0;
	narcoticsTotal = 0;
	robotsTotal = 0;
	tempFunds = 0;
	waterLabel.setText("WATER\n" + waterTotal);
	oreLabel.setText("ORE\n" + oreTotal);
	foodLabel.setText("FOOD\n" + foodTotal);
	fursLabel.setText("FURS\n" + fursTotal);
	gamesLabel.setText("GAMES\n" + gamesTotal);
	firearmsLabel.setText("FIREARMS\n" + firearmsTotal);
	medicineLabel.setText("MEDICINE\n" + medicineTotal);
	machinesLabel.setText("MACHINES\n" + machinesTotal);
	narcoticsLabel.setText("NARCOTICS\n" + narcoticsTotal);
	robotsLabel.setText("ROBOTS\n" + robotsTotal);
    }

    /**
     * Leave button
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleLeaveMarketAction(ActionEvent event) throws Exception {
        SoundController.click();
	Parent config = FXMLLoader.load(getClass().getResource(
		"Marketplace.fxml"));
	Scene sceneConfig = new Scene(config);
	Stage stageN = (Stage) ((Node) event.getSource()).getScene()
		.getWindow();
	stageN.setScene(sceneConfig);
	stageN.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
	// cargoTotal =
	// MainController.getPlayer().getShip().getCargo().getCurrentVolume();
	capacityLabel.setText("Your ship holds a maximum of "
		+ MainController.getPlayer().getShip().getMaxCargo()
		+ " resources.");
	tempFunds = MainController.getPlayer().getFunds();
	fundsLabel.setText("FUNDS\n" + tempFunds);
	costLabel.setText(MainController.getUniverse()
		.getPlanet(MainController.getCurrentPlanet()).getEcon()
		.listPrices());
	inventoryLabel.setText(MainController.getPlayer().getShip().getCargo()
		.printCargo());
    }

}
