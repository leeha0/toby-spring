package chapter1.dao.v7;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.DConnectionMaker;
import chapter1.dao.v6.Ex6_RefactoringInterfaceUserDao;

public class Ex7_DaoFactory {

    public Ex6_RefactoringInterfaceUserDao userDao() {
        return new Ex6_RefactoringInterfaceUserDao(connectionMaker());
    }

//    public AccountDao account() {
//        return new AccountDao(connectionMaker());
//    }
//
//    public MessageDao messageDao() {
//        return new MessageDao(connectionMaker());
//    }

    private ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
