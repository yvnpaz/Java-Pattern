package domain.configurations.caches;

import java.util.LinkedHashMap;
import java.util.Map;

import repository.entities.ClientRepo;

public class CacheClient<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = 1L;
	private int limit;
	private int numDni;
	private ClientRepo clientRepo;

	public CacheClient(int numDni, ClientRepo clientRepo)
	{
		this.numDni = numDni;
		this.clientRepo = clientRepo;
	}
	
	public CacheClient()
	{
		this(100);
	}	

	public CacheClient(int maxLimit) {
		this.limit = maxLimit;
	}
	
	public int getNumDni() {
		return numDni;
	}


	public void setNumDni(int numDni) {
		this.numDni = numDni;
	}

	public ClientRepo getClient() {
		return clientRepo;
	}


	public void setClient(ClientRepo clientRepo) {
		this.clientRepo = clientRepo;
	}


	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > this.limit;
	}
	
}
