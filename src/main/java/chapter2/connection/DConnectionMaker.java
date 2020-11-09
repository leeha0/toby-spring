package chapter2.connection;

import chapter1.connection.ConnectionMaker;

import java.sql.Connection;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        // D 사의 독자적인 방법의 Connection 생성코드
        return null;
    }
}
