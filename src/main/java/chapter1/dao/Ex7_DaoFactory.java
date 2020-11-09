package chapter1.dao;

import chapter1.connection.DConnectionMaker;

public class Ex7_DaoFactory {

    public Ex6_RefactoringInterfaceUserDao userDao() {
        return new Ex6_RefactoringInterfaceUserDao(new DConnectionMaker());
    }

//    public AccountDao account() {
//        return new AccountDao(new DConnectionMaker());
//    }
//
//    public MessageDao messageDao() {
//        return new MessageDao(new DConnectionMaker());
//    }
}
