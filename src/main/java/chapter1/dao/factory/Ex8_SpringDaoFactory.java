package chapter1.dao.factory;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.DConnectionMaker;
import chapter1.dao.Ex6_RefactoringInterfaceUserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ex8_SpringDaoFactory {

    @Bean
    public Ex6_RefactoringInterfaceUserDao userDao() {
        return new Ex6_RefactoringInterfaceUserDao(connectionMaker());
    }

    @Bean
    private ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
