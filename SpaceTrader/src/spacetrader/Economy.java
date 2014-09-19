/*
* Each solar system will have its own Economy
* Economy will effect prices in each solar system
* @author Kia Hadjkhan
* @version 1.0
*/
public class Economy {

    private Double currentInflation;
    private final int ECON_SCORE_MAX = 10;
    private final int ECON_SCORE_MIN = 0;
    private ArrayList<Resource> resources;

    /**
    * Instantiates an instance of an Economy for a SolarSystem object.
    * Stores the system's available resources in an ArrayList.
    * initializes the economyScore as 5.
    * initializes inflation as baseline.
    */  
    public Economy (ArrayList<Resource> r) {
        resources = r;
        economyScore = 5;
        currentInflation = 1.0;
    }
    /**
    * returns a Raised price by a percent multiplier
    * @param The Resource object having its price raised and the percent it's being raised by
    * @return the modified price of the Resource object
    * Example of invocation : Economy.rasiePrice(metal, 10);
    */
    public static void raisePrice(Resource r, Double percent) {
        percent = percent/100;
        int price = r.getPrice();
        price = (price + price*percent) * currentInflation;
        r.setPrice = price;
    }

    /**
    * returns a lowered price by a percent multiplier
    * @param The Resource object having its price lowered and the percent it's being lowered by
    * @return the modified price of the Resource object
    * Example of invocation : Economy.lowerPrice(metal, 10);
    */
    public static void lowerPrice(Resource r, Double percent) {
        percent = percent/100;
        int price = r.getPrice();
        price = (price - price*percent) * currentInflation;
        r.setPrice = price;
    }

    /**
    * Checks the economy and prints out the inflation rate based on the system's economyScore.
    * @return True if trading is possible, false if unable to trade.
    */
    public boolean checkEconomy() {
        if (economyScore == ECON_SCORE_MIN) {
            System.out.println("The economy has fallen apart in this system.");
            System.out.println("No one can afford to trade here.");
            return false;
        }
        else if (economyScore == ECON_SCORE_MAX) {
            System.out.println("The economy is thriving in this system.");
            System.out.println("No one has any interest to trade here.");
            return false;
        } else {
            System.out.println("The current inflation rate is " + currentInflation + ".");
            return true;
        }
    }

}