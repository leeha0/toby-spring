package chapter1.dao;

import chapter1.connection.ConnectionMaker;

public class Ex13_DependencyInjectionUserDao {

    private ConnectionMaker connectionMaker;

    // 생성자를 통한 의존성 주입
    // public Ex13_DependencyInjectionUserDao(ConnectionMaker connectionMaker) {
    //    this.connectionMaker = connectionMaker;
    // }

    // 수정자를 통한 의존성 주입
    public void setConnectionMaker(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
