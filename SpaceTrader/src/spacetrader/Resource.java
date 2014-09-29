package spacetrader;


public class Resource {

    private String name;
    private int basePrice;
    private int quantity;
    private ResourceType type;

    /**
     * Holds multiple of one type of resource
     * @param t - Type of resource
     * @param quantity - how much of resource t
     */
    public Resource(ResourceType t, int quantity) {
        this.name = t.getName();
        this.basePrice = t.getBasePrice();
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return basePrice;
    }
    
    public void setPrice(int p) {
        basePrice = p;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int q) {
        quantity = q;
    }
    
    public ResourceType getResourceType()
    {
    	return type;
    }

    /**
    * Consolidates the quantities of two Resource objects of the same ResourceType.
    * @param r - Resource to be added to this
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