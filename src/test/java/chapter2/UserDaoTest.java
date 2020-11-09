package chapter2;

import chapter2.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    @Test
    public void addAndGet() {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter2/applicationContext.xml");

        UserDao dao = context.getBean("userDao", UserDao.class);
    }
}
