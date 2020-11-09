package chapter1.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class Ex5_DConnectionMaker implements Ex5_ConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        // D 사의 독자적인 방법의 Connection 생성코드
        return null;
    }
}
