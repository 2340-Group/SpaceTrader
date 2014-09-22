package spacetrader;

import java.util.Random;

public class Main {
	
	public static void main(String args) {
		Random randomGenerator = new Random();
		Planet a = new Planet();
		SolarSystem s = new SolarSystem();
		
		System.out.println("Making Universe");
		
		//Create Planet array containers
		Planet[] SpaceSystem = new Planet[5];
		Planet[] NameSystem = new Planet[3];
		Planet[] NoNameSystem = new Planet[3];
		
		//Create Space system
		Planet S1 = createPlanet("S1", 0, 0, randomGenerator.nextInt(11));
		Planet S2 = createPlanet("S2", 0, 0, randomGenerator.nextInt(11));
		Planet S3 = createPlanet("S3", 0, 0, randomGenerator.nextInt(11));
		Planet S3PT2 = createPlanet("S3PT2", 0, 0, randomGenerator.nextInt(11));
		Planet YNS = createPlanet("Your Naming Sucks", 0, 0, randomGenerator.nextInt(11));
		SpaceSystem[0] = S1;
		SpaceSystem[1] = S2;
		SpaceSystem[2] = S3;
		SpaceSystem[3] = S3PT2;
		SpaceSystem[4] = YNS;
		SolarSystem Space = createSolarSystem("SPAAACE", 0, 0, SpaceSystem);
		
		//Create Name System
		Planet Big = createPlanet("Big", 0, 0, randomGenerator.nextInt(11));
		Planet Giant = createPlanet("Giant", 0, 0, randomGenerator.nextInt(11));
		Planet Planet = createPlanet("Planet", 0, 0, randomGenerator.nextInt(11));
		NameSystem[0] = Big;
		NameSystem[1] = Giant;
		NameSystem[2] = Planet;
		SolarSystem Name = createSolarSystem("NAME", 0, 0, NameSystem);
		
		//Create NoName System
		Planet ERROR = createPlanet("ERROR", 0, 0, randomGenerator.nextInt(11));
		Planet InsertName = createPlanet("Insert Name", 0, 0, randomGenerator.nextInt(11));
		Planet Blank = createPlanet("[     ]", 0, 0, randomGenerator.nextInt(11));
		NoNameSystem[0] = InsertName;
		NoNameSystem[1] = Blank;
		NoNameSystem[2] = ERROR;
		SolarSystem NoName = createSolarSystem("NONAME", 0, 0, NoNameSystem);
	}

}
