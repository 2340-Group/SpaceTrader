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

public class MarketBuyController implements Initializable {

    private int waterTotal = 0, oreTotal = 0, foodTotal = 0, fursTotal = 0,
	    gamesTotal = 0, firearmsTotal = 0, medicineTotal = 0,
	    machinesTotal = 0, narcoticsTotal = 0, robotsTotal = 0,
	    tempFunds = 0, cargoTotal = 0;
    private Marketplace missingNo;
    @FXML
    private Label fuelLabel;
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
    
    private String pmd = "FUNDS\n";

    // Water
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractWater(ActionEvent event) {
	if (waterTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    waterTotal--;
	    waterLabel.setText("WATER\n" + waterTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Water");
	    fundsLabel.setText(pmd + tempFunds);

	    //
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addWater(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Water")) {
            SoundController.click();
	    cargoTotal++;
	    waterTotal++;
	    waterLabel.setText("WATER\n" + waterTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Water");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    // ORE
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractOre(ActionEvent event) {
	if (oreTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    oreTotal--;
	    oreLabel.setText("ORE\n" + oreTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Ore");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addOre(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Ore")) {
            SoundController.click();
	    cargoTotal++;
	    oreTotal++;
	    oreLabel.setText("ORE\n" + oreTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Ore");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    // Food
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractFood(ActionEvent event) {
	if (foodTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    foodTotal--;
	    foodLabel.setText("FOOD\n" + foodTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Food");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addFood(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Food")) {
            SoundController.click();
	    cargoTotal++;
	    foodTotal++;
	    foodLabel.setText("FOOD\n" + foodTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Food");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    // Furs
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractFurs(ActionEvent event) {
	if (fursTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    fursTotal--;
	    fursLabel.setText("FURS\n" + fursTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Furs");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addFurs(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Furs")) {
            SoundController.click();
	    cargoTotal++;
	    fursTotal++;
	    fursLabel.setText("FURS\n" + fursTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Furs");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    // Games
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractGames(ActionEvent event) {
	if (gamesTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    gamesTotal--;
	    gamesLabel.setText("GAMES\n" + gamesTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Games");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addGames(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Games")) {
            SoundController.click();
	    cargoTotal++;
	    gamesTotal++;
	    gamesLabel.setText("GAMES\n" + gamesTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Games");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    // Firearms
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractFirearms(ActionEvent event) {
	if (firearmsTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    firearmsTotal--;
	    firearmsLabel.setText("FIREARMS\n" + firearmsTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Firearms");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addFirearms(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Firearms")) {
            SoundController.click();
	    cargoTotal++;
	    firearmsTotal++;
	    firearmsLabel.setText("FIREARMS\n" + firearmsTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Firearms");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    // Medicine
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractMedicine(ActionEvent event) {
	if (medicineTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    medicineTotal--;
	    medicineLabel.setText("MEDICINE\n" + medicineTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Medicine");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addMedicine(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Medicine")) {
            SoundController.click();
	    cargoTotal++;
	    medicineTotal++;
	    medicineLabel.setText("MEDICINE\n" + medicineTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Medicine");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    // Machines
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractMachines(ActionEvent event) {
	if (machinesTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    machinesTotal--;
	    machinesLabel.setText("MACHINES/n" + machinesTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Machines");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addMachines(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Machines")) {
            SoundController.click();
	    cargoTotal++;
	    machinesTotal++;
	    machinesLabel.setText("MACHINES\n" + machinesTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Machines");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    // Narcotics
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractNarcotics(ActionEvent event) {
	if (narcoticsTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    narcoticsTotal--;
	    narcoticsLabel.setText("NARCOTICS\n" + narcoticsTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Narcotics");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addNarcotics(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Narcotics")) {
            SoundController.click();
	    cargoTotal++;
	    narcoticsTotal++;
	    narcoticsLabel.setText("NARCOTICS\n" + narcoticsTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Narcotics");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    // Robots
    /**
     * remove from queue
     *
     * @param event
     */
    @FXML
    private void subtractRobot(ActionEvent event) {
	if (robotsTotal > 0) {
            SoundController.click();
	    cargoTotal--;
	    robotsTotal--;
	    robotsLabel.setText("ROBOTS\n" + robotsTotal);
	    tempFunds = tempFunds + missingNo.getResourceCost("Robots");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * add to queue
     *
     * @param event
     */
    @FXML
    private void addRobot(ActionEvent event) {
	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo()
		&& tempFunds >= missingNo.getResourceCost("Robots")) {
            SoundController.click();
	    cargoTotal++;
	    robotsTotal++;
	    robotsLabel.setText("ROBOTS\n" + robotsTotal);
	    tempFunds = tempFunds - missingNo.getResourceCost("Robots");
	    fundsLabel.setText(pmd + tempFunds);
	} else {
            SoundController.deny();
        }
    }

    /**
     * buy button
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void handleBuyMarketAction(ActionEvent event) throws Exception {
        SoundController.click();
	missingNo = MainController.getUniverse()
		.getPlanet(MainController.getCurrentPlanet()).getEcon();
	if (waterTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(0), waterTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (oreTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(1), oreTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (foodTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(2), foodTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (fursTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(3), fursTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (gamesTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(4), gamesTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (firearmsTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(5), firearmsTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (medicineTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(6), medicineTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (machinesTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(7), machinesTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (narcoticsTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(8), narcoticsTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}
	if (robotsTotal > 0) {
	    missingNo.buy(missingNo.getResources().get(9), robotsTotal,
		    MainController.getPlayer(), MainController.getPlayer()
		    .getShip());
	}

	resetMarket();
	tempFunds = MainController.getPlayer().getFunds();
	fundsLabel.setText(pmd + tempFunds);
	inventoryLabel.setText(MainController.getPlayer().getShip().getCargo()
		.printCargo());
	cargoTotal = MainController.getPlayer().getShip().getCargo()
		.getCurrentVolume();
    }

    @FXML
    private void handleBuyFuelAction(ActionEvent event) throws Exception {
	if (MainController.getPlayer().getFunds() >= 100
		&& MainController.getPlayer().getShip().getFuel() <= (MainController
			.getPlayer().getShip().getMaxFuel() - 10)) {
            SoundController.click();
	    MainController.getPlayer().subtractFunds(100);
	    MainController.getPlayer().getShip().addFuel(10);
	    tempFunds = MainController.getPlayer().getFunds();
	    fundsLabel.setText(pmd + tempFunds);
	    fuelLabel.setText("FUEL\n"
		    + MainController.getPlayer().getShip().getFuel());
	} else {
            SoundController.deny();
        }
    }

    /**
     * resets totals
     */
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
	fuelLabel.setText("FUEL\n"
		+ MainController.getPlayer().getShip().getFuel());
	missingNo = MainController.getUniverse()
		.getPlanet(MainController.getCurrentPlanet()).getEcon();
	cargoTotal = MainController.getPlayer().getShip().getCargo()
		.getCurrentVolume();
	capacityLabel.setText("Your ship holds a maximum of "
		+ MainController.getPlayer().getShip().getMaxCargo()
		+ " resources.");
	tempFunds = MainController.getPlayer().getFunds();
	fundsLabel.setText(pmd + tempFunds);
	costLabel.setText(MainController.getUniverse()
		.getPlanet(MainController.getCurrentPlanet()).getEcon()
		.listPrices());
	inventoryLabel.setText(MainController.getPlayer().getShip().getCargo()
		.printCargo());
    }

}
