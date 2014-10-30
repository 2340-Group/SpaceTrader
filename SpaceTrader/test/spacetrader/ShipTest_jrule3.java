package spacetrader;

import spacetrader.*;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

/**
 * Tests the single method addGadget() in Ship.java
 * @author Jamie
 */
public class ShipTest_jrule3 {
    /**
     * noGadgets - has no gadget slots
     * oneGadget - has one gadget slot
     * mostGadgetsThree - has three gadgets slots, the most any ship has
     * defaultShip - the ship that Player starts with at the beginning of the game
     */
    Ship defaultShip;
    Ship mostGadgetsThree;
    Ship noGadgets;
    Ship oneGadget;
    
    /**
     * creates the ships as specified by their names
     */
    @Before
    public void createShips() {
	defaultShip = new Ship();
	mostGadgetsThree = new Ship(ShipType.GRASSHOPPER, 0, " ", null, null, null,
		0, 0);
	noGadgets = new Ship(ShipType.FLEA, 0, " ", null, null, null, 0, 0);
	oneGadget = new Ship(ShipType.HORNET, 0, null, null, null, null, 0, 0);
    }
    
    /**
     * Ship should not be able to take gadgets
     */
    @Test
    public void testAddGadgetWhenNoSlots(){
	assertFalse(noGadgets.addGadget(Equipment.BASIC));
	assertTrue(noGadgets.getGadgets().isEmpty());
    }
    
    /**
     * basic adding one gadget
     * simplest test, no exceptions or extraordinary circumstances
     */
    @Test
    public void testAddSingleGadget() {
	assertTrue(defaultShip.addGadget(Equipment.BASIC));
	assertTrue(defaultShip.getGadgets().contains(Equipment.BASIC));
    }
}

