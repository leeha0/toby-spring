package chapter1.dao.v7;

import chapter1.dao.v6.Ex6_RefactoringInterfaceUserDao;

public class Ex7_UserDaoTest {

    // 생성과 초기화에 신경 쓰지 않고 오브젝트를 생성
    Ex6_RefactoringInterfaceUserDao dao = new Ex7_DaoFactory().userDao();
}
