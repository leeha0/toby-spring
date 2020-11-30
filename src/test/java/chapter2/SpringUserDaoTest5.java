package chapter2;

import javax.sql.DataSource;

import org.junit.Before;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import chapter2.dao.UserDao;

public class SpringUserDaoTest5 {
    UserDao dao;

    @Before
    public void setUp() {
        dao = new UserDao();

        DataSource dataSource = new SingleConnectionDataSource("jdbc:mysql://localhost/testdb", "spring", "book", true);
        dao.setDataSource(dataSource);
    }
}
