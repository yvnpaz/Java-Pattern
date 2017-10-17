package main.app.actionApp;

import java.sql.Connection;
import java.util.List;

import domain.configurations.Conversion;
import domain.configurations.caches.CacheVehicle;
import domain.entities.Vehicle;
import repository.frameworks.jdbc.config.ConfigurationDB;
import repository.frameworks.jdbc.managers.vehicle.dao.VehicleDao;

public class LoadVehicle {

	public static CacheVehicle<String, Vehicle> loadVehicleRepo(CacheVehicle<String, Vehicle> cacheVehicle)
	{
		
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		VehicleDao vehicleDao = new VehicleDao();
		List<Vehicle> listVehicle = Conversion.toListVehicleRepo(vehicleDao.cargarVehicleRepo(connect));
		
		for (Vehicle vehicle : listVehicle) {
			cacheVehicle.put(vehicle.getLicensePlate(), vehicle);
		}
		return cacheVehicle;
	}
}
