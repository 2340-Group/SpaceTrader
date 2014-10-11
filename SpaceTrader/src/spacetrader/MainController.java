package spacetrader;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class MainController implements Initializable, Serializable {
	
	private static String currentPlanet;
	private static String currentSolarSystem;
	private static Universe u;
	private static Player p;
	private static ArrayList<Planet> pl;
	private static Ship s;
	private static ArrayList<Resource> Merchant;

	public static void makeUniverse() {
		u = new Universe();
		u.generateUniverse();
		pl = u.getplanetList();
		
	}
	
	public static void makePlayer(String n, int pilot, int fight, int trade, int engineering, int x, int y) {
		s = new Ship();
		p = new Player(n, pilot, fight, trade, engineering, x, y, s);
		currentPlanet = "S1";
		currentSolarSystem = "SPAAACE";
	}
	
	public static String getCurrentPlanet() {
		return currentPlanet;
	}
	
	public static String getCurrentSolarSystem() {
		return currentSolarSystem;
	}
	
	public static Player getPlayer() {
		return p;
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
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

        public static void saveGame(MainController controller, String filePath) throws IOException {
            ObjectOutputStream out = null;
            
            try {
                out = new ObjectOutputStream(new FileOutputStream(filePath));
                out.writeObject(controller);
            } catch(FileNotFoundException ex) {
                System.out.println("File not found.");
                ex.printStackTrace();
            } catch(IOException ex) {
                System.out.println("IOException");
                ex.printStackTrace();
            } finally {
                try {
                    if(out != null) {
                        out.flush();
                        out.close();
                    }
                } catch(IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        public static MainController loadGame(String filePath) throws IOException {
            MainController controller = null;
            
            try {
                FileInputStream fileIn = new FileInputStream(filePath);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                controller = (MainController) in.readObject();
                in.close();
                fileIn.close();
            } catch(FileNotFoundException ex) {
                System.out.println("File not found.");
                ex.printStackTrace();
            } catch(IOException ex) {
                System.out.println("IOException");
                ex.printStackTrace();
            } catch(ClassNotFoundException ex) {
                System.out.println("MainController class not found.");
                ex.printStackTrace();
            }
            
            return controller;
        }
}
