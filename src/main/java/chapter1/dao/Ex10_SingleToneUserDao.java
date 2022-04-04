package chapter1.dao;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.DConnectionMaker;

public class Ex10_SingleToneUserDao {

    private static Ex10_SingleToneUserDao INSTANCE;
    private ConnectionMaker connectionMaker;

    // Private 생성자로 인해 외부에서 호출할 수 없어 오브젝트 인젝션이 불가능
    // Private 생성자로 인해 상속이 불가능 (다형성을 적용하지 못함)
    private Ex10_SingleToneUserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public static synchronized Ex10_SingleToneUserDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Ex10_SingleToneUserDao(new DConnectionMaker());
        }

        return INSTANCE;
    }
}
