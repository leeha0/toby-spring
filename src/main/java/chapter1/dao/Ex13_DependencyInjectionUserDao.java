package chapter1.dao;

import chapter1.connection.ConnectionMaker;

public class Ex13_DependencyInjectionUserDao {

    private ConnectionMaker connectionMaker;

    // 수정자를 통한 의존성 주입
    public void setConnectionMaker(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
