package chapter1.dao.factory;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.DConnectionMaker;
import chapter1.dao.Ex13_DependencyInjectionUserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ex13_DaoFactory {

    @Bean
    public Ex13_DependencyInjectionUserDao userDao() {
        Ex13_DependencyInjectionUserDao userDao = new Ex13_DependencyInjectionUserDao();
        userDao.setConnectionMaker(connectionMaker());
        return userDao;
    }

    @Bean
    private ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
