package boot.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by xurongyang on 14/11/16.
 */
@Configuration
public class MyDataSource {

    @Bean(name = "dataSource")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/movie_order?useUnicode=true&amp;characterEncoding=UTF8&amp;connectTimeout=1000&amp;socketTimeout=3000");
        dataSource.setUser("root");
        dataSource.setPassword("xurongyang");
        return dataSource;
    }
}
