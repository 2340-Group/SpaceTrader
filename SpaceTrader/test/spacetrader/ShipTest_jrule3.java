package spacetrader;

import org.junit.*;
import static org.junit.Assert.*;
import spacetrader.*;

/**
 * Tests the single method addGadget() in Ship.java
 * @author Jamie
 */
public class ShipTest_jrule3 {
    
    /**
     * noGadgets - has no gadget slots
     * mostGadgetsThree - has three gadgets slots, the most any ship has
     * defaultShip - the ship that Player starts with at the beginning of the game
     */
    private Ship defaultShip;
    private Ship mostGadgetsThree;
    private Ship noGadgets;
    
    /**
     * creates the ships as specified by their names
     */
    @Before
    public void createShips() {
	defaultShip = new Ship();
	mostGadgetsThree = new Ship(ShipType.GRASSHOPPER, 0, " ", null, null, null,
		0, 0);
	noGadgets = new Ship(ShipType.FLEA, 0, " ", null, null, null, 0, 0);
    }
    
    /**
     * should start empty
     */
    @Test
    public void testEmpty(){
	assertTrue(defaultShip.gadgetIsEmpty());
	assertTrue(mostGadgetsThree.gadgetIsEmpty());
	assertTrue(noGadgets.gadgetIsEmpty());
    }
    
    /**
     * add null should do nothing
     */
    @Test
    public void testAddNull(){
	assertFalse(defaultShip.addGadget(null));
	assertTrue(defaultShip.gadgetIsEmpty());
    }
    
    /**
     * add Equipment.NOTHING should do nothing
     */
    @Test
    public void testAddNothing(){
	assertFalse(defaultShip.addGadget(Equipment.NOTHING));
	assertTrue(defaultShip.gadgetIsEmpty());
    }
    
    /**
     * gadgets = null
     * adding a Gadgets should create gadgets in Ship
     */
    @Test
    public void testNullHoldingForGadget(){
	Ship nullGadgets = new Ship(ShipType.GNAT, 0, null, null, null, null, 0, 0);
	assertTrue(nullGadgets.addGadget(Equipment.BASIC));
	assertFalse(nullGadgets.gadgetIsEmpty());
    }
    
    /**
     * Ship should not be able to take gadgets, no slots
     */
    @Test
    public void testAddGadgetWhenNoSlots(){
	assertFalse(noGadgets.addGadget(Equipment.BASIC));
	assertTrue(noGadgets.gadgetIsEmpty());
    }
    
    /**
     * Ship should not be able to take gadgets, full already
     */
    @Test
    public void testAddGadgetWhenFull(){
	mostGadgetsThree.addGadget(Equipment.BASIC);
	mostGadgetsThree.addGadget(Equipment.BASIC);
	mostGadgetsThree.addGadget(Equipment.BASIC);
	assertEquals(3, mostGadgetsThree.numGadgets());
	
	assertFalse(mostGadgetsThree.addGadget(Equipment.BASIC));
	assertFalse(mostGadgetsThree.gadgetIsEmpty());
    }
    
    /**
     * basic adding one gadget
     * simplest test, no exceptions or extraordinary circumstances
     */
    @Test
    public void testAddSingleGadget() {
	assertTrue(defaultShip.addGadget(Equipment.BASIC));
	assertTrue(defaultShip.haveGadget(Equipment.BASIC));
    }
    
    /**
     * adding multiple gadgets
     * does not test limit
     */
    @Test
    public void testAddGadgets() {
	assertTrue(mostGadgetsThree.addGadget(Equipment.BASIC));
	assertTrue(mostGadgetsThree.addGadget(Equipment.NORMAL));
	assertTrue(mostGadgetsThree.addGadget(Equipment.ADVANCED));
	assertEquals(3, mostGadgetsThree.numGadgets());
    }
    
    /**
     * adding Equipment.NORMAL should enlarge the cargo bay's capacity
     */
    @Test
    public void testAddEquipmentNormal(){
	int capacity = defaultShip.getMaxCargo();
	assertTrue(defaultShip.addGadget(Equipment.NORMAL));
	capacity +=5;
	assertEquals(capacity, defaultShip.getMaxCargo());
    }
    
    /**
     * adding Equipment.BASIC should enlarge the fuel capacity
     */
    @Test
    public void testAddEquipmentBasic(){
	int capacity = defaultShip.getMaxFuel();
	assertTrue(defaultShip.addGadget(Equipment.BASIC));
	capacity +=5;
	assertEquals(capacity, defaultShip.getMaxFuel());
    }
}
