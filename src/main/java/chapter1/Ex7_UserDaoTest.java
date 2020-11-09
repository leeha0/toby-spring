package chapter1;

import chapter1.dao.Ex6_RefactoringInterfaceUserDao;
import chapter1.dao.factory.Ex7_DaoFactory;

public class Ex7_UserDaoTest {

    Ex6_RefactoringInterfaceUserDao dao = new Ex7_DaoFactory().userDao();
}
