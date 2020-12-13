package chapter3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import chapter3.statement.DeleteAllStatement;
import chapter3.statement.StatementStrategy;

public class UserDaoStrategy {

    private DataSource dataSource;

    // 클라이언트
    public void deleteAll() throws SQLException {
        // 전략 오브젝트 생성
        StatementStrategy st = new DeleteAllStatement();
        // 컨텍스트 호출 및 전략 전달
        jdbcContextWithStatementStrategy(st);
    }

    // 컨텍스트
    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = dataSource.getConnection();

            // 전략 실행
            ps = stmt.makePreparedStatement(c);

            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {}
            }

            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {}
            }
        }
    }
}
