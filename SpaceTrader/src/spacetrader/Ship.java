package spacetrader;

import java.util.ArrayList;

public class Ship {
	private ShipType shipT;
	private int reputation;
//	private Planet location; Kept by owner of Ship
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
	public Ship(ShipType shipT, int reputation, String name,
			ArrayList<Equipment> weapons, ArrayList<Equipment> sheilds, ArrayList<Equipment> gadgets,
			int fuel, int health) {
		this.shipT = shipT;
		this.reputation = reputation;
		this.name = name;
		this.weapons = weapons;
		this.sheilds = sheilds;
		this.gadgets = gadgets;
		this.fuel = fuel;
		this.health = health;
	}
	public ShipType getType() {
		return shipT;
	}
	public void setType(ShipType shipT) {
		this.shipT = shipT;
	}
	public int getReputation() {
		return reputation;
	}
	public int changeReputation(int reputation) {
		this.reputation += reputation;
		return reputation;
	}

	public String getName() {
		return name;
	}
	public ArrayList<Equipment> getWeapons() {
		return weapons;
	}
	/**
	 * @param weapon to be added (does NOT check to ensure it is a weapon)
	 * @return true if added properly
	 */
	public boolean addWeapon(Equipment wea)
	{
		if(weapons.size() < shipT.getWeaponSlots())
		{
			weapons.add(wea);
		}
		return false;
	}
	/**
	 * to use a weapon, remove it, then add it back once done
	 * @return longest dormant weapon of the ship
	 */
	public Equipment removeWeapon()
	{
		return weapons.remove(0);
	}
	/**
	 * @param Sheild to be added (does NOT check to ensure it is a sheild)
	 * @return true if added properly
	 */
	public boolean addSheild(Equipment she)
	{
		if(sheilds.size() < shipT.getSheildSlots())
		{
			sheilds.add(she);
		}
		return false;
	}
	/**
	 * to use a sheild, remove it, then add it back once done
	 * @return longest dormant sheild of the ship
	 */
	public Equipment removeSheild()
	{
		return sheilds.remove(0);
	}
	/**
	 * @param Gadget to be added (does NOT check to ensure it is a Gadget)
	 * @return true if added properly
	 */
	public boolean addGadget(Equipment gad)
	{
		if(gadgets.size() < shipT.getGadgetSlots())
		{
			gadgets.add(gad);
		}
		return false;
	}
	/**
	 * to use a Gadget, remove it, then add it back once done
	 * @return longest dormant Gadget of the ship
	 */
	public Equipment removeGadget()
	{
		return gadgets.remove(0);
	}
	public int getFuel() {
		return fuel;
	}
	/**
	 * 
	 * @param amount of fuel to be used
	 * @return the amount lacking, -1 if ship has enough
	 */
	public int useFuel(int used) {
		fuel = fuel - used;
		if(fuel > 0)
		{
			return -1;
		}
		else
		{
			used = fuel * (-1);
			fuel = 0;
			return used;
		}
	}
	public int getHealth() {
		return health;
	}
	/**
	 * 
	 * @param health to be taken (negative) or given in repairs (possitive)
	 * @return true if still alive
	 */
	public boolean takeDamageRepair(int health) 
	{
		this.health = health;
		if(this.health > 0)
		{
			return true;
		}
		else
		{
			health = 0;
			return false;
		}
	}	
}
