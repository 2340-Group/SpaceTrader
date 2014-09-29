package spacetrader;

/**
* Enumeration type for resource objects.
*/

public enum ResourceType {

    WATER("Water", 30),
    ORE("Ore", 350),
    FOOD("Food", 100),
    FURS("Furs", 250),
    GAMES("Games", 250),
    FIREARMS("Firearms", 1250),
    MEDICINE("Medicine", 650),
    MACHINES("Machines", 900),
    NARCOTICS("Narcotics", 3500),
    ROBOTS("Robots", 5000),
    MOON("Moon", 1000000000);

    private final int BASEPRICE;
    private final String NAME;

    /**
<<<<<<< HEAD
    * Instatiates a ResourceType enumeration.
    */
    public ResourceType(String nam, int base) {
=======
     * @param nam - name of resource
     * @param base - base Price of resource
     */
    private ResourceType(String nam, int base) {
>>>>>>> 6ff6c1003cac9b0542158b74a1434c3e4c04be4d
        NAME = nam;
        BASEPRICE = base;
    }

    public String getName() {
        return NAME;
    }

    public int getBasePrice() {
        return BASEPRICE;
    }
} 