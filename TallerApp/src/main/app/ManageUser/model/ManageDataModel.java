package main.app.ManageUser.model;

import java.util.Scanner;
import java.util.Map.Entry;

import domain.configurations.caches.CacheModel;
import domain.entities.Model;

public class ManageDataModel {

	public static boolean noEstaModel;

	public ManageDataModel() {
	}

	public static Model giveDataModelVehicle(CacheModel<Integer, Model> cacheModel) {
		Scanner scanner = new Scanner(System.in);

		boolean esta = false;
		Model newModel = null;

		System.out.print("Introduce el código del modelo (Megane: 11, Ibiza: 22, etc.): ");
		int codeModel = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Introduce el nombre commercial del vehiculo: ");
		String commertialName = scanner.nextLine();
		System.out.print("Introduce el año del vehiculo: ");
		int year = scanner.nextInt();

		for (Entry<Integer, Model> itrModel : cacheModel.entrySet()) {
			Model brd = itrModel.getValue();
			if (brd.getCode() == codeModel && !esta) {
				esta = true;
				noEstaModel = false;
			}
		}
		if (!esta) {
			newModel = new Model(codeModel, commertialName, year);
			noEstaModel = true;
		}

		// si ya existe
		if (!noEstaModel) {
			newModel = new Model(codeModel, commertialName, year);
		}

		return newModel;

	}
}
