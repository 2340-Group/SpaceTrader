package spacetrader;

import java.util.ArrayList;

/*
 * SolarSystem.java
 *
 * Version 1.0
 */

/**
 * @author Diego
 * @version 1.0
 *
 */

public class SolarSystem {
	
	private String name;
	private ArrayList<Planet> planets;
	private int locX;
	private int locY;
	//private String style;
	    
	public SolarSystem(String n, int x, int y, ArrayList<Planet> p) {
	    System.out.println("Making Solar Sytems: " + n);
		name = n;
		locX = x;
		locY = y;
		//style = s;
		planets = p;
		
	}

	public void setLocation(int x, int y) {
		locX = x;
		locY = y;
	}
	
	public String getName () {
		return name;
	}
	
	/*public String getStyle () {
		return style;
	}*/
	
	public ArrayList<Planet> getPlanets () {
		return planets;
	}
		

}
