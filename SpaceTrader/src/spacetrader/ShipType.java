package spacetrader;

/**
 * Enumeration of Ships
 * @author Jamie
 */
public enum ShipType {
    NOSHIP(0, 0, 0, 0, 0, 0), // nearest planet, can be made into FLEA
    FLEA(20, 0, 0, 0, 0, 2000), // 20 parsecs,
    GNAT(14, 15, 1, 1, 0, 10000), // 14 parsecs, 15 cargo, 1 weapon, 1 gadget
    FIREFLY(17, 20, 1, 1, 1, 25000), // 17 parsecs, 20 cargo, 1 weapon, 1
    // gadget, 1 shield
    MOSQUITO(17, 13, 2, 1, 1, 30000), // 17 parsecs, 13 cargo, 2 weapon, 1
    // gadget, 1 shield
    BUMBLEBEE(15, 20, 1, 2, 2, 60000), // 15 parsecs, 20 cargo, 1 weapon, 2
    // gadget, 2 shield
    BEETLE(14, 50, 0, 1, 1, 70000), // 14 parsecs, 50 cargo, 0 weapon, 1 gadget,
    // 1 shield
    HORNET(16, 20, 3, 1, 2, 80000), // 16 parsecs, 20 cargo, 3 weapon, 1 gadget,
    // 2 shield
    GRASSHOPPER(15, 30, 2, 3, 2, 80000), // 15 parsecs, 30 cargo, 2 weapon, 3
    // gadget, 2 shield
    TERMITE(13, 60, 1, 2, 3, 90000), // 13 parsecs, 60 cargo, 1 weapon, 2
    // gadget, 3 shield
    WASP(14, 35, 3, 2, 2, 100000); // 14 parsecs, 35 cargo, 3 weapon, 2 gadget,
    // 2 shield
    // MAX(20,60,3,3,3,10000)

    /**
     * Distance Ship can go
     */
    private final int PARSECS;
    /**
     * Amount resources Ship can hold
     */
    private final int CARGO;
    /**
     * Amount of weapons Ship can hold
     */
    private final int WEAPON;
    /**
     * Amount of gadgets Ship can hold
     */
    private final int GADGET;
    /**
     * Amount of sheilds Ship can hold
     */
    private final int SHEILD;
    /**
     * Base price not accounting for skill points
     */
    private final int PRICE;

    ShipType(final int par, final int car, final int wea, final int gad, final int she, final int pri) {
	PARSECS = par;
	CARGO = car;
	WEAPON = wea;
	GADGET = gad;
	SHEILD = she;
	PRICE = pri;
    }

    /**
     * DO NOT USE FOR FUEL Ship has method .getMaxFuel() use that instead
     *
     * @return how far ship can go
     */
    public int getMaxDistance() {
	return PARSECS;
    }

    /**
     * @return how much cargo the ship can hold
     */
    public int getCargoSlots() {
	return CARGO;
    }

    /**
     * @return how many weapons the ship can have
     */
    public int getWeaponSlots() {
	return WEAPON;
    }

    /**
     * @return how many gadgets the ship can have
     */
    public int getGadgetSlots() {
	return GADGET;
    }

    /**
     * @return how many sheilds the ship can have
     */
    public int getSheildSlots() {
	return SHEILD;
    }

    /**
     * @return the base price of this ShipType
     */
    public int getPrice() {
	return PRICE;
    }
}