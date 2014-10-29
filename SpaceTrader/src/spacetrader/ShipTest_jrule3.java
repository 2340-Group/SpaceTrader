package spacetrader;

<<<<<<< HEAD
/*
=======
>>>>>>> FETCH_HEAD
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
<<<<<<< HEAD
*/

public class ShipTest_jrule3 {
 /*   Ship defaultShip;
=======

public class ShipTest_jrule3 {
    Ship defaultShip;
>>>>>>> FETCH_HEAD
    Ship mostGadgets;
    Ship noGadgets;
    Ship oneGadget;

    @Before
    public void createShips() {
	defaultShip = new Ship();
	mostGadgets = new Ship(ShipType.GRASSHOPPER, 0, " ", null, null, null,
		0, 0);
	noGadgets = new Ship(ShipType.FLEA, 0, " ", null, null, null, 0, 0);
	oneGadget = new Ship(ShipType.HORNET, 0, null, null, null, null, 0, 0);
    }

    @Test
    public void testAddSingleGadget() {
	defaultShip.addGadget(Equipment.BASIC);
	assertTrue(defaultShip.getGadgets().contains(Equipment.BASIC));
    }
<<<<<<< HEAD
    */
=======
>>>>>>> FETCH_HEAD

}
