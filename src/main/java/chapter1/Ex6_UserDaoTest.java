package chapter1;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.DConnectionMaker;
import chapter1.dao.Ex6_RefactoringInterfaceUserDao;

public class Ex6_UserDaoTest {

    public static void main(String[] args) {
        // 관계 설정
        ConnectionMaker connectionMaker = new DConnectionMaker();
        Ex6_RefactoringInterfaceUserDao dao = new Ex6_RefactoringInterfaceUserDao(connectionMaker);
    }
}
