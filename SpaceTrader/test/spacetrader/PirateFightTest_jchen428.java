/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the fight(Ship s) method in the PirateEvent class.
 * @author Jesse
 */
public class PirateFightTest_jchen428 {
    
    private PirateEvent event;
    private MainController mc;
    private Ship pilotShip;
    private Ship fighterShip;
    private Ship balancedShip;
    
    /**
     * Instantiates a PirateEvent and a MainController for testing
     */
    @Before
    public void setup() {
        event = new PirateEvent();
        mc = new MainController();
    }
    
    /**
     * Makes a Player specializing in piloting to test a failed fight
     * (0 health)
     */
    @Test
    public void testPilot() {
        mc.makePlayer("Pilot", 100, 0, 0, 0, 0, 0);
        pilotShip = mc.getShip();
        
        assertFalse(event.fight(pilotShip));
        assertEquals(0, pilotShip.getHealth());
    }
    
    /**
     * Makes a Player specializing in fighting to test a successful fight 
     * (full health)
     */
    @Test
    public void testFighter() {
        mc.makePlayer("Fighter", 0, 100, 0, 0, 0, 0);
        fighterShip = mc.getShip();
        
        assertTrue(event.fight(fighterShip));
        assertEquals(100, fighterShip.getHealth());
    }
    
    /**
     * Makes a Player with balanced skills to test a successful fight
     * (takes some damage)
     */
    @Test
    public void testBalanced() {
        mc.makePlayer("Balanced", 2, 20, 5, 5, 0, 0);
        balancedShip = mc.getShip();
        
        assertTrue(event.fight(balancedShip));
        assertEquals(97, balancedShip.getHealth());
    }
}
