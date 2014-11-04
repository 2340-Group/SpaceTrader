package spacetrader;

import java.io.Serializable;

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
public class Planet implements Serializable {

    /**
     * This helps with the serialization
     * Without it, saved games might not be handled
     * correctly by different compilers
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private int locX;
    private int locY;
    // private SolarSystem solarSystem;
    private int techLevel;
    private int resourceLevel;
    // private Items[] items;
    private Marketplace econ;

    // public void createPlanet(String n, int x, int y, int tl, Items[] i) {

    /**
     *
     * @param n
     *            - String name
     * @param x
     *            - int location x-coordinate
     * @param y
     *            - int location y-coordinate
     * @param tl
     *            - int tech level
     * @param rl
     *            - int resource level
     */
    public Planet(String n, int x, int y, int tl, int rl) {
//	System.out.println("Making planet: " + n + ", Tech Level: " + tl
//		+ ", Resource Level: " + rl + " Location (x,y): " + x + ", "
//		+ y);
	name = n;
	locX = x;
	locY = y;
	// solarSystem = ss;
	techLevel = tl;
	resourceLevel = rl;
	// items = i;

    }

    /**
     * Planets are now considered equal if they have the same name
     */
    @Override
    public boolean equals(Object obj) {
	if (obj instanceof Planet) {
	    return ((Planet) obj).name.equals(this.name);
	}
	return false;
    }

    @Override
    public int hashCode() {
	return name.hashCode();
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
     * sets economy
     *
     * @param e
     */
    public void setEcon(Marketplace e) {
	econ = e;
    }

    /**
     * returns economy
     *
     * @return econ
     */
    public Marketplace getEcon() {
	return econ;
    }

    /*
     * public void setItems(Items[] i) { items = i; }
     */

    /**
     * returns name
     *
     * @return name
     */
    public String getName() {
	return name;
    }

    /*
     * public Items[] getItems () { return items; }
     */

    /**
     * returns tech level
     *
     * @return techLevel
     */
    public int getTechLevel() {
	return techLevel;
    }

    /**
     * returns resource level
     *
     * @return resourceLevel
     */
    public int getresourceLevel() {
	return resourceLevel;
    }

    /**
     * get x location
     *
     * @return locX
     */
    public int getX() {
	return locX;
    }

    /**
     * get y location
     *
     * @return locY
     */
    public int getY() {
	return locY;
    }

    /*
     * public SolarSystem getSolarSystem () { return solarSystem; }
     */

}
