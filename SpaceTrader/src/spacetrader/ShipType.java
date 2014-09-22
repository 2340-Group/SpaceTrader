package spacetrader;

public enum ShipType
{
	ESCAPE(0,0,0,0,0), 			//nearest planet, can be made into FLEA
	FLEA(20,0,0,0,0), 			//20 parsecs,
	GNAT(14,15,1,1,0),			//14 parsecs, 15 cargo, 1 weapon, 1 gadget
	FIREFLY(17,20,1,1,1),		//17 parsecs, 20 cargo, 1 weapon, 1 gadget, 1 shield
	MOSQUITO(17,13,2,1,1),		//17 parsecs, 13 cargo, 2 weapon, 1 gadget, 1 shield
	BUMBLEBEE(15,20,1,2,2),		//15 parsecs, 20 cargo, 1 weapon, 2 gadget, 2 shield
	BEETLE(14,50,0,1,1),		//14 parsecs, 50 cargo, 0 weapon, 1 gadget, 1 shield
	HORNET(16,20,3,1,2),		//16 parsecs, 20 cargo, 3 weapon, 1 gadget, 2 shield
	GRASSHOPPER(15,30,2,3,2),	//15 parsecs, 30 cargo, 2 weapon, 3 gadget, 2 shield
	TERMITE(13,60,1,2,3),		//13 parsecs, 60 cargo, 1 weapon, 2 gadget, 3 shield
	WASP(14,35,3,2,2);			//14 parsecs, 35 cargo, 3 weapon, 2 gadget, 2 shield
	
	private final int PARSECS;
	private final int CARGO;
	private final int WEAPON;
	private final int GADGET;
	private final int SHEILD;
	ShipType(int par, int car, int wea, int gad, int she)
	{
		PARSECS = par;
		CARGO = car;
		WEAPON = wea;
		GADGET = gad;
		SHEILD = she;
	}
	public int getPARSECS() {
		return PARSECS;
	}
	public int getCARGO() {
		return CARGO;
	}
	public int getWEAPON() {
		return WEAPON;
	}
	public int getGADGET() {
		return GADGET;
	}
	public int getSHEILD() {
		return SHEILD;
	}
}