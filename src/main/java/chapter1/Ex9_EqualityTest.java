package chapter1;

import chapter1.dao.Ex6_RefactoringInterfaceUserDao;
import chapter1.dao.factory.Ex8_SpringDaoFactory;

public class Ex9_EqualityTest {

    public static void main(String[] args) {
        Ex8_SpringDaoFactory factory = new Ex8_SpringDaoFactory();
        Ex6_RefactoringInterfaceUserDao dao1 = factory.userDao();
        Ex6_RefactoringInterfaceUserDao dao2 = factory.userDao();

        System.out.println(dao1);
        System.out.println(dao2);
    }
}
