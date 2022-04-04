package chapter1.dao.v3;

import java.sql.Connection;
import java.sql.SQLException;

public class Ex3_NUserDao extends Ex3_AbstractUserDao {

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // N 사 DB Connection 생성코드
        return null;
    }
}
