package repository.frameworks.jdbc.managers.client.cacheClient;

import java.sql.Connection;

import domain.configurations.Conversion;
import domain.entities.Client;
import repository.entities.ClientRepo;
import repository.frameworks.jdbc.config.ConfigurationDB;
import repository.frameworks.jdbc.managers.client.dao.ClientDao;

public class ManagerCacheClientServiceImpl implements ManagerCacheClientService {

	@Override
	public ClientRepo insertCacheClientRepoManage(Client client) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		ClientDao clientDao = new ClientDao();
		
		ClientRepo clientRepo = Conversion.buildToClientRepo(client);
		return clientDao.insertClientRepoInCache(clientRepo, connect);
	}
}
