package chapter1.dao.v1;

import chapter1.domain.User;

import java.sql.*;

public class Ex1_UserDao {

    // main() 통한 테스트
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Ex1_UserDao dao = new Ex1_UserDao();

        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회 성공");
    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");
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
        Class.forName("com.mysql.jdbc.Driver");
        // 1) Connection 가져옴
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");

        // 2) Statement, PreparedStatement 생성
        PreparedStatement ps = c.prepareStatement(
            "select * from users where id = ?");
        ps.setString(1, id);

        // 3) Statement 실행
        // 4) 쿼리 샐행 결과 가져옴
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        // 5) Connection, Statement, ResultSet 닫음
        rs.close();
        ps.close();
        c.close();

        // 6) 예외를 캐치하거나 throws 선언하여 메서드 밖으로 던짐

        return user;
    }
}
