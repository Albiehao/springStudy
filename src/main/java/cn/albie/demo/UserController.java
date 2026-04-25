package cn.albie.demo;

import cn.albie.service.Impl.UserServiceImpl;
import cn.albie.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserController {

    public static void main(String[] args) {
    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
    //ApplicationContext app = new FileSystemXmlApplicationContext("G:\\projects\\spring260424\\src\\main\\resources\\applicationContext.xml");
    UserService userServiceDao=(UserService)app.getBean("userService");
    userServiceDao.save();
    //UserService userService=new UserServiceImpl();
    //userService.save();
    //UserService userService=app.getBean(UserService.class);
    //userService.save();
    }
}
