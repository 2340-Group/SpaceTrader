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
 *
 * @author lewisdiego
 */
public class EventGeneratorSimpleTest {
    
    Ship sh;
    Player pl;
    EventGeneratorSimple gen;
    
    public EventGeneratorSimpleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.sh = new Ship();
        this.pl = new Player("test",1,1,1,1,1,1,sh);
        this.gen = new EventGeneratorSimple(pl);
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testNoEvent() {
        gen.setEventChance(0);
        String ans = gen.generateEvent("Planet");
        assertEquals(ans, "Planet");
        
    }
    
    @Test
    public void testPoliceSuccess() {
        gen.setEventChance(1);
        gen.setPirateProb(0);
        gen.setPoliceProb(1);
        gen.setPoliceRNG(0);
        String ans = gen.generateEvent("Planet");
        assertEquals(ans, "Police");
        
    }
    
    @Test
    public void testPoliceFail() {
        gen.setEventChance(1);
        gen.setPirateProb(0);
        gen.setPoliceProb(0.9);
        gen.setPoliceRNG(1);
        String ans = gen.generateEvent("Planet");
        assertEquals(ans, "Planet");
        
    }
    
    @Test
    public void testPirateSuccess() {
        gen.setEventChance(1);
        gen.setPoliceProb(0);
        gen.setPirateProb(1);
        gen.setPirateRNG(0);
        String ans = gen.generateEvent("Planet");
        assertEquals(ans, "Pirates");
        
    }
    
    @Test
    public void testPirateFail() {
        gen.setEventChance(1);
        gen.setPoliceProb(0);
        gen.setPirateProb(0.9);
        gen.setPirateRNG(1);
        String ans = gen.generateEvent("Planet");
        assertEquals(ans, "Planet");
        
    }
    
    
    
}
