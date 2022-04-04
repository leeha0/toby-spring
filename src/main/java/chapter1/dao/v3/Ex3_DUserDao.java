package chapter1.dao.v3;

import java.sql.Connection;
import java.sql.SQLException;

public class Ex3_DUserDao extends Ex3_AbstractUserDao {

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // D 사 DB Connection 생성코드
        return null;
    }
}
