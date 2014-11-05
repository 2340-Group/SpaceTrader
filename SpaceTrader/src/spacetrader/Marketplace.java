/*
 * Each Planet will have its own Economy
 * Economy will effect prices in each Planet
 * Economy determines whether or not trade is possible.
 * @author Kia Hadjkhan
 * @version 1.0
 */
package spacetrader;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Backing for Buy/Sell Controllers
 * @author
 */
public class Marketplace implements Serializable {

    /**
     * This helps with the serialization
     * Without it, saved games might not be handled
     * correctly by different compilers
     */
    private static final long serialVersionUID = 1L;
    private Double currentInflation;
    private final static int ECON_SCORE_MAX = 10;
    private final static int ECON_SCORE_MIN = 0;
    private ArrayList<Resource> resources;
    private int economyScore;

    /**
     * Instantiates an instance of an MarketPlace for a Planet object. Stores
     * the system's available resources in an ArrayList. initializes the
     * economyScore as 5. initializes inflation as baseline.
     */
    public Marketplace(ArrayList<Resource> r, int planetTech) {
    int i = 0;
    resources = new ArrayList<Resource>();
    for (Resource rs : r) {
        resources.add(rs);
        resources
        .get(i)
        .setPrice(
            (int) (resources.get(i).getPrice() * planetTech * ((100 - MainController
                .getPlayer().getTrading()) / 100.0)));
        i++;
    }
    // resources = r;
    // economyScore = 5;
    // currentInflation = (double) 1;
    }

    /**
     * returns a Raised price by a percent multiplier
     *
     * @param The
     *            Resource object having its price raised and the percent it's
     *            being raised by
     * @return the modified price of the Resource object Example of invocation :
     *         Economy.rasiePrice(metal, 10);
     */
    public void raisePrice(Resource r, Double percent) {
    adjustInflation(economyScore);
    int price = (int) ((r.getPrice() + r.getPrice() * (percent / 100)) * currentInflation);
    r.setPrice(price);
    }

    /**
     * returns a lowered price by a percent multiplier
     *
     * @param The
     *            Resource object having its price lowered and the percent it's
     *            being lowered by
     * @return the modified price of the Resource object Example of invocation :
     *         Economy.lowerPrice(metal, 10);
     */
    public void lowerPrice(Resource r, Double percent) {
    adjustInflation(economyScore);
    int price = (int) ((r.getPrice() - r.getPrice() * (percent / 100)) * currentInflation);
    r.setPrice(price);
    }

    /**
     * Checks the economy and prints out the inflation rate based on the
     * system's economyScore.
     *
     * @return True if trading is possible, false if unable to trade.
     */
    public boolean checkEconomy() {
    adjustInflation(economyScore);
    return economyScore == ECON_SCORE_MIN || economyScore == ECON_SCORE_MAX;
    }

    /**
     * Adjusts the inflation of the planet's economy based on the current
     * economyScore.
     *
     * @param The
     *            current economyScore of this instance of Economy.
     */
    private void adjustInflation(int e) {
    switch (e) {
    case 0:
        currentInflation = (double) 0;
        break;
    case 1:
        currentInflation = (double) 5;
        break;
    case 2:
        currentInflation = (double) 4;
        break;
    case 3:
        currentInflation = (double) 3;
        break;
    case 4:
        currentInflation = (double) 2;
        break;
    case 5:
        currentInflation = (double) 1;
        break;
    case 6:
        currentInflation = (double) 2;
        break;
    case 7:
        currentInflation = (double) 3;
        break;
    case 8:
        currentInflation = (double) 4;
        break;
    case 9:
        currentInflation = (double) 5;
        break;
    default:    // for ten as well as randomnesses
        currentInflation = (double) 0;
        break;
    }

    }

    /**
     * Buy Resource functionality, adds the resource to the ship's cargo bay and
     * subtracts funds accordingly.
     *
     * @param a
     *            Resource r, the amount of the Resource being bought, the
     *            player and his/her ship.
     */
    public void buy(Resource r, int quantity, Player p, Ship s) {
    if (r.getPrice() * quantity > p.getFunds()) {
        return;
    } else if (quantity > (s.getMaxCargo() - s.getCargo()
        .getCurrentVolume())) {
//      System.out.println("Not enough Cargo Space.");
        return;
    } else {
        s.getCargo().addStock(r, quantity);
        p.subtractFunds(r.getPrice() * quantity);
    }

    }

    /**
     * Sell Resource functionality, removes the resource from the ship's cargo
     * bay and adds funds accordingly.
     *
     * @param a
     *            Resource r, the amount of the REsource being sold, the player
     *            and his/her ship.
     */
    public void sell(Resource r, int quantity, Player p, Ship s) {
    if (s.getCargo().getResourceStock(r) < quantity) {
        return;
    } else {
        s.getCargo().addStock(r, -quantity);
        p.addFunds(r.getPrice() * quantity);
    }
    }

    /**
     * @return The Resource objects present in this planet's economy.
     */
    public ArrayList<Resource> getResources() {
    return resources;
    }

    /**
     * @return resource cost
     */
    public int getResourceCost(String s) {
    int h = 0;
    for (int i = 0; i < resources.size(); i++) {
        if (s.equals(resources.get(i).getName())) {
        h = i;
        }
    }
    // int x = resources.get(i).getPrice();
    return resources.get(h).getPrice();
    }

    /**
     * lists prices
     */
    public String listPrices() {
    String s = "";
    for (Resource r : resources) {
        s = s + r.getName() + " costs " + r.getPrice() + " credits.\n";
    }
    return s;

    }

}