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

public class MarketSellController implements Initializable {

	private int waterTotal = 0, OreTotal = 0, foodTotal = 0, 
			fursTotal = 0, gamesTotal = 0, firearmsTotal = 0, 
			medicineTotal = 0, machinesTotal = 0, 
			narcoticsTotal = 0, robotsTotal = 0, tempFunds = 0;
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
    @FXML
    private void subtractWater(ActionEvent event) {
    	if (waterTotal > 0) {
	    	waterTotal--;
	        waterLabel.setText("WATER\n" + waterTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addWater(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.WATER, 100))) {
    		waterTotal++;
    		waterLabel.setText("WATER\n" + waterTotal);
    	}
    }
    
    //ORE
    @FXML
    private void subtractOre(ActionEvent event) {
    	if (OreTotal > 0) {
	    	OreTotal--;
	        oreLabel.setText("ORE\n" + OreTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addOre(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.ORE, 100))) {
    		OreTotal++;
    		oreLabel.setText("ORE\n" + OreTotal);
    	}
    	
    }
    
    //Food
    @FXML
    private void subtractFood(ActionEvent event) {
    	if (foodTotal > 0) {
	    	foodTotal--;
	        foodLabel.setText("FOOD\n" + foodTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addFood(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.FOOD, 100))) {
    		foodTotal++;
    		foodLabel.setText("FOOD\n" + foodTotal);
    	}
    	
    }
    
    //Furs
    @FXML
    private void subtractFurs(ActionEvent event) {
    	if (fursTotal > 0) {
	    	fursTotal--;
	        fursLabel.setText("FURS\n" + fursTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addFurs(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.FURS, 100))) {
    		fursTotal++;
    		fursLabel.setText("FURS\n" + fursTotal);
    	}
    	
    }
    
    //Games
    @FXML
    private void subtractGames(ActionEvent event) {
    	if (gamesTotal > 0) {
	   		gamesTotal--;
	        gamesLabel.setText("GAMES\n" + gamesTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addGames(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.GAMES, 100))) {
    		gamesTotal++;
    		gamesLabel.setText("GAMES\n" + gamesTotal);
    	}
    	
    }
    
    //Firearms
    @FXML
    private void subtractFirearms(ActionEvent event) {
    	if (firearmsTotal > 0) {
	    	firearmsTotal--;
	        firearmsLabel.setText("FIREARMS\n" + firearmsTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addFirearms(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.FIREARMS, 100))) {
    		firearmsTotal++;
    		firearmsLabel.setText("FIREARMS\n" + firearmsTotal);
    	}
    	
    }
    
    //Medicine
    @FXML
    private void subtractMedicine(ActionEvent event) {
    	if (medicineTotal > 0) {
	    	medicineTotal--;
	        medicineLabel.setText("MEDICINE\n" + medicineTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addMedicine(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.MEDICINE, 100))) {
    		medicineTotal++;
    		medicineLabel.setText("MEDICINE\n" + medicineTotal);
    	}
    	
    }
    
    //Machines
    @FXML
    private void subtractMachines(ActionEvent event) {
    	if (machinesTotal > 0) {
	    	machinesTotal--;
	        machinesLabel.setText("MACHINES/n" + machinesTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addMachines(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.MACHINES, 100))) {
    		machinesTotal++;
    		machinesLabel.setText("MACHINES\n" + machinesTotal);
    	}
    	
    }
    
    //Narcotics
    @FXML
    private void subtractNarcotics(ActionEvent event) {
    	if (narcoticsTotal > 0) {
	    	narcoticsTotal--;
	        narcoticsLabel.setText("NARCOTICS\n" + narcoticsTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addNarcotics(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.NARCOTICS, 100))) {
    		narcoticsTotal++;
    		narcoticsLabel.setText("NARCOTICS\n" + narcoticsTotal);
    	}
    	
    }
    
    //Robots
    @FXML
    private void subtractRobot(ActionEvent event) {
    	if (robotsTotal > 0) {
	    	robotsTotal--;
	        robotsLabel.setText("ROBOTS\n" + robotsTotal);
    	}
    	//add deny sound for else
    }
    
    @FXML
    private void addRobot(ActionEvent event) {
    	if (waterTotal < MainController.getPlayer().getShip().getCargo().getResourceStock(new Resource(ResourceType.ROBOTS, 100))) {
    		robotsTotal++;
    		robotsLabel.setText("ROBOTS\n" + robotsTotal);
    	}
    	
    }
    
    /**
   	 * sell button
   	 * @param event
   	 * @throws Exception
   	 */
   	@FXML
     private void handleSellMarketAction(ActionEvent event) throws Exception {
   		//subtract inventory & add funds
   		missingNo = MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getEcon();
   		if (waterTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(0), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (OreTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(1), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (foodTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(2), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (fursTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(3), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (gamesTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(4), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (firearmsTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(5), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (medicineTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(6), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (machinesTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(7), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (narcoticsTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(8), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		if (robotsTotal > 0) {
   			missingNo.sell(missingNo.getResources().get(9), waterTotal, MainController.getPlayer(), MainController.getPlayer().getShip());
   		}
   		
   		//cargoTotal = MainController.getPlayer().getShip().getCargo().getCurrentVolume();
   		resetMarket();
   		tempFunds = MainController.getPlayer().getFunds();
   		fundsLabel.setText("FUNDS\n" + tempFunds);
   		inventoryLabel.setText(MainController.getPlayer().getShip().getCargo().printCargo());
   	}
   	
   	/**
   	 * sell all button
   	 * @param event
   	 * @throws Exception
   	 */
   	@FXML
     private void handleSellAllMarketAction(ActionEvent event) throws Exception {
   		//subtract all inventory and add funds
   		missingNo = MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getEcon();
   		for (int i = 0; i < missingNo.getResources().size(); i++) {
        	missingNo.sell(missingNo.getResources().get(i), missingNo.getResources().get(i).getQuantity(), MainController.getPlayer(), MainController.getPlayer().getShip());
        }
   		resetMarket();
   		tempFunds = MainController.getPlayer().getFunds();
   		fundsLabel.setText("FUNDS\n" + tempFunds);
   		inventoryLabel.setText(MainController.getPlayer().getShip().getCargo().printCargo());
   	}
   	
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
		// TODO Auto-generated method stub
		//cargoTotal = MainController.getPlayer().getShip().getCargo().getCurrentVolume();
		capacityLabel.setText("Your ship holds a maximum of " + MainController.getPlayer().getShip().getType().getCargoSlots() + " resources.");
		tempFunds = MainController.getPlayer().getFunds();
		fundsLabel.setText("FUNDS\n" + tempFunds);
		costLabel.setText(MainController.getUniverse().getPlanet(MainController.getCurrentPlanet()).getEcon().listPrices());
		inventoryLabel.setText(MainController.getPlayer().getShip().getCargo().printCargo());
	}

}
