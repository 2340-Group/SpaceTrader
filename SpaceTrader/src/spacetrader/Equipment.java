package spacetrader;

public enum Equipment {
	SHEILD(100),
	WEAPON(100),
	GADGET(100);
	
	private int powerLeft;
	private final int MAXPOWER = 100;
	
	Equipment(int pow)
	{
		powerLeft = pow;
	}
	
	public int getPower()
	{
		return powerLeft;
	}
	
	/**
	 * 
	 * @param how much power to give equipment
	 * @return new power amount, -1 if refill amount <= 0 (invalid, try usePower())
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
	 * @param used - the power needed
	 * @return the amount of used that was too much for the Equipment, -1 if still has power
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
