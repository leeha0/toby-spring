package chapter1;

import chapter1.connection.CountingConnectionMaker;
import chapter1.dao.v6.Ex6_RefactoringInterfaceUserDao;
import chapter1.dao.Ex12_CountingDaoFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex12_UserDaoConnectionCountingTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Ex12_CountingDaoFactory.class);
        Ex6_RefactoringInterfaceUserDao dao = context.getBean("userDao", Ex6_RefactoringInterfaceUserDao.class);

        // DAO 사용 코드

        // DL(의존관계 검색)을 사용하여 빈을 가져옴
        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("Connection counter: " + ccm.getCounter());
    }
}
