package chapter1.dao;

import java.sql.Connection;
import java.sql.SQLException;

import chapter1.connection.ConnectionMaker;
import chapter1.domain.User;

public class Ex11_StateUserDao {

    // 읽기 전용 인스턴스 변수는 문제 없음
    private ConnectionMaker connectionMaker;
    // 값이 바뀌는 정보를 담은 인스턴스 변수로 심각한 문제 발생
    private Connection c;
    private User user;

    public User get(String id) throws SQLException, ClassNotFoundException {
        this.c = connectionMaker.makeConnection();

        this.user = new User();
        // this.user.setId(rs.getString("id"));
        // this.user.setName(rs.getString("name"));
        // this.user.setPassword(rs.getString("password"));

        return this.user;
    }

}
