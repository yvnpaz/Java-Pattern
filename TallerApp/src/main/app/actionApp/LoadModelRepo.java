package main.app.actionApp;

import java.sql.Connection;
import java.util.List;

import domain.configurations.Conversion;
import domain.configurations.caches.CacheModel;
import domain.entities.Model;
import repository.frameworks.jdbc.config.ConfigurationDB;
import repository.frameworks.jdbc.managers.model.dao.ModelDao;

public class LoadModelRepo {

	
	public static CacheModel<Integer, Model> loadModelRepo(CacheModel<Integer, Model> cacheModel)
	{
		
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		ModelDao modelDao = new ModelDao();
		List<Model> listModel = Conversion.toListModelRepo(modelDao.cargarModelRepo(connect));
		
		for (Model model : listModel) {
			cacheModel.put(model.getCode(), model);
		}
		return cacheModel;
	}
}
