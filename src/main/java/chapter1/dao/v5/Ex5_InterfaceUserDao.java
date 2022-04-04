package chapter1.dao.v5;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.DConnectionMaker;
import chapter1.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex5_InterfaceUserDao {

    // 인터페이스를 통해 접근하여 구체 클래스 정보를 알 필요가 없음
    private ConnectionMaker connectionMaker;

    public Ex5_InterfaceUserDao() {
        // 여전히 특정 클래스를 사용
        connectionMaker = new DConnectionMaker();
    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        // 인터페이스를 사용하므로 클래스가 바뀌어도 메서드 이름이 변경되지 않음
        Connection c = connectionMaker.makeConnection();

        PreparedStatement ps = c.prepareStatement(
            "insert into users(id, name, password) values (?, ?, ?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection c = connectionMaker.makeConnection();

        PreparedStatement ps = c.prepareStatement(
            "select * from users where id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return user;
    }
}
