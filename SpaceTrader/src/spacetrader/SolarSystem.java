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
	private int locX;
	private int locY;
	private String style;
	    
	public void createPlayer(String n, int x, int y, String s) {
	    System.out.println("Making planet: " + n);
		name = n;
		locX = x;
		locY = y;
		style = s;
		
	}

	public void setLocation(int x, int y) {
		locX = x;
		locY = y;
	}
		

}
