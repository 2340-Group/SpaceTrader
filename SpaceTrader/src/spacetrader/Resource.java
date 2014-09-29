package spacetrader;


public class Resource {


    private String name;
    private int basePrice;
    private int quantity;
    private ResourceType type;

    public Resource(ResourceType t, int quantity) {
        this.name = t.getName;
        this.price = t.getBasePrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return basePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int q) {
        quantity = q;
    }

    public ResourceType getResourceType() {
        return type;
    }

    /**
    * Consolidates the quantities of two Resource objects of the same ResourceType.
    */
    public void consolidate(Resource r) {
        if (type.equals(r.getResourceType)) {
            setQuantity(quantity + r.getQuantity());
            return;
        } else {
            return;
        }
    }

}