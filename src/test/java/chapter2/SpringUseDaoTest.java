package chapter2;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chapter2.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class SpringUseDaoTest {

    @Autowired
    private ApplicationContext context;
    private UserDao dao;

    public void setUp() {
        this.dao = this.context.getBean("userDao", UserDao.class);
    }
}
