package repository.configurationRepo.caches;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheBrandRepo<K, V> extends LinkedHashMap<K, V> {
	
	private int limit;

	public CacheBrandRepo()
	{
		this(100);
	}
	
	public CacheBrandRepo(int maxLimit) {
		this.limit = maxLimit;
	}

	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > this.limit;
	}
}
