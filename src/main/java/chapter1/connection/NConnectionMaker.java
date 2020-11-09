package chapter1.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class NConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        // N 사의 독자적인 방법의 Connection 생성코드
        return null;
    }
}
