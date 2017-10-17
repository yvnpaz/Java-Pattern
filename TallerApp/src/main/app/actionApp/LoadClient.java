package main.app.actionApp;

import java.sql.Connection;
import java.util.List;

import domain.configurations.Conversion;
import domain.configurations.caches.CacheClient;
import domain.entities.Client;
import repository.frameworks.jdbc.config.ConfigurationDB;
import repository.frameworks.jdbc.managers.client.dao.ClientDao;

public class LoadClient {

	public static CacheClient<Integer, Client> loadClientRepo(CacheClient<Integer, Client> cacheClient)
	{
		
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		ClientDao clientDao = new ClientDao();
		List<Client> listClient = Conversion.toListClientRepo(clientDao.cargarClientRepo(connect));
		
		for (Client client : listClient) {
			String dni = client.getDni();
			String resultDni = dni.substring(0,8);
			int numDni = Integer.parseInt(resultDni);
			cacheClient.put(numDni, client);
		}
		return cacheClient;
	}
	
}
