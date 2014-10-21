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
	
	//Pirates steal all of your resources
	public Ship stealResources(Ship s) {
		int cap = s.getMaxCargo();
		s.setCargo(new CargoBay(cap));
		return s;
	}
	
	//challenge the pirates
	public boolean attack(Ship s) {
		return s.takeDamageRepair(-20);
	}
	
	
    
}
