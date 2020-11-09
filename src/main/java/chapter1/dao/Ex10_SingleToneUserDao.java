package chapter1.dao;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.DConnectionMaker;

public class Ex10_SingleToneUserDao {
    private static Ex10_SingleToneUserDao INSTANCE;
    private ConnectionMaker connectionMaker;

    private Ex10_SingleToneUserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public static synchronized Ex10_SingleToneUserDao getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Ex10_SingleToneUserDao(new DConnectionMaker());

        return INSTANCE;
    }
}
