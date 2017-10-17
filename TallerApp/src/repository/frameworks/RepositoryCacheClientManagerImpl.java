package repository.frameworks;

import java.util.logging.Logger;

import domain.entities.Client;
import repository.boundaries.implementManager.RepositoryCacheClientManager;
import repository.entities.ClientRepo;
import repository.frameworks.jdbc.managers.client.cacheClient.ManagerCacheClientService;

public class RepositoryCacheClientManagerImpl implements RepositoryCacheClientManager {

	private static final Logger LOG = Logger.getLogger(RepositoryManagerImpl.class.getName());
	
	private final ManagerCacheClientService managerCacheClientService;
	
	public RepositoryCacheClientManagerImpl() {
		this.managerCacheClientService = RepositoryManagerFactory.getManagerCacheClientService();
	}

	@Override
	public ClientRepo insertCacheClientRepoManager(Client client) {
		ClientRepo clientRepo = managerCacheClientService.insertCacheClientRepoManage(client);
		
		return clientRepo;
	}

}
