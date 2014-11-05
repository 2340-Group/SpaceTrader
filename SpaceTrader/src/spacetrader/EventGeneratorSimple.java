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

    private double baseProb = 0.7;
    private double policeProb;
    private double pirateProb;
    private double policeRNG;
    private double pirateRNG;
    private double eventChance;

    /**
     * Constructor
     *
     * @param player
     * */
    public EventGeneratorSimple(Player player) {
        this.policeProb = Math.random();
        this.pirateProb = Math.random();
        this.policeRNG = Math.random();
        this.pirateRNG = Math.random();
        this.eventChance = Math.random();
    }

    /**
     * Generates random numbers to determine which event is chosen. If both are
     * chosen, the event corresponding to the greater random number is chosen.
     * If both are chosen and both random numbers are equal, one is chosen with
     * a new random number with a 50/50 chance. If no event is chosen, then
     * there is no event.
     * 
     * @param next next planet to go to
     * @return Event type that is randomly chosen based on the corresponding
     *         event probability.
     */
    public String generateEvent(String next) {
        if(eventChance >= baseProb) {
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
            return next;
        }
        }
        return next;

    }
    
    public double getPoliceProb() {
        return this.policeProb;
    }
    
    public double getEventChance() {
        return this.eventChance;
    }
    
    public double getPirateProb() {
        return this.pirateProb;
    }
    
    public double getPoliceRNG() {
        return this.policeRNG;
    }

    public double getPirateRNG() {
        return this.pirateRNG;
    }
    
    public void setPoliceProb(double p) {
        this.policeProb = p;
    }
    
    public void setPirateProb(double p) {
        this.pirateProb = p;
    }
    
    public void setPirateRNG(double p) {
        this.pirateRNG = p;
    }
    public void setPoliceRNG(double p) {
        this.policeRNG = p;
    }
    
    public void setEventChance(double p) {
        this.eventChance = p;
    }
}
