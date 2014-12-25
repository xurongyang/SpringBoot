package boot.dao;

import boot.domain.City;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * Created by xurongyang on 14/11/8.
 */
@NoRepositoryBean
public interface CityDao {

    public City save(City city);

    public City findByName(String name);

    public List<City> findAll(long id, String name);
}
