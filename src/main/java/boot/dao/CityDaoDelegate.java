package boot.dao;

import boot.domain.City;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by xurongyang on 14/11/8.
 */
public interface CityDaoDelegate extends JpaRepository<City, Long> {

    //@Query(value = "SELECT * FROM city WHERE name = ?1", nativeQuery = true)
    @Query("select u from City u where u.name = ?1")
    City findByName(String name);

    List<City> findAll(Specification<City> specification);
}
