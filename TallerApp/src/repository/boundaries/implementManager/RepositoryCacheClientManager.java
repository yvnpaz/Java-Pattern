package repository.boundaries.implementManager;

import domain.entities.Client;
import repository.entities.ClientRepo;

public interface RepositoryCacheClientManager {

	ClientRepo insertCacheClientRepoManager(Client client);

}
