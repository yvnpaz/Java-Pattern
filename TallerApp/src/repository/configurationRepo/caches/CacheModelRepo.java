package repository.configurationRepo.caches;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheModelRepo<K, V> extends LinkedHashMap<K, V> {

	private int limit;

	public CacheModelRepo()
	{
		this(100);
	}
	
	public CacheModelRepo(int maxLimit) {
		this.limit = maxLimit;
	}

	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > this.limit;
	}
}
