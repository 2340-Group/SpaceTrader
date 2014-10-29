package spacetrader;

import java.io.Serializable;
import java.util.ArrayList;

public class Ship implements Serializable {
	private ShipType shipT;
	private int reputation;
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
		reputation = 0;
		name = "";
		weapons = new ArrayList<Equipment>();
		sheilds = new ArrayList<Equipment>();
		gadgets = new ArrayList<Equipment>();
		fuel = shipT.getMaxDistance();
		health = 100;
		cargo = new CargoBay(shipT.getCargoSlots());
	}
	
	/**
	 * None of these are checked to ensure validity with the specified ShipType
	 * DO THIS BEFOREHAND
	 * @param shipType (if null, will be NOSHIP)
	 * @param reputation - int
	 * @param name - String (if null, will be set to "")
	 * @param weapons - ArrayList<Equipment> (if null, will create empty ArrayList)
	 * @param sheilds - ArrayList<Equipment> (if null, will create empty ArrayList)
	 * @param gadgets - ArrayList<Equipment> (if null, will create empty ArrayList)
	 * @param fuel - int
	 * @param health - int
	 */
	public Ship(ShipType shipT, int reputation, String name,
			ArrayList<Equipment> weapons, ArrayList<Equipment> sheilds, ArrayList<Equipment> gadgets,
			int fuel, int health) {
		this.reputation = reputation;
		this.fuel = fuel;
		this.health = health;
		cargo = new CargoBay(shipT.getCargoSlots());
		setType(shipT);
		
		this.name = name;
		if(this.name == null){
			this.name = "";
		}
		
		if(weapons == null){
			this.weapons = new ArrayList<Equipment>();
		}else{
			this.weapons = weapons;
		}
		
		if(sheilds == null){
			this.sheilds = new ArrayList<Equipment>();
		}else{
			this.sheilds = sheilds;
		}
		
		if(gadgets == null){
			this.gadgets = new ArrayList<Equipment>();
		}else{
			this.gadgets = gadgets;
			if(gadgets.contains(Equipment.NORMAL))
			{
				cargo.enlargeCapacity();
			}
		}
	}
	
	/**
	 * returns shipType
	 * @return shipT
	 */
	public ShipType getType() {
		if(shipT == null)
		{
			shipT = ShipType.NOSHIP;
		}
		return shipT;
	}
	
	/**
	 * sets ship type
	 * @param shipT - if null, ShipType will be GNAT (default starter)
	 */
	public void setType(ShipType shipT) {
		if(shipT == null){
			this.shipT = ShipType.NOSHIP;
		}else{
			this.shipT = shipT;
		}
	}
	
	/**
	 * returns reputation
	 * @return reputation
	 */
	public int getReputation() {
		return reputation;
	}
	
	/**
	 * no checks in this method
	 * @param reputation - int amount to change current reputation by
	 * @return int, new reputation
	 */
	public int changeReputation(int reputation) {
		this.reputation += reputation;
		return reputation;
	}

	/**
	 * returns name
	 * @return name - might be "" but never null
	 */
	public String getName() {
		if(name == null)
		{
			name = "";
		}
		return name;
	}
	
	/**
	 * returns weapons
	 * @return weapons - NOT A COPY!!! might be empty, but never null
	 */
	public ArrayList<Equipment> getWeapons() {
		if(weapons == null)
		{
			weapons = new ArrayList<Equipment>();
		}
		return weapons;
	}
	/**
	 * @param wea - Equipment weapon to be added (does NOT check to ensure it is a weapon)
	 * @return true if added properly
	 */
	public boolean addWeapon(Equipment wea)
	{
		if(weapons == null)
		{
			weapons = new ArrayList<Equipment>();
		}
		if(weapons.size() < shipT.getGadgetSlots())
		{
			weapons.add(wea);
			return true;
		}
		return false;
	}
	/**
	 * to use a weapon, remove it, then add it back once done
	 * @return Equipment longest dormant weapon of the ship
	 */
	public Equipment removeWeapon()
	{
		if(weapons == null)
		{
			weapons = new ArrayList<Equipment>();
		}
		if(weapons.isEmpty())
		{
			return Equipment.NOTHING;
		}
		return weapons.remove(0);
	}
	/**
	 * returns sheilds
	 * @return sheilds  - NOT A COPY!!! might be empty, but never null
	 */
	public ArrayList<Equipment> getSheilds() {
		if(sheilds == null)
		{
			sheilds = new ArrayList<Equipment>();
		}
		return sheilds;
	}
	/**
	 * @param she - Equipment Sheild to be added (does NOT check to ensure it is a sheild)
	 * @return true if added properly
	 */
	public boolean addSheild(Equipment she)
	{
		if(sheilds == null)
		{
			sheilds = new ArrayList<Equipment>();
		}
		if(sheilds.size() < shipT.getGadgetSlots())
		{
			sheilds.add(she);
			return true;
		}
		return false;
	}
	/**
	 * to use a sheild, remove it, then add it back once done
	 * @return Equipment longest dormant sheild of the ship
	 */
	public Equipment removeSheild()
	{
		if(sheilds == null)
		{
			sheilds = new ArrayList<Equipment>();
		}
		if(sheilds.isEmpty())
		{
			return Equipment.NOTHING;
		}
		return sheilds.remove(0);
	}
	/**
	 * returns gadgets
	 * if enlarge cargo bay removed, the CargoBay will continue having extra slots
	 * @return gadgets - NOT A COPY!!! might be empty, but never null
	 */
	public ArrayList<Equipment> getGadgets() {
		if(gadgets == null)
		{
			gadgets = new ArrayList<Equipment>();
		}
		return gadgets;
	}
	/**
	 * @param gad - Equipment Gadget to be added (does NOT check to ensure it is a Gadget)
	 * @return true if added properly
	 */
	public boolean addGadget(Equipment gad)
	{
		if(gad == Equipment.NOTHING || gad == null){
			return false;
		}else if(gadgets == null){
			gadgets = new ArrayList<Equipment>();
		}
		
		if(gadgets.size() < shipT.getGadgetSlots())
		{
			gadgets.add(gad);
			if(gad == Equipment.NORMAL)
			{
				cargo.enlargeCapacity();
			}
			return true;
		}
		return false;
	}
	
	/**
	 * returns fuel
	 * @return fuel
	 */
	public int getFuel() {
		return fuel;
	}
	
	/**
	 * returns max fuel based on ShipType and gadget
	 * Use this, not .getType.getMaxDistance()
	 */
	public int getMaxFuel(){
		int retVal = shipT.getMaxDistance();
		if(gadgets.contains(Equipment.BASIC))
		{
			retVal += 5;
		}
		return retVal;
	}
	
	/**
	 * adds fuel
	 * can unsafely use fuel if i<0
	 * no checks are made
	 * @param i
	 */
	public void addFuel(int addFuel) {
		fuel = fuel + addFuel;
	}
	/**
	 * 
	 * @param used - int amount of fuel to be used
	 * @return int the amount lacking, -1 if ship has enough
	 */
	public int useFuel(int used) {
		int check = fuel - used;
		if(check > 0)
		{
			fuel = check;
			return -1;
		}
		else
		{
			fuel = 0;
			return check * (-1);
		}
	}
	
	/**
	 * returns health
	 * @return health - never less than zero
	 */
	public int getHealth() {
		if(health < 0)
		{
			health = 0;
		}
		return health;
	}
	/**
	 * 
	 * @param health - int to be taken (negative) or given in repairs (possitive)
	 * @return true if still alive
	 */
	public boolean takeDamageRepair(int hea) 
	{
		if(this.health-hea > 0)
		{
			this.health += hea;
		}
		else
		{
			this.health = 0;
		}
		return health == 0;
	}
	
	/**
	 * Accounts for gadgets
	 * @return - max capacity of CargoBay
	 */
	public int getMaxCargo(){
		return cargo.getCapacity();
	}

	/**
	 * returns cargo
	 * @return cargo - might be empty, but never null
	 */
	public CargoBay getCargo() {
		if(cargo == null)
		 {
			cargo = new CargoBay(shipT.getCargoSlots());
			if(gadgets.contains(Equipment.NORMAL))
			{
				cargo.enlargeCapacity();
			}
		 }
		return cargo;
	}
	
	/**
	 * 
	 * @param cB - if null, cargo set to empty CargoBay
	 */
	public void setCargo(CargoBay cB) {
		 cargo = cB;
		 if(cargo == null)
		 {
			cargo = new CargoBay(shipT.getCargoSlots());
			if(gadgets.contains(Equipment.NORMAL))
			{
				cargo.enlargeCapacity();
			}
		 }
	}
}
