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
	
	public Ship stealResources(Ship s) {
		CargoBay cB= s.getCargo;
		int cap = cB.getCapacity();
		s.setCargo(new CargoBay(cap));
		return s;
	} 
    
}
