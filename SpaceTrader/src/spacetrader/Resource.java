package spacetrader;


public enum Resource {


    WATER("Water", 30),
    ORE("Ore", 350),
    FOOD("Food", 100),
    FURS("Furs", 250),
    GAMES("Games", 250),
    FIREARMS("Firearms", 1250),
    MEDICINE("Medicine", 650),
    MACHINES("Machines", 900),
    NARCOTICS("Narcotics", 3500),
    ROBOTS("Robots", 5000);

    private final String NAME;
    private int basePrice;
    private int quantity;
    private final int MAX_QUANTITY = 99;

    public Resource(String name, int price, int quantity) {
        this.name = name;
        this.price = basePrice;
    }

    String getName() {
        return name;
    }

    Double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    void setPrice(Double p) {
        price = p;
    }

    void setQuantity(int q) {
        quantity = q;
    }

}