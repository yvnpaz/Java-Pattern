package repository.frameworks.jdbc.managers.vehicle;

import java.sql.Connection;

import repository.entities.VehicleRepo;
import repository.frameworks.jdbc.config.ConfigurationDB;
import repository.frameworks.jdbc.managers.vehicle.dao.VehicleDao;

public class ManagerVehicleServiceImpl implements ManagerVehicleService {

	@Override
	public void guardarVehicleRepoManage(VehicleRepo vehicleRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		VehicleDao vehicleDao = new VehicleDao();
		vehicleDao.guardarVehicleRepo(vehicleRepo, connect);
	}

	@Override
	public void editarVehicleRepoManage(VehicleRepo vehicleRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		VehicleDao vehicleDao = new VehicleDao();
		vehicleDao.editarVehicleRepo(vehicleRepo, connect);
	}

	@Override
	public void verVehicleRepoManage(VehicleRepo vehicleRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		VehicleDao vehicleDao = new VehicleDao();
		vehicleDao.verVehicleRepo(vehicleRepo, connect);
	}
}
