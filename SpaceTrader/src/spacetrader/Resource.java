package spacetrader;


public class Resource {


    private String name;
    private int basePrice;
    private int quantity;
    private final int MAX_QUANTITY = 99;
    private ResourceType type;

    public Resource(String name, int price, int quantity) {
        this.name = name;
        this.price = basePrice;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(Double p) {
        price = p;
    }

    public void setQuantity(int q) {
        quantity = q;
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