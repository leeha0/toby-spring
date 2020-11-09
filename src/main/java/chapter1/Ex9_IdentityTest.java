package chapter1;

import chapter1.dao.factory.Ex8_SpringDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex9_IdentityTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Ex8_SpringDaoFactory.class);

        Ex8_SpringDaoFactory dao3 = context.getBean("userDao", Ex8_SpringDaoFactory.class);
        Ex8_SpringDaoFactory dao4 = context.getBean("userDao", Ex8_SpringDaoFactory.class);

        // 매번 동일한 오브젝트를 돌려줌
        System.out.println(dao3);
        System.out.println(dao4);
    }
}
