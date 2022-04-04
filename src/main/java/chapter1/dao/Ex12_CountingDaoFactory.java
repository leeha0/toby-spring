package chapter1.dao;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.CountingConnectionMaker;
import chapter1.connection.DConnectionMaker;
import chapter1.dao.v6.Ex6_RefactoringInterfaceUserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ex12_CountingDaoFactory {

    @Bean
    public Ex6_RefactoringInterfaceUserDao userDao() {
        return new Ex6_RefactoringInterfaceUserDao(connectionMaker());
    }

    @Bean
    private ConnectionMaker connectionMaker() {
        return new CountingConnectionMaker(realConnectionMaker());
    }

    @Bean
    public ConnectionMaker realConnectionMaker() {
        return new DConnectionMaker();
    }

}
