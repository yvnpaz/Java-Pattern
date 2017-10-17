package domain.configurations.caches;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheBrand<K, V> extends LinkedHashMap<K, V> {
	
	private int limit;

	public CacheBrand()
	{
		this(100);
	}
	
	public CacheBrand(int maxLimit) {
		this.limit = maxLimit;
	}

	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > this.limit;
	}
}
