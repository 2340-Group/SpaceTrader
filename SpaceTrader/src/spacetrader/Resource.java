package spacetrader;

import java.io.Serializable;

/**
 * holder of quantity of Resources
 * @author
 */
public class Resource implements Serializable {

    private String name;
    private int basePrice;
    private int quantity;
    private ResourceType type;

    /**
     * Holds multiple of one type of resource
     *
     * @param t
     *            - Type of resource
     * @param quantity
     *            - how much of resource t
     */
    public Resource(ResourceType t, int quantity) {
	this.name = t.getName();
	this.basePrice = t.getBasePrice();
	this.quantity = quantity;
	type = t;
    }

    /**
     * returns name
     *
     * @return name
     */
    public String getName() {
	return name;
    }

    /**
     * returns basePrice
     *
     * @return basePrice
     */
    public int getPrice() {
	return basePrice;
    }

    /**
     * sets bacePrice
     *
     * @param p
     */
    public void setPrice(int p) {
	basePrice = p;
    }

    /**
     * returns quantity
     *
     * @return quantity
     */
    public int getQuantity() {
	return quantity;
    }

    /**
     * sets quantity
     *
     * @param q
     */
    public void setQuantity(int q) {
	quantity = q;
    }

    /**
     * returns resource type
     *
     * @return type
     */
    public ResourceType getResourceType() {
	return type;
    }

    /**
     * Consolidates the quantities of two Resource objects of the same
     * ResourceType.
     *
     * @param r
     *            - Resource to be added to this
     */
    public void consolidate(Resource r) {
	if (type.equals(r.getResourceType())) {
	    setQuantity(quantity + r.getQuantity());
	    return;
	} else {
	    return;
	}
    }

}