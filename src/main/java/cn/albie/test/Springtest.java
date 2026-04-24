package cn.albie.test;

import cn.albie.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springtest {

    @Test
    // 测试scope属性
    public void testScope() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao)app.getBean("userDao");
        System.out.println(userDao);
        app.close();
    }
}
