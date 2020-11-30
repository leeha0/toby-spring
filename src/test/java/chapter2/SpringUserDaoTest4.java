package chapter2;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chapter2.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/chapter2/test-applicationContext.xml")
public class SpringUserDaoTest4 {

    @Autowired
    UserDao dao;

    @Before
    public void setUp() {
    }
}
