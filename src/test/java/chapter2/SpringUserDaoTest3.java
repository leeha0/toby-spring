package chapter2;

import javax.sql.DataSource;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.test.annotation.DirtiesContext;

import chapter2.dao.UserDao;

@DirtiesContext
public class SpringUserDaoTest3 {

    @Autowired
    UserDao dao;

    @Before
    public void setUp() {
        DataSource dataSource = new SingleConnectionDataSource("jdbc:mysql://localhost/testdb", "spring", "book", true);

        // 수정자를 통해 테스트 동안 사용할 데이터 소스 주입
        dao.setDataSource(dataSource);
    }
}
