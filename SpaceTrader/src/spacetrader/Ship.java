package spacetrader;

import java.util.ArrayList;

public class Ship {
	private ShipType shipT;
	private int reputation;
	private Planet location;
	private String name;
	private ArrayList<Equipment> weapons;
	private ArrayList<Equipment> sheilds;
	private ArrayList<Equipment> gadgets;
	private int fuel;
	private int health;
	
	public Ship()
	{
		shipT = ShipType.GNAT;
		fuel = shipT.getMaxDistance();		
		health = 100;
	}
	public Ship(ShipType shipT, int reputation, Planet location, String name,
			ArrayList<Equipment> weapons, ArrayList<Equipment> sheilds, ArrayList<Equipment> gadgets,
			int fuel, int health) {
		this.shipT = shipT;
		this.reputation = reputation;
		this.location = location;
		this.name = name;
		this.weapons = weapons;
		this.sheilds = sheilds;
		this.gadgets = gadgets;
		this.fuel = fuel;
		this.health = health;
	}
	
	
	
	
}
