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
public class EventGenerator {

    private final int policeActivity, pirateActivity;
    private double baseProb = 0.05;

    /**
     * Constructor
     *
     * @param policeActivity
     *            The amount of police activity in the area. Positive integer.
     * @param pirateActivity
     *            The amount of pirate activity in the area. Positive integer.
     * @param reputation
     *            The player's reputation. If positive, increases pirate
     *            encounter chance. If negative, increases police encounter
     *            chance.
     * @param cargo
     *            The amount of cargo the ship currently has.
     * @param dist
     *            The distance the ship is traveling
     */
    public EventGenerator(int policeActivity, int pirateActivity,
	    int reputation, int cargo, int dist) {
	this.policeActivity = policeActivity;
	this.pirateActivity = pirateActivity;

	baseProb += reputation * 0.01 + cargo * 0.005 + dist * 0.001;
    }

    public double calculatePolice() {
	return baseProb + policeActivity;
    }

    public double calculatePirate() {
	return baseProb + pirateActivity;
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

    public Event generate() {
	double policeProb = calculatePolice();
	double pirateProb = calculatePirate();
	double policeRNG = Math.random();
	double pirateRNG = Math.random();

	if (policeRNG <= policeProb && pirateRNG <= pirateProb) {
	    if (policeRNG > pirateRNG) {
		return new PoliceEvent();
	    } else if (pirateRNG > policeRNG) {
		return new PirateEvent();
	    } else {
		if (Math.random() < 0.5) {
		    return new PoliceEvent();
		} else {
		    return new PirateEvent();
		}
	    }
	} else if (policeRNG <= policeProb) {
	    return new PoliceEvent();
	} else if (pirateRNG <= pirateProb) {
	    return new PirateEvent();
	}

	return null;
    }
}
