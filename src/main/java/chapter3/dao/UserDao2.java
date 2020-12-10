package chapter3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import chapter3.statement.DeleteAllStatement;

public class UserDao2 {

    private DataSource dataSource;

    public void deleteAll() throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            c = dataSource.getConnection();

            // 전략 실행
            ps = new DeleteAllStatement().makePreparedStatement(c);

            ps.executeUpdate();
        } catch (SQLException e) {
            // 리소스 해제
        }
    }
}
