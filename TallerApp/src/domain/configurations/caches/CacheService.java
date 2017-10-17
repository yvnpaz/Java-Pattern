package domain.configurations.caches;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheService<K, V> extends LinkedHashMap<K, V> {

	private int limit;

	public CacheService()
	{
		this(100);
	}
	
	public CacheService(int maxLimit) {
		this.limit = maxLimit;
	}

	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > this.limit;
	}
	
	
}
