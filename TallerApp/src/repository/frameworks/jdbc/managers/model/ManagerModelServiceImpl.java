package repository.frameworks.jdbc.managers.model;

import java.sql.Connection;

import repository.entities.ModelRepo;
import repository.frameworks.jdbc.config.ConfigurationDB;
import repository.frameworks.jdbc.managers.model.dao.ModelDao;

public class ManagerModelServiceImpl implements ManagerModelService {

	@Override
	public void guardarModelRepoManage(ModelRepo modelRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		ModelDao modelDao = new ModelDao();
		modelDao.guardarModelRepo(modelRepo, connect);
	}

	@Override
	public void editarModelRepoManage(ModelRepo modelRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		ModelDao modelDao = new ModelDao();
		modelDao.editarModelRepo(modelRepo, connect);
	}

	@Override
	public void verModelRepoManage(ModelRepo modelRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		ModelDao modelDao = new ModelDao();
		modelDao.verModelRepo(modelRepo, connect);
	}
	
}
