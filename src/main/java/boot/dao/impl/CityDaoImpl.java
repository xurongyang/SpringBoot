package boot.dao.impl;

import boot.dao.CityDao;
import boot.dao.CityDaoDelegate;
import boot.util.SQLUtil;
import boot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xurongyang on 14/11/8.
 */

@Repository
public class CityDaoImpl implements CityDao {

    @Autowired
    private CityDaoDelegate delegate;

    @Override
    public City save(City city) {
        return delegate.save(city);
    }

    @Override
    public City findByName(String name) {
        return delegate.findByName(name);
    }

    @Override
    public List<City> findAll(long id, String name) {
        return delegate.findAll(SQLUtil.getSpecificationQuery(id, name));
    }
}
