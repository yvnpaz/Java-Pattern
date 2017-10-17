package repository.frameworks.jdbc.managers.client.cacheClient;

import domain.entities.Client;
import repository.entities.ClientRepo;

public interface ManagerCacheClientService {

	public ClientRepo insertCacheClientRepoManage(Client client);
}
