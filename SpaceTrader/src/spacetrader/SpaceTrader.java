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
    	//randomGenerator.nextInt((max - min) + 1) + min;
    	
		System.out.println("Making Universe");
		
		//Create Planet ArrayLists
		ArrayList<Planet> SpaceSystem = new ArrayList<Planet>();
		ArrayList<Planet> NameSystem = new ArrayList<Planet>();
		ArrayList<Planet> NoNameSystem = new ArrayList<Planet>();
		
		//Create Space system
		Planet S1 = new Planet("S1", randomGenerator.nextInt(201), randomGenerator.nextInt(201), randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		Planet S2 = new Planet("S2", randomGenerator.nextInt(201), randomGenerator.nextInt(201), randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		Planet S3 = new Planet("S3", randomGenerator.nextInt(201), randomGenerator.nextInt(201), randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		Planet S3PT2 = new Planet("S3PT2", randomGenerator.nextInt(201), randomGenerator.nextInt(201), randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		Planet YNS = new Planet("Your Naming Sucks", randomGenerator.nextInt(201), randomGenerator.nextInt(201), randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		SpaceSystem.add(S1);
		SpaceSystem.add(S2);
		SpaceSystem.add(S3);
		SpaceSystem.add(S3PT2);
		SpaceSystem.add(YNS);
		SolarSystem Space = new SolarSystem("SPAAACE", 100, 100, SpaceSystem);
		
		//Create Name System
		Planet Big = new Planet("Big", randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		Planet Giant = new Planet("Giant", randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		Planet Planet = new Planet("Planet", randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		NameSystem.add(Big);
		NameSystem.add(Giant);
		NameSystem.add(Planet);
		SolarSystem Name = new SolarSystem("NAME", 300, 300, NameSystem);
		
		//Create NoName System
		Planet ERROR =  new Planet("ERROR", randomGenerator.nextInt(201) + 400, randomGenerator.nextInt(201), randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		Planet InsertName = new Planet("Insert Name", randomGenerator.nextInt(201) + 400, randomGenerator.nextInt(201), randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		Planet Blank = new Planet("[     ]", randomGenerator.nextInt(201) + 400, randomGenerator.nextInt(201), randomGenerator.nextInt(8), randomGenerator.nextInt(13));
		NoNameSystem.add(InsertName);
		NoNameSystem.add(Blank);
		NoNameSystem.add(ERROR);
		SolarSystem NoName = new SolarSystem("NONAME", 500, 100, NoNameSystem);
    	
    	launch(args);
        
        
    }
    
}