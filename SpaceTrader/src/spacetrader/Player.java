package spacetrader;
/*
 * Player.java
 *
 * Version 1.0
 */

/**
 * @author Diego
 * @version 1.0
 *
 */
public class Player {
	
	private String name;
	private int piloting;
	private int fighting;
	private int trading;
	private int engineering;
	private int locX;
	private int locY;
	private Ship ship;
	private SolarSystem solarSystem;
	private Planet planet;
    
    public Player(String n, int p, int f, int t, int e, Ship s) {
        System.out.println("Making player: " + n);
		name = n;
		piloting = p;
		fighting = f;
		trading = t;
		engineering = e;
		ship = s;
		locX = 0;
		locY = 0;
		
    }

	public void setLocation(int x, int y) {
		locX = x;
		locY = y;
	}
	
	public void setSolarSystem(SolarSystem ss) {
		solarSystem = ss;
	}
	
	public void setPlanet(Planet p) {
		planet = p;
	}
	
	public void setEngineering (int e) {
		engineering = e;
	}
	
	public void setPiloting (int p) {
		piloting = p;
	}
	
	public void setFighting (int f) {
		fighting = f;
	}
	
	public void setTrading (int t) {
		trading = t;
	}
	
	public void setShip (Ship s) {
		ship = s;
	}
	
	public String getName () {
		return name;
	}
	
	public SolarSystem getSolarSystem () {
		return solarSystem;
	}
		
	public Planet getPlanet () {
		return planet;
	}
	
	public int getEngineering () {
		return engineering;
	}
		
	public int getPiloting () {
		return piloting;
	}
		
	public int getFighting () {
		return fighting;
	}
		
	public int getTrading () {
		return trading;
	}
	
	public Ship getShip () {
		return ship;
	}
	
	
}