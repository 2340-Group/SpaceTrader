package spacetrader;

import java.io.Serializable;
import java.util.ArrayList;

public class Ship implements Serializable {
	private ShipType shipT;
	private int reputation;
//	private Planet location; Kept by owner of Ship
	private String name;
	private ArrayList<Equipment> weapons;
	private ArrayList<Equipment> sheilds;
	private ArrayList<Equipment> gadgets;
	private int fuel;
	private int health;
	private CargoBay cargo;
	
	/**
	 * Default is GNAT with full health and fuel tank
	 */
	public Ship()
	{
		shipT = ShipType.GNAT;
		fuel = shipT.getMaxDistance();
		//fuel = 14;
		health = 100;
		cargo = new CargoBay(shipT.getCargoSlots());
	}
	
	/**
	 * None of these are checked to ensure validity with the specified ShipType
	 * DO THIS BEFOREHAND
	 * @param shipType
	 * @param reputation - int
	 * @param name - String
	 * @param weapons - ArrayList<Equipment>
	 * @param sheilds - ArrayList<Equipment>
	 * @param gadgets - ArrayList<Equipment>
	 * @param fuel - int
	 * @param health - int
	 */
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
	
	/**
	 * returns shipType
	 * @return shipT
	 */
	public ShipType getType() {
		return shipT;
	}
	
	/**
	 * sets ship type
	 * @param shipT
	 */
	public void setType(ShipType shipT) {
		this.shipT = shipT;
	}
	
	/**
	 * returns reputation
	 * @return reputation
	 */
	public int getReputation() {
		return reputation;
	}
	
	/**
	 * 
	 * @param reputation - int amount to change current reputation by
	 * @return int, new reputation
	 */
	public int changeReputation(int reputation) {
		this.reputation += reputation;
		return reputation;
	}

	/**
	 * returns name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * returns weapons
	 * @return weapons
	 */
	public ArrayList<Equipment> getWeapons() {
		return weapons;
	}
	/**
	 * @param wea - Equipment weapon to be added (does NOT check to ensure it is a weapon)
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
	 * @return Equipment longest dormant weapon of the ship
	 */
	public Equipment removeWeapon()
	{
		return weapons.remove(0);
	}
	/**
	 * @param she - Equipment Sheild to be added (does NOT check to ensure it is a sheild)
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
	 * @return Equipment longest dormant sheild of the ship
	 */
	public Equipment removeSheild()
	{
		return sheilds.remove(0);
	}
	/**
	 * @param gad - Equipment Gadget to be added (does NOT check to ensure it is a Gadget)
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
	 * @return Equipment - longest dormant Gadget of the ship
	 */
	public Equipment removeGadget()
	{
		return gadgets.remove(0);
	}
	
	/**
	 * returns fuel
	 * @return fuel
	 */
	public int getFuel() {
		return fuel;
	}
	
	/**
	 * adds fuel
	 * @param i
	 */
	public void addFuel(int i) {
		fuel = fuel + i;
	}
	/**
	 * 
	 * @param used - int amount of fuel to be used
	 * @return int the amount lacking, -1 if ship has enough
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
	
	/**
	 * returns health
	 * @return health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * 
	 * @param health - int to be taken (negative) or given in repairs (possitive)
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

	/**
	 * returns cargo
	 * @return cargo
	 */
	public CargoBay getCargo() {
		return cargo;
	}
	
	public void setCargo(CargoBay cB) {
		 cargo = cB;
	}
}
//>>>>>>> FETCH_HEAD
