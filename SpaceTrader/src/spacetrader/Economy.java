/*
* Each Planet will have its own Economy
* Economy will effect prices in each Planet
* Economy determines whether or not trade is possible.
* @author Kia Hadjkhan
* @version 1.0
*/
package spacetrader;
import java.util.ArrayList;

public class Economy {

    private Double currentInflation;
    private final int ECON_SCORE_MAX = 10;
    private final int ECON_SCORE_MIN = 0;
    private ArrayList<Resource> resources;
    private int economyScore;

    /**
    * Instantiates an instance of an Economy for a SolarSystem object.
    * Stores the system's available resources in an ArrayList.
    * initializes the economyScore as 5.
    * initializes inflation as baseline.
    */  
    public Economy(ArrayList<Resource> r) {
        resources = r;
        economyScore = 5;
        currentInflation = (double) 1;
    }
    /**
    * returns a Raised price by a percent multiplier
    * @param The Resource object having its price raised and the percent it's being raised by
    * @return the modified price of the Resource object
    * Example of invocation : Economy.rasiePrice(metal, 10);
    */
    public void raisePrice(Resource r, Double percent) {
        adjustInflation(economyScore);
        percent = percent/100;
        int price = r.getPrice();
        price = (int) ((price + price * percent) * currentInflation);
        r.setPrice(price);
    }

    /**
    * returns a lowered price by a percent multiplier
    * @param The Resource object having its price lowered and the percent it's being lowered by
    * @return the modified price of the Resource object
    * Example of invocation : Economy.lowerPrice(metal, 10);
    */
    public void lowerPrice(Resource r, Double percent) {
        adjustInflation(economyScore);
        percent = percent/100;
        int price = r.getPrice();
        price = (int) ((price - price * percent) * currentInflation);
        r.setPrice(price);
    }


    /**
    * Checks the economy and prints out the inflation rate based on the system's economyScore.
    * @return True if trading is possible, false if unable to trade.
    */
    public boolean checkEconomy() {
        adjustInflation(economyScore);
        if (economyScore == ECON_SCORE_MIN) {
            System.out.println("The economy has fallen apart on this Planet.");
            System.out.println("No one can afford to trade here.");
            return false;
        }
        else if (economyScore == ECON_SCORE_MAX) {
            System.out.println("The economy is thriving on this Planet.");
            System.out.println("No one has any interest to trade here.");
            return false;
        } else {
            System.out.println("The current inflation rate is " + currentInflation + ".");
            return true;
        }
    }

    /**
    * Adjusts the inflation of the planet's economy based on the current economyScore.
    * @param The current economyScore of this instance of Economy.
    */
    private void adjustInflation(int e) {
        switch (e) {
            case 0: currentInflation = (double) 0;
                    break;
            case 1: currentInflation = (double) 5;
                    break;
            case 2: currentInflation = (double) 4;
                    break;
            case 3: currentInflation = (double) 3;
                    break;
            case 4: currentInflation = (double) 2;
                    break;
            case 5: currentInflation = (double) 1;
                    break;
            case 6: currentInflation = (double) 2;
                    break;
            case 7: currentInflation = (double) 3;
                    break;
            case 8: currentInflation = (double) 4;
                    break;
            case 9: currentInflation = (double) 5;
                    break;
            case 10: currentInflation = (double) 0;
                    break;
        }

    }

    /**
    * Buy Resource functionality, adds the resource to the ship's cargo bay and
    * subtracts funds accordingly.
    * @param a Resource r, the amount of the Resource being bought, the player and his/her ship.
    */
    public void buy(Resource r, int quantity, Player p, Ship s) {
        if (r.getPrice()*quantity > p.getFunds()) {
            System.out.println("Insufficient Funds.");
            return;
        } else if (quantity > s.getCargo().getCurrentVolume()) {
            System.out.println("Not enough Cargo Space.");
            return;
        } else {
            s.getCargo().addStock(r, quantity);
            p.subtractFunds(r.getPrice()*quantity);
        }

    }

    /**
    * Sell Resource functionality, removes the resource from the ship's cargo bay and
    * adds funds accordingly.
    *@param a Resource r, the amount of the REsource being sold, the player and his/her ship.
    */
    public void sell(Resource r, int quantity, Player p, Ship s) {
        if (s.getCargo().getResourceStock(r) < quantity) {
            System.out.println("You don't that many!");
            return;
        } else {
            s.getCargo().addStock(r, -quantity);
            p.addFunds(r.getPrice()*quantity);
        }
    }

    /**
    * @return The Resource objects present in this planet's economy.
    */

    public ArrayList<Resource> getResources() {
        return resources;
    }

}