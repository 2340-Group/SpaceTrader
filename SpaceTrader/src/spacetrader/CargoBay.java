import java.util.ArrayList;

/**
* CargoBay class for the ship, used to store Resource objects for trading.
* @author Kia Hadjkhan
*/

public class CargoBay {

	private int capacity;
	private int currentVolume;
	private ArrayList<Resource> stock;


	public CargoBay() {
		int capacity = 100;
	}
	public CargoBay(int cap)
	{
		capacity = cap;
	}
	
	/**
	 * will destroy all current contents
	 * use for creating new ship type
	 * @param cap - new capacity
	 */
	void setCapacity(int cap)
	{
		capacity = cap;
		stock.clear();
		currentVolume = 0;
	}

	public void addStock(Resource r) {
		for (Resource rs: stock) {
			if (r.getName = rs.getName) {
			
			}
		}

	}

}