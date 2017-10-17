package domain.configurations.caches;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheWorkOrder<K, V> extends LinkedHashMap<K, V> {

	private int limit;

	public CacheWorkOrder()
	{
		this(200);
	}
	
	public CacheWorkOrder(int maxLimit) {
		this.limit = maxLimit;
	}

	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > this.limit;
	}
}
