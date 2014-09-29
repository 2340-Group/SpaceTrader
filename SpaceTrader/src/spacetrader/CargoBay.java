package spacetrader;

import java.util.ArrayList;

/**
* CargoBay class for the ship, used to store Resource objects for trading.
* @author Kia Hadjkhan
*/

public class CargoBay {

	private int capacity;
	private int currentVolume;
	private ArrayList<Resource> stock;


	public CargoBay(int cap)
	{
		capacity = cap;
		stock.add(new Resource(ResourceType.WATER, 0));
		stock.add(new Resource(ResourceType.ORE, 0));
		stock.add(new Resource(ResourceType.FOOD, 0));
		stock.add(new Resource(ResourceType.FURS, 0));
		stock.add(new Resource(ResourceType.GAMES, 0));
		stock.add(new Resource(ResourceType.FIREARMS, 0));
		stock.add(new Resource(ResourceType.MEDICINE, 0));
		stock.add(new Resource(ResourceType.MACHINES, 0));
		stock.add(new Resource(ResourceType.NARCOTICS, 0));
		stock.add(new Resource(ResourceType.ROBOTS, 0));
		stock.add(new Resource(ResourceType.MOON, 0));
	}

	
	/**
	 * DANGEROUS - will destroy all current contents
	 * use for creating new ship type
	 * @param cap - int new capacity
	 */
	public void setCapacity(int cap)
	{
		capacity = cap;
		stock.clear();
		currentVolume = 0;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void printCargo() {
		for (Resource r: stock) {
			System.out.println("You have " r.getQuantity() + " " + r.getName() + " in stock.");
		}
	}

	public int getResourceStock(Resource r) {
		for (Resource rs: stock) {
			if (r.getResourceType().equals(rs.getResourceType())) {
				return rs.getQuantity();
			}
		}
	}

	public void addStock(Resource r, int q) {
		for (Resource rs: stock) {
			if (r.getResourceType().equals(rs.getResourceType())) {
				rs.setQuantity = rs.getQuantity + q;
	/**
	 * Add a Resource to the CargoBay
	 * @param r - Resource to be added
	 * @return true if added otherwise false
	 */
	public void addStock(Resource r) {
		if(capacity >= (currentVolume+r.getQuantity()))
		{
			for (Resource rs: stock) {
				if (r.getResourceType().equals(rs.getResourceType())) {
					rs.setQuantity(rs.getQuantity() + r.getQuantity());
					currentVolume += r.getQuantity();
				}
			}
		}
		
	}

}