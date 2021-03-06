package chapter2;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chapter2.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/chapter2/applicationContext.xml")
public class SpringUseDaoTest2 {

    @Autowired
    private UserDao dao;

    @Before
    public void setUp() {
    }
}
