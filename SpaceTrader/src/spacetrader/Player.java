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
	private int funds;
    
	/**
	 * Funds set to 1000 by default
	 * @param n - String name
	 * @param p - int piloting skill
	 * @param f - int fighting skill
	 * @param t - int trading skill
	 * @param e - int engineering skill
	 * @param s - Ship
	 */
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
		funds = 2000000000;
		
    }
    
    /**
     * sets location
     * @param x
     * @param y
     */
	public void setLocation(int x, int y) {
		locX = x;
		locY = y;
	}
	
	/**
	 * 
	 * @param x - int amount to be added to money (x should be +)
	 */
	public void addFunds(int x) {
		funds = funds + x;
	}
	
	/**
	 * 
	 * @param x - int amount to be subtracted from money (x should be +)
	 */
	public void subtractFunds(int x) {
		funds = funds - x;
	}
	
	/**
	 * sets solar system
	 * @param ss
	 */
	public void setSolarSystem(SolarSystem ss) {
		solarSystem = ss;
	}
	
	/**
	 * sets planet
	 * @param p
	 */
	public void setPlanet(Planet p) {
		planet = p;
	}
	
	/**
	 * sets engineering
	 * @param e
	 */
	public void setEngineering (int e) {
		engineering = e;
	}
	
	/**
	 * sets piloting
	 * @param p
	 */
	public void setPiloting (int p) {
		piloting = p;
	}
	
	/**
	 * sets fighting
	 * @param f
	 */
	public void setFighting (int f) {
		fighting = f;
	}
	
	/**
	 * sets trading
	 * @param t
	 */
	public void setTrading (int t) {
		trading = t;
	}
	
	/**
	 * sets ship
	 * @param s
	 */
	public void setShip (Ship s) {
		ship = s;
	}
	
	/**
	 * returns name
	 * @return name
	 */
	public String getName () {
		return name;
	}
	
	/**
	 * returns solar system
	 * @return solarSystem
	 */
	public SolarSystem getSolarSystem () {
		return solarSystem;
	}
		
	/**
	 * returns planet
	 * @return planet
	 */
	public Planet getPlanet () {
		return planet;
	}
	
	/**
	 * returns engineering
	 * @return engineering
	 */
	public int getEngineering () {
		return engineering;
	}
	
	/**
	 * returns piloting
	 * @return piloting
	 */
	public int getPiloting () {
		return piloting;
	}
	
	/**
	 * returns fighting
	 * @return fighting
	 */
	public int getFighting () {
		return fighting;
	}
	
	/**
	 * returns trading
	 * @return trading
	 */
	public int getTrading () {
		return trading;
	}
	
	/**
	 * returns ship
	 * @return ship
	 */
	public Ship getShip () {
		return ship;
	}

	/**
	 * returns funds
	 * @return funds
	 */
	public int getFunds() {
		return funds;
	}
	
	
}