package spacetrader;

import java.util.ArrayList;
import java.util.Random;

public class Universe {
	private ArrayList<SolarSystem> universe;
	
	private SolarSystem Space;
	private ArrayList<Planet> SpaceSystem;
	private Planet S1;
	private Planet S2;
	private Planet S3;
	private Planet S3PT2;
	private Planet YNS;
	
	private SolarSystem Name;
	private ArrayList<Planet> NameSystem;
	private Planet Big;
	private Planet Giant;
	private Planet Planet;
	
	private SolarSystem NoName;
	private ArrayList<Planet> NoNameSystem;
	private Planet ERROR;
	private Planet InsertName;
	private Planet Blank;
	
	private ArrayList<Planet> planetList;
	
	//private ArrayList<Resource> Merchant;
	
	/**
	 * universe constructor
	 */
	public Universe() {
		
	}
	
	/**
	 * generate Universe
	 */
	public void generateUniverse() {
		Random randomGenerator = new Random();
    	//randomGenerator.nextInt((max - min) + 1) + min;
    	
		System.out.println("Making Universe");
		
		universe = new ArrayList<SolarSystem>();
		planetList = new ArrayList<Planet>();
		
		//Create Planet ArrayLists
		SpaceSystem = new ArrayList<Planet>();
		NameSystem = new ArrayList<Planet>();
		NoNameSystem = new ArrayList<Planet>();
		
		//Create Space system
		S1 = new Planet("S1", randomGenerator.nextInt(201), randomGenerator.nextInt(201), 1, 0);
		S2 = new Planet("S2", randomGenerator.nextInt(201), randomGenerator.nextInt(201), randomGenerator.nextInt(7) + 1, randomGenerator.nextInt(13));
		S3 = new Planet("S3", randomGenerator.nextInt(201), randomGenerator.nextInt(201), randomGenerator.nextInt(7) + 1, randomGenerator.nextInt(13));
		S3PT2 = new Planet("S3PT2", randomGenerator.nextInt(201), randomGenerator.nextInt(201), randomGenerator.nextInt(7) + 1, randomGenerator.nextInt(13));
		YNS = new Planet("Your Naming Sucks", randomGenerator.nextInt(201), randomGenerator.nextInt(201), randomGenerator.nextInt(7) + 1, randomGenerator.nextInt(13));
		SpaceSystem.add(S1);
		SpaceSystem.add(S2);
		SpaceSystem.add(S3);
		SpaceSystem.add(S3PT2);
		SpaceSystem.add(YNS);
		Space = new SolarSystem("SPAAACE", 100, 100, SpaceSystem);
		
		//Create Name System
		Big = new Planet("Big", randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(7) + 1, randomGenerator.nextInt(13));
		Giant = new Planet("Giant", randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(7) + 1, randomGenerator.nextInt(13));
		Planet = new Planet("Planet", randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(201) + 200, randomGenerator.nextInt(7) + 1, randomGenerator.nextInt(13));
		NameSystem.add(Big);
		NameSystem.add(Giant);
		NameSystem.add(Planet);
		Name = new SolarSystem("NAME", 300, 300, NameSystem);
		
		//Create NoName System
		ERROR =  new Planet("ERROR", randomGenerator.nextInt(201) + 400, randomGenerator.nextInt(201), 7, 12);
		InsertName = new Planet("InsertName", randomGenerator.nextInt(201) + 400, randomGenerator.nextInt(201), randomGenerator.nextInt(7) + 1, randomGenerator.nextInt(13));
		Blank = new Planet("Blank", randomGenerator.nextInt(201) + 400, randomGenerator.nextInt(201), randomGenerator.nextInt(7) + 1, randomGenerator.nextInt(13));
		NoNameSystem.add(InsertName);
		NoNameSystem.add(Blank);
		NoNameSystem.add(ERROR);
		NoName = new SolarSystem("NONAME", 500, 100, NoNameSystem);
		
		universe.add(Space);
		universe.add(Name);
		universe.add(NoName);
		
		planetList.add(S1);
		planetList.add(S2);
		planetList.add(S3);
		planetList.add(S3PT2);
		planetList.add(YNS);
		planetList.add(Big);
		planetList.add(Giant);
		planetList.add(Planet);
		planetList.add(InsertName);
		planetList.add(Blank);
		planetList.add(ERROR);

		
		
	}
	
	/**
	 * returns list of planets
	 * @return
	 */
	public ArrayList<Planet> getplanetList() {
		return planetList;
	}
	
	/**
	 * returns planet
	 * @param str
	 * @return planet
	 */
	public Planet getPlanet(String str) {
		 for (int i = 0; i < planetList.size();) {
			 if (planetList.get(i).getName().equals(str)) {
				 System.out.println("Got Planet");
				 return planetList.get(i);
			 } else {
				 i++;
			 }
		 }
		 System.out.println("No Planet");
		 return null;
	}
}
