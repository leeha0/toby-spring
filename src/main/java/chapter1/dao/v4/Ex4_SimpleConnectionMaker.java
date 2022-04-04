package chapter1.dao.v4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex4_SimpleConnectionMaker {

    // 상속을 이용한 확장 방식이 아니기 때문에 추상 메서드를 만들 필요가 없음
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");
    }
}
