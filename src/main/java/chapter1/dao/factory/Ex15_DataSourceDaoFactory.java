package chapter1.dao.factory;

import chapter1.dao.Ex15_DataSourceUserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class Ex15_DataSourceDaoFactory {

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost/springbook");
        dataSource.setUsername("spring");
        dataSource.setPassword("book");

        return dataSource;
    }

    @Bean
    public Ex15_DataSourceUserDao userDao() {
        Ex15_DataSourceUserDao userDao = new Ex15_DataSourceUserDao();
        userDao.setDataSource(dataSource());

        return userDao;
    }
}
