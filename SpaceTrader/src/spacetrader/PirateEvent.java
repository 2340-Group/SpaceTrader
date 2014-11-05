/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

/**
 *
 * @author Jesse
 */
public class PirateEvent implements Event {

    // Pirates steal all of your resources
    public Ship stealResources(Ship s) {
    int cap = s.getMaxCargo();
    s.setCargo(new CargoBay(cap));

    return s;
    }
    
    public String act(Player p) {
        int cap = p.getShip().getMaxCargo();
        p.getShip().setCargo(new CargoBay(cap));
        
        return "Pirates";
    }

    // Fight the pirates
    public boolean fight(Ship s) {
    int pirateFighting = (int) (Math.random() * 20);

    if (MainController.getPlayer().getFighting() >= pirateFighting) {
        int damage = -25 + MainController.getPlayer().getFighting()
            + MainController.getPlayer().getPiloting();
        if (damage > 0) {
        damage = 0;
        }
        s.takeDamageRepair(damage);
        return true;
    } else {
        s.takeDamageRepair(-999);
        return false;
    }
    }

    // Flee the pirates
    public boolean flee(Ship s) {
    int damage = -25 + MainController.getPlayer().getPiloting();

    return s.takeDamageRepair(damage);
    }
    
}
