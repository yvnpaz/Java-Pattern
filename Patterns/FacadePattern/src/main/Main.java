package main;

import patron.Facade;

public class Main {

	public static void main(String[] args) {
		
//		CheckLiquid liquids = new CheckLiquid();
//		liquids.comprobar();
//		CheckSiege siege = new CheckSiege();
//		siege.comprobar();
		
		/**FACADE**/
		
		Facade facade = new Facade();
		facade.startVehicle();
		
		System.out.println("Proceso finalizado.");
		
	}
}
