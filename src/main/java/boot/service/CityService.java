package boot.service;

import boot.dao.CityDao;
import boot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xurongyang on 14/11/8.
 */

@Service
public class CityService {

    @Autowired
    private CityDao cityDao;

    public long insert(String name) {
        City city = new City();
        city.setName(name);
        return cityDao.save(city).getId();
    }

    public City get(String name) {
        City city = cityDao.findByName(name);
        return city;
    }

    public List<City> getAll(long id, String name) {
        List<City> cities = cityDao.findAll(id, name);
        return cities;
    }
}
