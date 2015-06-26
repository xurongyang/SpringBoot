package boot.dao;

import boot.domain.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by xurongyang on 14/11/8.
 */
@Configuration
public interface CityDao {

    @Insert("INSERT INTO city (name) VALUES (#{name})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() AS id", keyProperty = "id", before = false, resultType = Integer.class)
    int save(City city);

    @Select("SELECT id, name FROM city WHERE name=#{name}")
    City findByName(String name);

    @Select("SELECT id, name FROM city WHERE id=#{id} AND name=#{name}")
    List<City> findAll(long id, String name);
}
