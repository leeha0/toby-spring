package chapter1.dao;

import chapter1.connection.ConnectionMaker;
import chapter1.dao.factory.Ex8_SpringDaoFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex11_DependencyLookupUserDao {

    private ConnectionMaker connectionMaker;

    public Ex11_DependencyLookupUserDao() {
        // DaoFactory 를 사용한 의존관계 검색 및 주입
        Ex8_SpringDaoFactory daoFactory = new Ex8_SpringDaoFactory();
        this.connectionMaker = daoFactory.connectionMaker();

        // ApplicationContext 를 사용한 의존관계 검색 및 주입
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Ex10_SingleToneUserDao.class);
        this.connectionMaker = context.getBean("connectionMaker", ConnectionMaker.class);
    }
}
