/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

/**
 * Calculates probability of random events.
 *
 * @author Jesse
 */
public class EventGeneratorSimple {

    private double baseProb = 0.3;
    Player player;

    /**
     * Constructor
     *
     * */
    public EventGeneratorSimple(Player player) {

	this.player = player;
    }

    /**
     * Generates random numbers to determine which event is chosen. If both are
     * chosen, the event corresponding to the greater random number is chosen.
     * If both are chosen and both random numbers are equal, one is chosen with
     * a new random number with a 50/50 chance. If no event is chosen, then
     * there is no event.
     *
     * @return Event type that is randomly chosen based on the corresponding
     *         event probability.
     */
    public String generate() {
	double policeProb = Math.random();
	double pirateProb = Math.random();
	double policeRNG = Math.random();
	double pirateRNG = Math.random();
	double eventChance = Math.random();

	if (eventChance <= baseProb) {
	    if (policeRNG <= policeProb && pirateRNG <= pirateProb) {
		if (policeRNG > pirateRNG) {
		    return "Police";
		} else if (pirateRNG > policeRNG) {
		    return "Pirates";
		} else {
		    if (Math.random() < 0.5) {
			return "Police";
		    } else {
			return "Pirates";
		    }
		}
	    } else if (policeRNG <= policeProb) {
		return "Police";
	    } else if (pirateRNG <= pirateProb) {
		return "Pirates";
	    } else {
		return "none";
	    }
	}
	return "none";
    }
}
