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
	private int resourceLevel;
	//private Items[] items;
	private Economy econ;
    
    //public void createPlanet(String n, int x, int y, int tl, Items[] i) {
    public Planet(String n, int x, int y, int tl, int rl) {
        System.out.println("Making planet: " + n + ", Tech Level: " + tl + ", Resource Level: " + rl);
		name = n;
		locX = x;
		locY = y;
		//solarSystem = ss;
		techLevel = tl;
		resourceLevel = rl;
		//items = i;
		
    }

	public void setLocation(int x, int y) {
		locX = x;
		locY = y;
	}
	
	public void setEcon(Economy e) {
		econ = e;
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
