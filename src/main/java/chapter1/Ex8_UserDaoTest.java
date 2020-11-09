package chapter1;

import chapter1.dao.factory.Ex8_SpringDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex8_UserDaoTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Ex8_SpringDaoFactory.class);
        Ex8_SpringDaoFactory dao = context.getBean("userDao", Ex8_SpringDaoFactory.class);
    }
}
