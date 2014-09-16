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
	private String solarSystem;
    
    public void createPlayer(String n, int p, int f, int t, int e) {
        System.out.println("Making player: " + n);
		name = n;
		piloting = p;
		fighting = f;
		trading = t;
		engineering = e;
		locX = 0;
		locY = 0;
		solarSystem = "home";
		
    }

	public void setLocation(int x, int y) {
		locX = x;
		locY = y;
	}
	
	public void moveX(int x) {
		locX = locX + x;
	}
	
	public void moveY(int y) {
			locY = locY + y;
	}

}