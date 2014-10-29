package spacetrader;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * CargoBay class for the ship, used to store Resource objects for trading.
 *
 * @author Kia Hadjkhan
 */

public class CargoBay implements Serializable {

    private int capacity;
    private int currentVolume;
    private ArrayList<Resource> stock;

    /**
     * creates cargo bay
     *
     * @param cap
     */
    public CargoBay(int cap) {
	stock = new ArrayList<Resource>();
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
	// stock.add(new Resource(ResourceType.MOON, 0));
    }

    /**
     * DANGEROUS - will destroy all current contents use for creating new ship
     * type
     *
     * @param cap
     *            - int new capacity
     */
    public void setCapacity(int cap) {
	capacity = cap;
	stock.clear();
	currentVolume = 0;
    }

    /**
     * adds five cargo empty slots to current cargo
     */
    public void enlargeCapacity() {
	capacity += 5;
    }

    /**
     * returns current volume
     *
     * @return currentVolume
     */
    public int getCurrentVolume() {
	return currentVolume;
    }

    /**
     * prints cargo
     */
    public String printCargo() {
	String s = "";
	for (Resource r : stock) {
//	    System.out.println("You have " + r.getQuantity() + " " + r.getName() + " in stock.");
	    s = s + "You have " + r.getQuantity() + " " + r.getName()
		    + " in stock.\n";
	}
	return s;
    }

    /**
     * returns resource stock
     *
     * @param r
     * @return resource quantity
     */
    public int getResourceStock(Resource r) {
	for (Resource rs : stock) {
	    if (r.getResourceType().equals(rs.getResourceType())) {
		return rs.getQuantity();
	    }
	}
	return 0;
    }

    /**
     * Add a Resource to the CargoBay
     *
     * @param r
     *            - Resource to be added
     * @param q
     *            - quantity of r to be added
     * @return true if added otherwise false
     */
    public void addStock(Resource r, int q) {
	if (capacity >= (currentVolume + q)) {
	    for (Resource rs : stock) {
		if (r.getResourceType().equals(rs.getResourceType())) {
		    rs.setQuantity(rs.getQuantity() + q);
		    currentVolume += q;
		}
	    }
	}

    }

    /**
     * returns capacity
     *
     * @return capacity
     */
    public int getCapacity() {
	return capacity;
    }

}