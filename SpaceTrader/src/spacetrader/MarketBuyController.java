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

	private int waterTotal = 0, OreTotal = 0, foodTotal = 0, 
			fursTotal = 0, gamesTotal = 0, firearmsTotal = 0, 
			medicineTotal = 0, machinesTotal = 0, 
			narcoticsTotal = 0, robotsTotal = 0, tempFunds = 0, cargoTotal = 0;
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
	private Label  medicineLabel;
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
    
    //Water
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractWater(ActionEvent event) {
    	if (waterTotal > 0) {
    		cargoTotal--;
	    	waterTotal--;
	        waterLabel.setText("WATER\n" + waterTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Water");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
	        
	        //
    	}
    	//add deny sound for else
    }
    
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addWater(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Water")) {
    		cargoTotal++;
    		waterTotal++;
    		waterLabel.setText("WATER\n" + waterTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Water");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    //ORE
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractOre(ActionEvent event) {
    	if (OreTotal > 0) {
    		cargoTotal--;
	    	OreTotal--;
	        oreLabel.setText("ORE\n" + OreTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Ore");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    	//add deny sound for else
    }
    
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addOre(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Ore")) {
    		cargoTotal++;
    		OreTotal++;
    		oreLabel.setText("ORE\n" + OreTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Ore");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    //Food
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractFood(ActionEvent event) {
    	if (foodTotal > 0) {
    		cargoTotal--;
	    	foodTotal--;
	        foodLabel.setText("FOOD\n" + foodTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Food");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    	//add deny sound for else
    }
    
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addFood(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Food")) {
    		cargoTotal++;
    		foodTotal++;
    		foodLabel.setText("FOOD\n" + foodTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Food");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    //Furs
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractFurs(ActionEvent event) {
    	if (fursTotal > 0) {
    		cargoTotal--;
	    	fursTotal--;
	        fursLabel.setText("FURS\n" + fursTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Furs");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    	//add deny sound for else
    }
    
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addFurs(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Furs")) {
    		cargoTotal++;
    		fursTotal++;
    		fursLabel.setText("FURS\n" + fursTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Furs");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    //Games
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractGames(ActionEvent event) {
    	if (gamesTotal > 0) {
    		cargoTotal--;
	   		gamesTotal--;
	        gamesLabel.setText("GAMES\n" + gamesTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Games");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    	//add deny sound for else
    }
    
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addGames(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Games")) {
    		cargoTotal++;
    		gamesTotal++;
    		gamesLabel.setText("GAMES\n" + gamesTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Games");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    //Firearms
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractFirearms(ActionEvent event) {
    	if (firearmsTotal > 0) {
    		cargoTotal--;
	    	firearmsTotal--;
	        firearmsLabel.setText("FIREARMS\n" + firearmsTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Firearms");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    	//add deny sound for else
    }
    
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addFirearms(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Firearms")) {
    		cargoTotal++;
    		firearmsTotal++;
    		firearmsLabel.setText("FIREARMS\n" + firearmsTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Firearms");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    //Medicine
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractMedicine(ActionEvent event) {
    	if (medicineTotal > 0) {
    		cargoTotal--;
	    	medicineTotal--;
	        medicineLabel.setText("MEDICINE\n" + medicineTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Medicine");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    	//add deny sound for else
    	
    }
    
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addMedicine(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Medicine")) {
    		cargoTotal++;
    		medicineTotal++;
    		medicineLabel.setText("MEDICINE\n" + medicineTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Medicine");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    //Machines
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractMachines(ActionEvent event) {
    	if (machinesTotal > 0) {
    		cargoTotal--;
	    	machinesTotal--;
	        machinesLabel.setText("MACHINES/n" + machinesTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Machines");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    	//add deny sound for else
    }
    
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addMachines(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Machines")) {
    		cargoTotal++;
    		machinesTotal++;
    		machinesLabel.setText("MACHINES\n" + machinesTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Machines");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    //Narcotics
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractNarcotics(ActionEvent event) {
    	if (narcoticsTotal > 0) {
    		cargoTotal--;
	    	narcoticsTotal--;
	        narcoticsLabel.setText("NARCOTICS\n" + narcoticsTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Narcotics");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    	//add deny sound for else
    }
    
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addNarcotics(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Narcotics")) {
    		cargoTotal++;
    		narcoticsTotal++;
    		narcoticsLabel.setText("NARCOTICS\n" + narcoticsTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Narcotics");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    //Robots
    /**
     * remove from queue
     * @param event
     */
    @FXML
    private void subtractRobot(ActionEvent event) {
    	if (robotsTotal > 0) {
    		cargoTotal--;
	    	robotsTotal--;
	        robotsLabel.setText("ROBOTS\n" + robotsTotal);
	        tempFunds = tempFunds + missingNo.getResourceCost("Robots");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    	//add deny sound for else
    }
    /**
     * add to queue
     * @param event
     */
    @FXML
    private void addRobot(ActionEvent event) {
    	if (cargoTotal < MainController.getPlayer().getShip().getMaxCargo() && tempFunds >= missingNo.getResourceCost("Robots")) {
    		cargoTotal++;
    		robotsTotal++;
    		robotsLabel.setText("ROBOTS\n" + robotsTotal);
    		tempFunds = tempFunds - missingNo.getResourceCost("Robots");
    		fundsLabel.setText("FUNDS\n" + tempFunds);
    	}
    }
    
    /**
   	 * buy button
   	 * @param event
   	 * @throws Exception
   	 */
   	@FXML
    private void handleBuyMarketAction(ActionEvent event) throws Exception {
   		missingNo = MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getEcon();
   		if (waterTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(0), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (OreTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(1), OreTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (foodTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(2), foodTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (fursTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(3), fursTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (gamesTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(4), gamesTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (firearmsTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(5), firearmsTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (medicineTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(6), medicineTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (machinesTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(7), machinesTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (narcoticsTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(8), narcoticsTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (robotsTotal > 0) {
   			missingNo.buy(missingNo.getResources().get(9), robotsTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		
   		
   		resetMarket();
   		tempFunds = MainController.getPlayer().getFunds();
   		fundsLabel.setText("FUNDS\n" + tempFunds);
   		inventoryLabel.setText(MainController.getPlayer().getShip().getCargo().printCargo());
   		cargoTotal = MainController.getPlayer().getShip().getCargo().getCurrentVolume();
   	}
   	
   	@FXML
   	private void handleBuyFuelAction(ActionEvent event) throws Exception {
   		if (MainController.getPlayer().getFunds() >= 100 && (MainController.getPlayer().getShip().getFuel() <= (MainController.getPlayer().getShip().getMaxFuel() - 10))) {
   			MainController.getPlayer().subtractFunds(100);
   			MainController.getPlayer().getShip().addFuel(10);
   			tempFunds = MainController.getPlayer().getFunds();
   	   		fundsLabel.setText("FUNDS\n" + tempFunds);
   	   		fuelLabel.setText("FUEL\n" + MainController.getPlayer().getShip().getFuel());
   		}
   	}
   	
   	/**
   	 * resets totals
   	 */
   	private void resetMarket() {
   		waterTotal = 0;
   		OreTotal = 0;
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
   		oreLabel.setText("ORE\n" + OreTotal);
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
	 * @param event
	 * @throws Exception
	 */
	@FXML
    private void handleLeaveMarketAction(ActionEvent event) throws Exception {
		Parent config = FXMLLoader.load(getClass().getResource("Marketplace.fxml"));
        Scene sceneConfig = new Scene(config);
        Stage stageN = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageN.setScene(sceneConfig);
        stageN.show();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		fuelLabel.setText("FUEL\n" + MainController.getPlayer().getShip().getFuel());
		missingNo = MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getEcon();
		cargoTotal = MainController.getPlayer().getShip().getCargo().getCurrentVolume();
		capacityLabel.setText("Your ship holds a maximum of " + MainController.getPlayer().getShip().getMaxCargo() + " resources.");
		tempFunds = MainController.getPlayer().getFunds();
		fundsLabel.setText("FUNDS\n" + tempFunds);
		costLabel.setText(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getEcon().listPrices());
		inventoryLabel.setText(MainController.getPlayer().getShip().getCargo().printCargo());
	}

}
