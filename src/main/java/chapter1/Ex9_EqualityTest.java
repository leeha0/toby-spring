package chapter1;

import chapter1.dao.v6.Ex6_RefactoringInterfaceUserDao;
import chapter1.dao.v8.Ex8_SpringDaoFactory;

public class Ex9_EqualityTest {

    public static void main(String[] args) {
        // DaoFactory 통해 생성한 오브젝트는 동일하지 않다
        Ex8_SpringDaoFactory factory = new Ex8_SpringDaoFactory();
        Ex6_RefactoringInterfaceUserDao dao1 = factory.userDao();
        Ex6_RefactoringInterfaceUserDao dao2 = factory.userDao();

        System.out.println(dao1);
        System.out.println(dao2);
    }
}
