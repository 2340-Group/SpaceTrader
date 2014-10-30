/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

/**
 * Interface for police/pirate/etc. events.
 *
 * @author Jesse
 */
public interface Event {

    public String act(Player p);
    
}
