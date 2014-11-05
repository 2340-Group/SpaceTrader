package spacetrader;

import spacetrader.*
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;

/**
* Tests sell action in MarketPlace
* @author Kia Hadjkhan
*/

public class SellTest_khadjkhan3 {

	MarketPlace market;
	MarketPlace hiTechMarket;

	@Before
	public void setUp() {
	MainController.makeUniverse();
	ArrayList<Resource> selltest = new ArrayList<>();
	selltest.add(new Resource(ResourceType.WATER, 100));
	selltest.add(new Resource(ResourceType.ORE, 100));
	selltest.add(new Resource(ResourceType.FOOD, 100));
	selltest.add(new Resource(ResourceType.FURS, 100));
	selltest.add(new Resource(ResourceType.GAMES, 100));
	selltest.add(new Resource(ResourceType.FIREARMS, 100));
	selltest.add(new Resource(ResourceType.MEDICINE, 100));
	selltest.add(new Resource(ResourceType.MACHINES, 100));
	selltest.add(new Resource(ResourceType.NARCOTICS, 100));
	selltest.add(new Resource(ResourceType.ROBOTS, 100));
	market = new MarketPlace(selltest, 2);
	hiTechMarket = new MarketPlace(selltest, 7);
	}

	// test no stock for player to sell.
	@Test
	public void testNoStock() {
		MainController.makePlayer("noStock", 0, 0, 0 ,0, 0, 0);
		Player noStock = MainController.getPlayer();
		Ship testShip = noStock.getShip();
		market.sell(market.getResources().get(0), 2, noStock, testShip);
		assertEquals(testShip.getCargo().getCurrentVolume(), 0);
		assertEquals(testShip.getCargo().getResourceStock(market.getResources().get(0)), 0);
	}

	// test higher tech level planet pay more.
	@Test
	public void testDiffTechLevel() {
		MainController.makePlayer("tech",0,0,0,0,0,0);
		Player techLevel = MainController.getPlayer();
		Ship testShip = techLevel.getShip();
		testShip.getCargo().addStock(market.getResources().get(0), 5);
		techLevel.setFunds(0);
		market.sell(market.getResources().get(0), 2, techLevel, testShip);
		int lowerTech = techLevel.getFunds();
		techLevel.setFunds(0);
		market.sell(market.getResources().get(0), 2, techLevel, testShip);
		int higherTech = techLevel.getFunds();
		assertTrue(higherTech > lowerTech);


	}

	// test player funds updated after selling
	@test
	public void testMoneyUpdated() {
		MainController.makePlayer("moneyupdate",0,0,0,0,0,0);
		Player moneyUpdate = MainController.getPlayer();
		Ship testShip = moneyUpdate.getShip();
		int currentMoney = moneyUpdate.getFunds();
		testShip.getCargo().addStock(market.getResources().get(0),5);
		market.sell(market.getResources().get(0),5, moneyUpdate, testShip);
		int afterSell = moneyUpdate.getFunds();
		assertTrue(afterSell > currentMoney);


	}

	// test player stock updated after selling
	@Test
	public void testStockUpdated() {
		MainController.makePlayer("stockupdate",0,0,0,0,0,0)
		Player stockUpdate = MainController.getPlayer();
		Ship testShip = stockUpdate.getShip();
		testShip.getCargo().addStock(market.getResources().get(0),5);
		market.sell(market.getResources().get(0),3,stockUpdate,testShip);
		assertEquals(testShip.getCargo().getResourceStock(market.getResources().get(0)), 2);


	}
}
