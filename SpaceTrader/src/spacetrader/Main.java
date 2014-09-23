package spacetrader;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String args) {
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
		SolarSystem Space = new SolarSystem("SPAAACE", 0, 0, SpaceSystem);
		
		//Create Name System
		Planet Big = new Planet("Big", 0, 0, randomGenerator.nextInt(11));
		Planet Giant = new Planet("Giant", 0, 0, randomGenerator.nextInt(11));
		Planet Planet = new Planet("Planet", 0, 0, randomGenerator.nextInt(11));
		NameSystem.add(Big);
		NameSystem.add(Giant);
		NameSystem.add(Planet);
		SolarSystem Name = new SolarSystem("NAME", 0, 0, NameSystem);
		
		//Create NoName System
		Planet ERROR =  new Planet("ERROR", 0, 0, randomGenerator.nextInt(11));
		Planet InsertName = new Planet("Insert Name", 0, 0, randomGenerator.nextInt(11));
		Planet Blank = new Planet("[     ]", 0, 0, randomGenerator.nextInt(11));
		NoNameSystem.add(InsertName);
		NoNameSystem.add(Blank);
		NoNameSystem.add(ERROR);
		SolarSystem NoName = new SolarSystem("NONAME", 0, 0, NoNameSystem);
	}

}
