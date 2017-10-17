package repository.frameworks.jdbc.managers.client;

import java.sql.Connection;

import repository.entities.ClientRepo;
import repository.frameworks.jdbc.config.ConfigurationDB;
import repository.frameworks.jdbc.managers.client.dao.ClientDao;

public class ManagerClientServiceImpl implements ManagerClientService {

	@Override
	public void guardarClientRepoManage(ClientRepo clientRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		ClientDao clientDao = new ClientDao();
		clientDao.guardarClientRepo(clientRepo, connect);
	}

	@Override
	public void editarClientRepoManage(ClientRepo clientRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		ClientDao clientDao = new ClientDao();
		clientDao.editarClientRepo(clientRepo, connect);
	}

	@Override
	public void verClientRepoManage(ClientRepo clientRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		ClientDao clientDao = new ClientDao();
		clientDao.verClientRepo(clientRepo, connect);
	}

}
