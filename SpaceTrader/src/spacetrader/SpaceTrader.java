/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Jamie
 */
public class SpaceTrader extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
    	Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	/*Universe u = new Universe();
    	
    	u.generateUniverse();*/
    	
    	//playerGeneration plg = new playerGeneration();
    	//plg.getPlayer().setLocation(u.getPlanet("S1").getX(), u.getPlanet("S1").getY());
    	MainController.makeUniverse();
    	
    	
    	
    	launch(args);
    	

    	/*
    	// ALL OF THIS IS SIMPLY TO TEST TRADE FUCNTIONALITY, CODE WILL BE REMOVED WHEN COMPLETED.
    	for (int k = 0; k < 8; k++) {
	    	ArrayList<Resource> richMerchant = new ArrayList<>();
			richMerchant.add(new Resource(ResourceType.WATER, 100));
			richMerchant.add(new Resource(ResourceType.ORE, 100));
			richMerchant.add(new Resource(ResourceType.FOOD, 100));
			richMerchant.add(new Resource(ResourceType.FURS, 100));
			richMerchant.add(new Resource(ResourceType.GAMES, 100));
			richMerchant.add(new Resource(ResourceType.FIREARMS, 100));
			richMerchant.add(new Resource(ResourceType.MEDICINE, 100));
			richMerchant.add(new Resource(ResourceType.MACHINES, 100));
			richMerchant.add(new Resource(ResourceType.NARCOTICS, 100));
			richMerchant.add(new Resource(ResourceType.ROBOTS, 100));
			//richMerchant.add(new Resource(ResourceType.MOON, 100));
	    	Ship mahBoi = new Ship();
	    	// player has been edited to start with 2 billion credits.
	    	Player p = new Player("Trader", 0,0,0,0,0,0, mahBoi);
	    	// prints the money before the transaction, gosh I'm rich.
	    	System.out.println("The player has " + p.getFunds()+ " credits");
	    	
	    	
	    	//Planet error = u.getPlanet("ERROR");
	    	Planet error = new Planet("ERROR", 0, 0, k, 0);
	
	        error.setEcon(new Marketplace(richMerchant, error.getTechLevel()));
	        Marketplace missingNo = error.getEcon();
	        CargoBay myStuff = mahBoi.getCargo();
	        // Should print out current stock before any trading.
	        myStuff.printCargo();
	
	        // buy one of everything.
	        for (int i = 0; i < richMerchant.size(); i++) {
	        	missingNo.buy(richMerchant.get(i), 1, p, mahBoi);
	        }
	
	        myStuff.printCargo();
	        System.out.println("The player has "+ p.getFunds()+ " credits");
	        // sell it back.
	        for (int i = 0; i < richMerchant.size(); i++) {
	        	missingNo.sell(richMerchant.get(i), 1, p, mahBoi);
	        }
	
	        myStuff.printCargo();
	        System.out.println("The player has "+ p.getFunds()+ " credits");
	
	        missingNo.listPrices();
    	}
    	
    	//Poor Merchant test
    	ArrayList<Resource> richMerchant = new ArrayList<>();
		richMerchant.add(new Resource(ResourceType.WATER, 100));
		richMerchant.add(new Resource(ResourceType.ORE, 100));
		richMerchant.add(new Resource(ResourceType.FOOD, 100));
		richMerchant.add(new Resource(ResourceType.FURS, 100));
		richMerchant.add(new Resource(ResourceType.GAMES, 100));
		richMerchant.add(new Resource(ResourceType.FIREARMS, 100));
		richMerchant.add(new Resource(ResourceType.MEDICINE, 100));
		richMerchant.add(new Resource(ResourceType.MACHINES, 100));
		richMerchant.add(new Resource(ResourceType.NARCOTICS, 100));
		richMerchant.add(new Resource(ResourceType.ROBOTS, 100));
		//richMerchant.add(new Resource(ResourceType.MOON, 100));
    	Ship mahBoi = new Ship();
    	// player has been edited to start with 2 billion credits.
    	Player pl = new Player("Trader", 0,0,0,0,0,0, mahBoi);
    	pl.subtractFunds(2000000000);
    	// prints the money before the transaction, gosh I'm rich.
    	System.out.println("The player has " + pl.getFunds()+ " credits");
    	
    	
    	//Planet error = u.getPlanet("ERROR");
    	Planet error = new Planet("ERROR", 0, 0, 7, 0);

        error.setEcon(new Marketplace(richMerchant, error.getTechLevel()));
        Marketplace missingNo = error.getEcon();
        CargoBay myStuff = mahBoi.getCargo();
        // Should print out current stock before any trading.
        myStuff.printCargo();

        // buy one of everything.
        for (int i = 0; i < richMerchant.size(); i++) {
        	missingNo.buy(richMerchant.get(i), 1, pl, mahBoi);
        }

        myStuff.printCargo();
        System.out.println("The player has "+ pl.getFunds()+ " credits");
        // sell it back.
        for (int i = 0; i < richMerchant.size(); i++) {
        	missingNo.sell(richMerchant.get(i), 1, pl, mahBoi);
        }

        myStuff.printCargo();
        System.out.println("The player has "+ pl.getFunds()+ " credits");

        missingNo.listPrices();
        
      //no cargo space
    	pl.addFunds(2000000000);
    	// prints the money before the transaction, gosh I'm rich.
    	System.out.println("The player has " + pl.getFunds()+ " credits");
    	

        // Should print out current stock before any trading.
        myStuff.printCargo();

        // buy one of everything.
        for (int j = 0; j < richMerchant.size(); j++) {
        	missingNo.buy(richMerchant.get(j), 10, pl, mahBoi);
        }*/
    	
        
        System.exit(0);
    }
    
}