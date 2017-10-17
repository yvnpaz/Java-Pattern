package main.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import domain.boundaries.Services.ServiceService;
import domain.boundaries.Services.WorkOrderService;
import domain.configurations.Configuration;
import domain.configurations.TallerFactory;
import domain.configurations.caches.CacheBrand;
import domain.configurations.caches.CacheClient;
import domain.configurations.caches.CacheModel;
import domain.configurations.caches.CacheService;
import domain.configurations.caches.CacheVehicle;
import domain.configurations.caches.CacheWorkOrder;
import domain.entities.Brand;
import domain.entities.Client;
import domain.entities.Model;
import domain.entities.Service;
import domain.entities.ServiceType;
import domain.entities.StateService;
import domain.entities.StateWorkOrder;
import domain.entities.Vehicle;
import domain.entities.WorkOrder;
import main.app.actionApp.LoadBrandRepo;
import main.app.actionApp.LoadClient;
import main.app.actionApp.LoadModelRepo;
import main.app.actionApp.StartApp;
import main.app.actionService.ActionService;
import main.app.boundaries.configuration.ConfigurationMain;
import observer.WorkOrderObservable;
import observer.WorkOrderObserver;
import repository.boundaries.RepositoryFactory;
import repository.configurationRepo.ConfigurationRepo;
import repository.frameworks.RepositoryManagerFactory;

public class TallerApp {

	private static final Logger LOG = Logger.getLogger(TallerApp.class.getName());
	public static StartApp start = new StartApp();
	public static List<Service> listServiceAction = new ArrayList<>();
	public static List<Service> listService = new ArrayList<>();
	public static List<WorkOrder> listWorkOrder = new ArrayList<>();

	public static List<WorkOrder> listWorkOrder2 = new ArrayList<>();
	public static CacheClient<Integer, Client> cacheClient = new CacheClient<>(100);
	public static CacheVehicle<String, Vehicle> cacheVehicle = new CacheVehicle<>(100);
	public static CacheBrand<Integer, Brand> cacheBrand = new CacheBrand<>(100);
	public static CacheModel<Integer, Model> cacheModel = new CacheModel<>(100);
	public static CacheService<String, Service> cacheService = new CacheService<>(200);
	public static CacheWorkOrder<String, WorkOrder> cacheWorkOrder = new CacheWorkOrder<>(200);
	public static boolean esta = false;
	public static boolean noEstaBrand = false;
	public static Model model;
	public static Brand brand;
	
	public static void main(String[] args) throws Exception {
		initLog();
		Setup();
		LOG.log(Level.INFO, "Arranca la aplicación");

		WorkOrderService managementWorkOrder = TallerFactory.getWorkService();
		ServiceService managementService = TallerFactory.getServiceService();	
		
		
		//Cargar brand -> para guardar mis datos de bd en Cache.
		LoadBrandRepo.loadBrandRepo(cacheBrand);
		//Cargar model -> para guardar mis datos de bd en Cache.
		LoadModelRepo.loadModelRepo(cacheModel);
		//Cargar clientes -> para guardar mis datos de bd en Cache.
		LoadClient.loadClientRepo(cacheClient);
		//Cargar vehicle -> para guardar mis datos de bd en Cache.
//		LoadVehicle.(cacheVehicle);

		start.showMessageWelcome();
//		int num = start.giveMeClient(cacheClient);
//		brand = start.giveMeBrandVehicle(cacheBrand);
//		System.out.println("Pause");
//		model = start.giveMeModelVehicle(cacheModel);
//		String vehicle = start.giveMeVehicle(cacheVehicle, brand, model);
		
//		model=null;
//		brand=null;
//		esta = false;
		
		//Creo primero la orden de trabajo.
		//Despues inserto client, vehicle y servicios.
		Client client = null;
		Vehicle vehicle = null;
		
		client = new Client("44492082P", "yvan", "paz", "YVAN@GMAIL.COM");
		vehicle = new Vehicle("3243KKD", new Brand(31,"Mercedes", "Ourense"), new Model(13, "GLS", 2033));
		
		WorkOrder work = managementWorkOrder.newWorkOrder(client, vehicle, listService, StateWorkOrder.ABIERTA);
		
		List<Service> listService = start.giveMeService(client, vehicle);	
		
		System.out.println("work"+work);

		System.out.println("****");
		
		LOG.log(Level.INFO, "Se crea nueva orden");
//		cacheWorkOrder.put(vehicle.getLicensePlate(), wOrder);
//		listWorkOrder.add(wOrder);

		WorkOrderObservable observado = new WorkOrderObservable(listService);
		// WorkOrderObservable observado2 = new
		// WorkOrderObservable(listWorkOrder2);
		WorkOrderObserver workObserver = new WorkOrderObserver();

//		managementService.update(wOrder, listServiceAction.get(0));
		// List<WorkOrder> work = observado.getListWorkOrder();
		// System.out.println("**"+workObserver.update(observado, args););

		observado.addObserver(workObserver);
		workObserver.update(observado, listService);
		observado.addObserver((Observable obj, Object arg) -> {
			System.out.println("\nRespuesta recibida: " + arg);

		});

		Thread threadMain = new Thread(observado, "ThreadMain");
		threadMain.start();

		System.out.println(Thread.currentThread());

		System.out.println("**");

	}

	public static void Setup() {
		Configuration.setRepository(RepositoryFactory.getClientRepositoryService());
		Configuration.setRepository(RepositoryFactory.getVehicleRepositoryService());
		Configuration.setRepository(RepositoryFactory.getBrandRepositoryService());
		Configuration.setRepository(RepositoryFactory.getModelRepositoryService());
		ConfigurationMain.setDomain(MainFactory.getWorkOrderMainService());
		Configuration.setWorkOrderService(TallerFactory.getWorkService());
		Configuration.setRepository(RepositoryFactory.getWorkOrderRepositoryService());
		Configuration.setRepository(RepositoryFactory.getServiceRepositoryService());
		//Cache
//		Configuration.setRepository(RepositoryFactory.getCacheClientRepositoryService());
		
		ConfigurationRepo.setRepositoryManager(RepositoryManagerFactory.getRepositoryManager());
		ConfigurationRepo.setManagerService(RepositoryManagerFactory.getManagerService());

		//main
		ConfigurationMain.setDomain(MainFactory.getManagementClientMainService());
		ConfigurationMain.setDomainBrand(MainFactory.getManagementBrandMainService());
		ConfigurationMain.setDomain(MainFactory.getServiceServiceMain());
//		ConfigurationMain.setDomainCacheClient(MainFactory.getCacheClientMainService());

	}

	private static void initLog() {

		try {
			LogManager.getLogManager()
					.readConfiguration(new FileInputStream("src/main/resources/config/log.properties"));
		} catch (SecurityException | IOException exception) {
			System.err.println("No se pudo cargar el fichero de configuración de Logger");
		}
	}
}
