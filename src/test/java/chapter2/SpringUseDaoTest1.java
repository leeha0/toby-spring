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
public class SpringUseDaoTest1 {

    @Autowired
    private ApplicationContext context;
    private UserDao dao;

    @Before
    public void setUp() {
        // 모든 테스트에서 동일한 인스턴스를 사용
        System.out.println(this.context);
        // 모든 테스트에서 서로 다른 인스턴스를 사용
        System.out.println(this);
        this.dao = this.context.getBean("userDao", UserDao.class);
    }
}
