package cn.albie.service.Impl;

import cn.albie.dao.UserDao;
import cn.albie.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save() {
        userDao.save();
    }
}
