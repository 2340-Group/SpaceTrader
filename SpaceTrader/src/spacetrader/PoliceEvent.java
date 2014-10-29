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
public class PoliceEvent implements Event {

    // Cops confiscate half of your funds
    public Player act(Player p) {
	int funds = p.getFunds();
//	System.out.print(funds);
	p.setFunds((funds) / 2);
	return p;
    }

}
