package spacetrader;

public enum Equipment {
	
	BASIC(50, "FUEL ENHANCEMENT"),
	NORMAL(100, "CARGO ENHANCEMENT"),
	ADVANCED(200, "ESCAPE POD"),
	CHEAPSHOT(Integer.MAX_VALUE, "CHEATER"),
	NOTHING(0, "NOTHING");
	
	private int powerLeft;
	private final int MAXPOWER;
	private int price;
	private String gadgetName;
	
	Equipment(int pow, String name)
	{
		powerLeft = pow;
		MAXPOWER = pow;
		price = pow*10;
		gadgetName = name;
	}
	
	public String getGadgetName()
	{
		return gadgetName;
	}
	
	public int getPower()
	{
		return powerLeft;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	/**
	 * 
	 * @param refill - int how much power to give equipment
	 * @return int new power amount, -1 if refill amount <= 0 (invalid, try usePower())
	 */
	public int upgrade(int refill)
	{
		if(refill <= 0)
		{
			return -1;
		}
		else
		{
			powerLeft = powerLeft + refill;
			if(powerLeft > MAXPOWER)
			{
				powerLeft = MAXPOWER;
			}
			return powerLeft;
		}
	}
	
	/**
	 * @param used - int the power needed
	 * @return int the amount of used that was too much for the Equipment, -1 if still has power
	 */
	public int usePower(int used)
	{
		int holding = powerLeft - used;
		if(holding <= 0)
		{
			holding = used - powerLeft;
			powerLeft = 0;
			return holding;
		}
		else
		{
			powerLeft = holding;
			return -1;
		}
	}
}
