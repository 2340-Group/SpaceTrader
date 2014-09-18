/*
* Each solar system will have its own Economy
* Economy will effect prices in each solar system
* @author Kia Hadjkhan
* @version 1.0
*/
public class Economy {

    /**
    * returns a Raised price by a percent multiplier
    * @param The Resource object having its price raised and the percent it's being raised by
    * @return the modified price of the Resource object
    * Example of invocation : Economy.rasiePrice(metal, 10);
    */
    public static int raisePrice(Resource r, Double percent) {
        percent = percent/100;
        int price = r.getPrice();
        price = price + price*percent;
        return price;

    }

    /**
    * returns a lowered price by a percent multiplier
    * @param The Resource object having its price lowered and the percent it's being lowered by
    * @return the modified price of the Resource object
    * Example of invocation : Economy.lowerPrice(metal, 10);
    */
    public static int lowerPrice(Resource r, Double percent) {

    }
}