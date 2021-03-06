package spacetrader;

/**
 * Enumeration type for resource objects.
 */
public enum ResourceType {

    WATER("Water", 30), ORE("Ore", 350), FOOD("Food", 100), FURS("Furs", 250), GAMES(
        "Games", 250), FIREARMS("Firearms", 1250), MEDICINE("Medicine", 650), MACHINES(
            "Machines", 900), NARCOTICS("Narcotics", 3500), ROBOTS("Robots",
                5000), MOON("Moon", 1000000000);

    /**
     * This is the starting price without economy or Player points factored
     */
    private final int BASEPRICE;
    /**
     * UI-friendly name of Resource
     */
    private final String NAME;

    /**
     * Instantiates a ResourceType enumeration.
     */
    ResourceType(final String nam, final int base) {
    NAME = nam;
    BASEPRICE = base;
    }

    /**
     * returns NAME
     *
     * @return NAME
     */
    public String getName() {
    return NAME;
    }

    /**
     * returns BASEPRICE
     *
     * @return
     */
    public int getBasePrice() {
    return BASEPRICE;
    }
}