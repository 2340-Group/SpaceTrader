package spacetrader;

/**
 * Enumeration of Ship Upgrades
 * @author Jamie
 */
public enum Equipment {

    BASIC(50, "MORE FUEL"), NORMAL(100, "LARGER CARGO"), ADVANCED(200,
        "ESCAPE POD"), CHEAPSHOT(Integer.MAX_VALUE, "CHEATER"), NOTHING(0,
            "NOTHING");

    /**
     * The amount of sheilding or blasting power the sheild or weapon has left
     */
    private int powerLeft;
    
    /**
     * price not accounting for skill points
     */
    private int price;
    
    /**
     * UI-Friendly gadget name
     */
    private String gadgetName;

    Equipment(final int pow, final String name) {
    powerLeft = pow;
    price = pow * 10;
    gadgetName = name;
    }

    /**
     * @return the UI-friendly version of Gadget's name
     */
    public String getGadgetName() {
    return gadgetName;
    }

    /**
     * @return how much power the weapon or sheild has left
     */
    public int getPower() {
    return powerLeft;
    }

    /**
     * @return the price of Equipment
     */
    public int getPrice() {
    return price;
    }

    /**
     * @param used
     *            - int the power needed
     * @return int the amount of used that was too much for the Equipment, -1 if
     *         still has power
     */
    public int usePower(final int used) {
    int holding = powerLeft - used;
    int retval;
    if (holding <= 0) {
        holding = used - powerLeft;
        powerLeft = 0;
        retval = holding;
    } else {
        powerLeft = holding;
        retval = -1;
    }
    return retval;
    }
}
