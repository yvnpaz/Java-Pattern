package main.app.actionApp;

import java.util.List;

import domain.configurations.caches.CacheBrand;
import domain.configurations.caches.CacheClient;
import domain.configurations.caches.CacheModel;
import domain.configurations.caches.CacheService;
import domain.configurations.caches.CacheVehicle;
import domain.entities.Brand;
import domain.entities.Client;
import domain.entities.Model;
import domain.entities.Service;
import domain.entities.Vehicle;
import main.app.MainFactory;
import main.app.ManageUser.brand.ManageDataBrand;
import main.app.ManageUser.client.ManageDataClient;
import main.app.ManageUser.model.ManageDataModel;
import main.app.ManageUser.service.ManageRequestService;
import main.app.ManageUser.vehicle.ManageDataVehicle;
import main.app.boundaries.servicesMain.ManagementMainService;
import main.app.boundaries.servicesMain.cachesMain.CacheClientMainService;
import main.app.boundaries.servicesMain.service.ServiceServiceMain;

public class StartApp {
	
	public static boolean noEstaBrand;
	
	public static ManagementMainService<Client> managementClient;
	public static ManagementMainService<Vehicle> managementVehicle;
	public static ManagementMainService<Brand> managementBrand;
	public static ManagementMainService<Model> managementModel;
	
	public static ServiceServiceMain managementService;
	
	public static CacheClientMainService mangementCacheClient;
	
	public StartApp() {
		managementClient = MainFactory.getManagementClientMainService();
		managementVehicle = MainFactory.getManagementVehicleMainService();
		managementBrand = MainFactory.getManagementBrandMainService();
		managementModel = MainFactory.getManagementModelMainService();
		mangementCacheClient = MainFactory.getCacheClientMainService();
		managementService = MainFactory.getServiceServiceMain();
	}
	
	public static void showMessageWelcome()
	{
		System.out.println("Welcome to Oesia WorkShop!!");
	}
	
	public static void inCacheClientMain(Client client)
	{
		Client clientCache = mangementCacheClient.insertClientMainCache(client);
		
		System.out.println("**Cache Client: "+clientCache);
	}
	
	public static int giveMeClient(CacheClient<Integer, Client> cacheClient)
	{
		Client client = ManageDataClient.giveDataClient();
		
		managementClient.insert(client);
		inCacheClientMain(client);
		
		String newDni = client.getDni().substring(0, 8);
		int newDniInt = Integer.parseInt(newDni);
		
		cacheClient.put(newDniInt, client);
		
		return newDniInt;
	}
	
	public static String giveMeVehicle(CacheVehicle<String, Vehicle> cacheVehicle, Brand brand, Model model)
	{

		Brand brandModel = brand;
		Model modelMain = model;
		String licensePlate = ManageDataVehicle.giveDataVehicle(cacheVehicle);
		
		Vehicle newVehicle = new Vehicle(licensePlate, brandModel, modelMain);
		managementVehicle.insert(newVehicle);
		
		cacheVehicle.put(licensePlate, newVehicle);
		
		return licensePlate;
	}
	
	public static Brand giveMeBrandVehicle(CacheBrand<Integer, Brand> cacheBrand)
	{
		
		Brand brand = ManageDataBrand.giveDataBrandVehicle(cacheBrand);
		
		managementBrand.insert(brand);
		
		return brand;
	}
	
	public static Model giveMeModelVehicle(CacheModel<Integer, Model> cacheModel)
	{
		
		Model model =  ManageDataModel.giveDataModelVehicle(cacheModel);
		
		managementModel.insert(model);
		
		return model;
		
	}
	
	public static List<Service> giveMeService(Client client, Vehicle vehicle)
	{
		return ManageRequestService.requestService(client, vehicle, managementService);	
	}
	
	public static boolean getExistBrand()
	{
		return noEstaBrand;
	}
}
