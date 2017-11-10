package patron;

import actions.StartEngine;
import entities.CheckLiquid;
import entities.CheckSiege;

public class Facade {

	private CheckLiquid liquid;
	private CheckSiege siege;
	private StartEngine startEngine;
	
	
	public Facade() {
		this.liquid = new CheckLiquid();
		this.siege = new CheckSiege();
		
		this.startEngine = new StartEngine();	
	}
	
	public void startVehicle()
	{
		liquid.check();
		siege.check();
		startEngine.start();
	}
}
