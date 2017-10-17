package main.app.ManageUser.vehicle;

import java.util.Scanner;

import domain.configurations.caches.CacheVehicle;
import domain.entities.Vehicle;

public class ManageDataVehicle {

	public ManageDataVehicle() {}
	
	public static String giveDataVehicle(CacheVehicle<String, Vehicle> cacheVehicle)
	{
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("Introduce license plate: ");
			String licensePlate = scanner.nextLine();
			
			return licensePlate;
			
		} finally {
			if(scanner != null){
				scanner.close();
			}
		}
		
	}
}
