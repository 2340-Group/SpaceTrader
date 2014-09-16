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
	private String solarSystem;
	private String techLevel;
	private Resources resources;
    
    public void createPlayer(String n, int x, int y, String ss, String tl, Resources r) {
        System.out.println("Making planet: " + n);
		name = n;
		locX = x;
		locY = y;
		solarSystem = ss;
		techLevel = tl;
		resources = r;
		
    }

	public void setLocation(int x, int y) {
		locX = x;
		locY = y;
	}
	
	public void setResources(Resources r) {
		resources = r;
	}

}
