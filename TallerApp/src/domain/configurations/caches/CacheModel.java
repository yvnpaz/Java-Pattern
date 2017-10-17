package domain.configurations.caches;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheModel<K, V> extends LinkedHashMap<K, V> {

	private int limit;

	public CacheModel()
	{
		this(100);
	}
	
	public CacheModel(int maxLimit) {
		this.limit = maxLimit;
	}

	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > this.limit;
	}
}
