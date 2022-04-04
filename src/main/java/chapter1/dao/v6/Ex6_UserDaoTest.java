package chapter1.dao.v6;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.DConnectionMaker;

public class Ex6_UserDaoTest {

    public static void main(String[] args) {
        // 관계 설정
        ConnectionMaker connectionMaker = new DConnectionMaker();
        Ex6_RefactoringInterfaceUserDao dao = new Ex6_RefactoringInterfaceUserDao(connectionMaker);
    }
}
