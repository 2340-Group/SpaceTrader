package spacetrader;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import spacetrader.*;

/**
 * Tests the method buy in Marketplace.java
 * @author Ryan
 *
 */
public class Test_rvazquez8 {
    
    /**
     * pnoMoney doesn't have enough money
     * 
     * pnoRoom doesn't have evough cargo space
     * 
     * p is default player
     * 
     * s is default ship
     * 
     * m is a marketplace for a tech level 1 planet
     */
    private Marketplace m;
    private Player pnoMoney;
    private Player pnoRoom;
    private Player p;
    //private Ship s;
    
    /**
     * constructor
     */
    public Test_rvazquez8() {
    }
    
    /**
     * sets up marketplace
     */
    @Before
    public void makePlayers() {
	MainController.makeUniverse();
	MainController.makePlayer("p", 0, 0, 0, 0, 0, 0);
	ArrayList<Resource> merchant = new ArrayList<>();
	merchant.add(new Resource(ResourceType.WATER, 100));
	merchant.add(new Resource(ResourceType.ORE, 100));
	merchant.add(new Resource(ResourceType.FOOD, 100));
	merchant.add(new Resource(ResourceType.FURS, 100));
	merchant.add(new Resource(ResourceType.GAMES, 100));
	merchant.add(new Resource(ResourceType.FIREARMS, 100));
	merchant.add(new Resource(ResourceType.MEDICINE, 100));
	merchant.add(new Resource(ResourceType.MACHINES, 100));
	merchant.add(new Resource(ResourceType.NARCOTICS, 100));
	merchant.add(new Resource(ResourceType.ROBOTS, 100));
	m = new Marketplace(merchant, 1);
	
    }

    
    /**
     * tests buying under normal conditions
     */
    @Test
    public void normal() {
	MainController.makePlayer("p", 0, 0, 0, 0, 0, 0);
	p = MainController.getPlayer();
	m.buy(m.getResources().get(0), 1, p, p.getShip());
	assertEquals(p.getShip().getCargo().getCurrentVolume(), 1);
	assertEquals(p.getShip().getCargo().getResourceStock(m.getResources().get(0)), 1);
	//fail("Not yet implemented");
    }
    
    /**
     * tests buy with no money
     */
    @Test
    public void nomoney() {
	MainController.makePlayer("pnoMoney", 0, 0, 0, 0, 0, 0);
	pnoMoney = MainController.getPlayer();
	pnoMoney.subtractFunds(1000);
	m.buy(m.getResources().get(0), 1, pnoMoney, pnoMoney.getShip());
	assertEquals(pnoMoney.getShip().getCargo().getCurrentVolume(), 0);
	assertEquals(pnoMoney.getShip().getCargo().getResourceStock(m.getResources().get(0)), 0);
	//fail("Not yet implemented");
    }
    
    /**
     * tests buy with no room in ship
     */
    @Test
    public void noroom() {
	MainController.makePlayer("pnoRoom", 0, 0, 0, 0, 0, 0);
	pnoRoom = MainController.getPlayer();
	pnoRoom.getShip().getCargo().addStock(m.getResources().get(0), 15);
	m.buy(m.getResources().get(1), 1, pnoRoom, pnoRoom.getShip());
	assertEquals(pnoRoom.getShip().getCargo().getResourceStock(m.getResources().get(1)), 0);
	//fail("Not yet implemented");
    }

}
