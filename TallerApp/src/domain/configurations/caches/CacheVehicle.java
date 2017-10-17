package domain.configurations.caches;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheVehicle<K, V> extends LinkedHashMap<K, V>{
	
	private int limit;

	public CacheVehicle()
	{
		this(100);
	}
	
	public CacheVehicle(int maxLimit) {
		this.limit = maxLimit;
	}

	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > this.limit;
	}
	
}
