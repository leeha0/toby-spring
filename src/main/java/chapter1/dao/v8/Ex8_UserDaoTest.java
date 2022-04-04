package chapter1.dao.v8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex8_UserDaoTest {

    public static void main(String[] args) {
        // @Configuration 자바 코드를 설정정보로 사용하려면 AnnotationConfigApplicationContext 사용
        ApplicationContext context = new AnnotationConfigApplicationContext(Ex8_SpringDaoFactory.class);
        Ex8_SpringDaoFactory dao = context.getBean("userDao", Ex8_SpringDaoFactory.class);
    }
}
