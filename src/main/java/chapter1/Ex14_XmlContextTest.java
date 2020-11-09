package chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex14_XmlContextTest {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

        // 특정 위치 설정 가능
        // new GenericXmlApplicationContext("chapter1/dao/daoContext.xml");

        // 특정 클래스의 위치 기반 설정 가능
        // new ClassPathXmlApplicationContext("daoContext.xml", Ex6_RefactoringInterfaceUserDao.class);
    }
}
