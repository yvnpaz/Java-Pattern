package repository.boundaries.implementService;

import java.util.logging.Logger;

import domain.boundaries.ManagerRepositoryCache.CacheClientRepositoryService;
import domain.configurations.Configuration;
import domain.entities.Client;
import repository.boundaries.implementManager.RepositoryCacheClientManager;
import repository.frameworks.RepositoryManagerFactory;

public class CacheClientRepositoryServiceImpl implements CacheClientRepositoryService {

	private final Logger LOG = Logger.getLogger(CacheClientRepositoryServiceImpl.class.getName());
	
	private final RepositoryCacheClientManager repositoryCacheClientManager;
	private final CacheClientRepositoryService cacheClientRepository;
	
	public CacheClientRepositoryServiceImpl() {
		this.repositoryCacheClientManager = RepositoryManagerFactory.getRepositoryManagerCacheClientService();
		this.cacheClientRepository = Configuration.getCacheClientRepositoryService();
	}

	@Override
	public Client insertCacheClientRepo(Client client) {
		
		Client clientDom = cacheClientRepository.insertCacheClientRepo(client);
		repositoryCacheClientManager.insertCacheClientRepoManager(clientDom);
		
		return clientDom;
	}
	
}
