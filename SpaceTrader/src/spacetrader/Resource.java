package spacetrader;

import java.io.Serializable;

/**
 * holder of quantity of Resources
 * @author
 */
public class Resource implements Serializable {

    /**
     * This helps with the serialization
     * Without it, saved games might not be handled
     * correctly by different compilers
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private int basePrice;
    private int quantity;
    private ResourceType type;

    /**
     * Holds multiple of one type of resource
     *
     * @param rType
     *            - Type of resource
     * @param quantity
     *            - how much of resource t
     */
    public Resource(ResourceType rType, int quantity) {
	this.name = rType.getName();
	this.basePrice = rType.getBasePrice();
	this.quantity = quantity;
	type = rType;
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
     * @param price
     */
    public void setPrice(int price) {
	basePrice = price;
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
     * @param quantity
     */
    public void setQuantity(int quantity) {
	this.quantity = quantity;
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
     * @param resource
     *            - Resource to be added to this
     */
    public void consolidate(Resource resource) {
	if (type.equals(resource.getResourceType())) {
	    setQuantity(quantity + resource.getQuantity());
	    return;
	} else {
	    return;
	}
    }

}