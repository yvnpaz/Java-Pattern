package main.app.actionApp;

import java.sql.Connection;
import java.util.List;

import domain.configurations.Conversion;
import domain.configurations.caches.CacheBrand;
import domain.entities.Brand;
import repository.frameworks.jdbc.config.ConfigurationDB;
import repository.frameworks.jdbc.managers.brand.dao.BrandDao;

public class LoadBrandRepo {

	public static CacheBrand<Integer, Brand> loadBrandRepo(CacheBrand<Integer, Brand> cacheBrand)
	{
		
		ConfigurationDB.Conex();
		Connection connect = ConfigurationDB.getConex();
		BrandDao brandDao = new BrandDao();
		List<Brand> listBrand = Conversion.toListBrandRepo(brandDao.cargarBrandRepo(connect));
		
		for (Brand brand : listBrand) {
			cacheBrand.put(brand.getCode(), brand);
		}
		return cacheBrand;
	}
	
}
