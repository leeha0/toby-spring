package chapter1.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex4_SimpleConnectionMaker {

    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");
    }
}
