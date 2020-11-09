package chapter1.connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface Ex5_ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
