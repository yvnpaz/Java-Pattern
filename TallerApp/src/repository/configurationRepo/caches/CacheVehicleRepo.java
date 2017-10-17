package repository.configurationRepo.caches;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheVehicleRepo<K, V> extends LinkedHashMap<K, V>{
	
	private int limit;

	public CacheVehicleRepo()
	{
		this(100);
	}
	
	public CacheVehicleRepo(int maxLimit) {
		this.limit = maxLimit;
	}

	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > this.limit;
	}
	
}
