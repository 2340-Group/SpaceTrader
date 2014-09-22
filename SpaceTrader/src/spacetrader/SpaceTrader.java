/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

import java.util.ArrayList;
import java.util.Random;

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
        
    	Random randomGenerator = new Random();
		
		System.out.println("Making Universe");
		
		//Create Planet array containers
		ArrayList<Planet> SpaceSystem = new ArrayList<Planet>();
		ArrayList<Planet> NameSystem = new ArrayList<Planet>();
		ArrayList<Planet> NoNameSystem = new ArrayList<Planet>();
		
		//Create Space system
		Planet S1 = new Planet("S1", 0, 0, randomGenerator.nextInt(11));
		Planet S2 = new Planet("S2", 0, 0, randomGenerator.nextInt(11));
		Planet S3 = new Planet("S3", 0, 0, randomGenerator.nextInt(11));
		Planet S3PT2 = new Planet("S3PT2", 0, 0, randomGenerator.nextInt(11));
		Planet YNS = new Planet("Your Naming Sucks", 0, 0, randomGenerator.nextInt(11));
		SpaceSystem.add(S1);
		SpaceSystem.add(S2);
		SpaceSystem.add(S3);
		SpaceSystem.add(S3PT2);
		SpaceSystem.add(YNS);
		SolarSystem Space = new SolarSystem("SPAAACE", 100, 100, SpaceSystem);
		
		//Create Name System
		Planet Big = new Planet("Big", 0, 0, randomGenerator.nextInt(11));
		Planet Giant = new Planet("Giant", 0, 0, randomGenerator.nextInt(11));
		Planet Planet = new Planet("Planet", 0, 0, randomGenerator.nextInt(11));
		NameSystem.add(Big);
		NameSystem.add(Giant);
		NameSystem.add(Planet);
		SolarSystem Name = new SolarSystem("NAME", 300, 300, NameSystem);
		
		//Create NoName System
		Planet ERROR =  new Planet("ERROR", 0, 0, randomGenerator.nextInt(11));
		Planet InsertName = new Planet("Insert Name", 0, 0, randomGenerator.nextInt(11));
		Planet Blank = new Planet("[     ]", 0, 0, randomGenerator.nextInt(11));
		NoNameSystem.add(InsertName);
		NoNameSystem.add(Blank);
		NoNameSystem.add(ERROR);
		SolarSystem NoName = new SolarSystem("NONAME", 500, 100, NoNameSystem);
    	
    	launch(args);
        
        
    }
    
}