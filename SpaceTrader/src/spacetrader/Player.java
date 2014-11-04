package spacetrader;

import java.io.Serializable;

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
public class Player implements Serializable {

    /**
     * This helps with the serialization
     * Without it, saved games might not be handled
     * correctly by different compilers
     */
    private static final long serialVersionUID = 1L;
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
     *
     * @param newName
     *            - String name
     * @param pilot
     *            - int piloting skill
     * @param fight
     *            - int fighting skill
     * @param trade
     *            - int trading skill
     * @param engineer
     *            - int engineering skill
     * @param newShip
     *            - Ship
     */
    public Player(String newName, int pilot, int fight, int trade,
	    int engineer, int xLoc, int yLoc, Ship newShip) {
//	System.out.println("Making player: " + newName + " Location: " + xLoc
//		+ ", " + yLoc);
	name = newName;
	piloting = pilot;
	fighting = fight;
	trading = trade;
	engineering = engineer;
	ship = newShip;
	locX = xLoc;
	locY = yLoc;
	funds = 1000;

    }

    /**
     * sets location
     *
     * @param x
     * @param y
     */
    public void setLocation(int x, int y) {
	locX = x;
	locY = y;
    }

    /**
     *
     * @param add
     *            - int amount to be added to money (x should be +)
     */
    public void addFunds(int add) {
	if (funds > 0 && (funds + add) < 0) {
	    funds = Integer.MAX_VALUE;
	}
	funds = funds + add;
    }

    /**
     *
     * @param x
     *            - int amount to be subtracted from money (x should be +)
     */
    public void subtractFunds(int x) {
	funds = funds - x;
    }

    /**
     *
     * @param x
     *            - int amount of money (x should be +)
     */
    public void setFunds(int x) {
	funds = x;
    }

    /**
     * sets solar system
     *
     * @param ss
     */
    public void setSolarSystem(SolarSystem ss) {
	solarSystem = ss;
    }

    /**
     * sets planet
     *
     * @param p
     */
    public void setPlanet(Planet p) {
	planet = p;
    }

    /**
     * sets engineering
     *
     * @param e
     */
    public void setEngineering(int e) {
	engineering = e;
    }

    /**
     * sets piloting
     *
     * @param p
     */
    public void setPiloting(int p) {
	piloting = p;
    }

    /**
     * sets fighting
     *
     * @param f
     */
    public void setFighting(int f) {
	fighting = f;
    }

    /**
     * sets trading
     *
     * @param t
     */
    public void setTrading(int t) {
	trading = t;
    }

    /**
     * sets ship
     *
     * @param s
     */
    public void setShip(Ship s) {
	ship = s;
    }

    /**
     * returns name
     *
     * @return name
     */
    public String getName() {
	return name;
    }

    /**
     * returns solar system
     *
     * @return solarSystem
     */
    public SolarSystem getSolarSystem() {
	return solarSystem;
    }

    /**
     * returns planet
     *
     * @return planet
     */
    public Planet getPlanet() {
	return planet;
    }

    /**
     * returns engineering
     *
     * @return engineering
     */
    public int getEngineering() {
	return engineering;
    }

    /**
     * returns piloting
     *
     * @return piloting
     */
    public int getPiloting() {
	return piloting;
    }

    /**
     * returns fighting
     *
     * @return fighting
     */
    public int getFighting() {
	return fighting;
    }

    /**
     * returns trading
     *
     * @return trading
     */
    public int getTrading() {
	return trading;
    }

    /**
     * returns ship
     *
     * @return ship
     */
    public Ship getShip() {
	return ship;
    }

    /**
     * returns funds
     *
     * @return funds
     */
    public int getFunds() {
	return funds;
    }

    /**
     * returns location X
     *
     * @return locX
     */
    public int getlocX() {
	return locX;
    }

    /**
     * returns location Y
     *
     * @return locY
     */
    public int getlocY() {
	return locY;
    }

}