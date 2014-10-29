package spacetrader;

import java.io.File;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainController implements Serializable {

    private static String currentPlanet;
    private static String currentSolarSystem;
    private static Universe u;
    private static Player p;
    private static ArrayList<Planet> pl;
    private static Ship s;
    private static ArrayList<Resource> merchant;

    public static void makeUniverse() {
	u = new Universe();
	u.generateUniverse();
	pl = u.getplanetList();
    }
    
    public MainController get(){
	return this;
    }

    public static void makePlayer(String n, int pilot, int fight, int trade,
	    int engineering, int x, int y) {
	s = new Ship();
	p = new Player(n, pilot, fight, trade, engineering, x, y, s);
	currentPlanet = "S1";
	currentSolarSystem = "SPAAACE";
    }

    /**
     * @return the String name of current location
     */
    public static String getCurrentPlanet() {
	return currentPlanet;
    }

    /**
     * @return the Planet Object of current location
     */
    public static Planet getPlanetNotString() {
	Planet currentP = new Planet(currentPlanet, 0, 0, 0, 0);
	int i = pl.indexOf(currentP);
	if (i >= 0) {
	    return pl.get(i);
	} else {
	    return null;
	}
    }

    public static String getCurrentSolarSystem() {
	return currentSolarSystem;
    }

    public static Player getPlayer() {
	return p;
    }

    public static Ship getShip() {
	return s;
    }

    public static void setCurrentPlanet(String current) {
	currentPlanet = current;
    }

    public static void setCurrentSolarSystem(String ss) {
	currentSolarSystem = ss;
    }

    public static Universe getUniverse() {
	return u;
    }

    public static int getFuelCost(String s) {
	if (s.equals(currentSolarSystem)) {
	    return 1;
	}
	return 2;
    }

    /**
     * Saves the game
     *
     * @return true if game saved successfully, otherwise false
     * @throws IOException
     */
    public static boolean saveGame() throws IOException {
	String savePlanet = currentPlanet;
	String saveSolarSystem = currentSolarSystem;
	Universe saveUniverse = u;
	Player savePlayer = p;
	ArrayList<Planet> savePl = pl;
	Ship saveShip = s;
	ArrayList<Resource> saveMerchant = merchant;

	ObjectOutputStream out = null;

	try {
	    out = new ObjectOutputStream(new FileOutputStream("saveFile.dat"));
	    out.writeObject(savePlanet);
	    out.writeObject(saveSolarSystem);
	    out.writeObject(saveUniverse);
	    out.writeObject(savePlayer);
	    out.writeObject(savePl);
	    out.writeObject(saveShip);
	    out.writeObject(saveMerchant);
	    File f = new File("saveFile.dat");
	    System.out.println("Game saved to " + f.getAbsolutePath());
	} catch (FileNotFoundException ex) {
	    System.out.println("File not found.");
	    ex.printStackTrace();
	    return false;
	} catch (IOException ex) {
	    System.out.println("IOException");
	    ex.printStackTrace();
	    return false;
	} finally {
	    try {
		if (out != null) {
		    out.flush();
		    out.close();
		}
		return true;
	    } catch (IOException ex) {
		ex.printStackTrace();
		return false;
	    }
	}
    }

    /**
     * Loads the saved game file
     *
     * @return true if game loaded successfully, otherwise false
     * @throws IOException
     */
    public static boolean loadGame() throws IOException {

	try {
	    FileInputStream fileIn = new FileInputStream("saveFile.dat");
	    ObjectInputStream in = new ObjectInputStream(fileIn);

	    currentPlanet = (String) in.readObject();
	    currentSolarSystem = (String) in.readObject();
	    u = (Universe) in.readObject();
	    p = (Player) in.readObject();
	    pl = (ArrayList<Planet>) in.readObject();
	    s = (Ship) in.readObject();
	    merchant = (ArrayList<Resource>) in.readObject();

	    in.close();
	    fileIn.close();
	    System.out.println("Game loaded.");

	    return true;
	} catch (FileNotFoundException ex) {
	    System.out.println("File not found.");
	    ex.printStackTrace();
	    return false;
	} catch (IOException ex) {
	    System.out.println("IOException");
	    ex.printStackTrace();
	    return false;
	} catch (ClassNotFoundException ex) {
	    System.out.println("MainController class not found.");
	    ex.printStackTrace();
	    return false;
	}
    }
}
