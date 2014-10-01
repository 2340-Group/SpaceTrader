package spacetrader;

public class playerGeneration {
	private Player p;
	
	public playerGeneration() {
		
	}
	
	public void generatePlayer() {
		p = new Player("Trader", 0, 0, 0, 0, 0, 0, new Ship());
	}

	public Player getPlayer() {
		return p;
	}
}
