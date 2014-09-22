package spacetrader;
/*
 * Planet.java
 *
 * Version 1.0
 */

/**
 * @author Diego
 * @version 1.0
 *
 */
public class Planet {
	
	private String name;
	private int locX;
	private int locY;
	//private SolarSystem solarSystem;
	private int techLevel;
	//private Items[] items;
    
    //public void createPlanet(String n, int x, int y, int tl, Items[] i) {
    public void createPlanet(String n, int x, int y, int tl) {
        System.out.println("Making planet: " + n);
		name = n;
		locX = x;
		locY = y;
		//solarSystem = ss;
		techLevel = tl;
		//items = i;
		
    }

	public void setLocation(int x, int y) {
		locX = x;
		locY = y;
	}
	
	/*public void setItems(Items[] i) {
		items = i;
	}*/
	
	public String getName () {
		return name;
	}
	
	/*public Items[] getItems () {
		return items;
	}*/
	
	public int getTechLevel () {
		return techLevel;
	}
	
	/*public SolarSystem getSolarSystem () {
		return solarSystem;
	}*/
	
	

}
