package main.app.actionWorkOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.configurations.caches.CacheService;
import domain.entities.Service;
import domain.entities.ServiceType;
import domain.entities.StateService;

public class ActionWorkOrder {
	
	public ActionWorkOrder() { }
	
	public static List<Service> giveDataWorkOrder(CacheService<String, Service> cacheService)
	{
		List<Service> listService = new ArrayList<>();
		Service service = null;
		boolean called = false;
		System.out.println(":");
		Scanner scanner = new Scanner(System.in);
		
		
		return listService;
	}	
}
