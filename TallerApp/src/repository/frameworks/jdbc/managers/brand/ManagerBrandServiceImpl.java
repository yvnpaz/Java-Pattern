package repository.frameworks.jdbc.managers.brand;

import java.sql.Connection;

import repository.entities.BrandRepo;
import repository.frameworks.jdbc.config.ConfigurationDB;
import repository.frameworks.jdbc.managers.brand.dao.BrandDao;

public class ManagerBrandServiceImpl implements ManagerBrandService {

	@Override
	public void guardarBrandRepoManage(BrandRepo brandRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		BrandDao brandDao = new BrandDao();
		brandDao.guardarBrandRepo(brandRepo, connect);
	}

	@Override
	public void editarBrandRepoManage(BrandRepo brandRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		BrandDao brandDao = new BrandDao();
		brandDao.editarBrandRepo(brandRepo, connect);
	}

	@Override
	public void verBrandRepoManage(BrandRepo brandRepo) {
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		BrandDao brandDao = new BrandDao();
		brandDao.verBrandRepo(brandRepo, connect);
	}
}
