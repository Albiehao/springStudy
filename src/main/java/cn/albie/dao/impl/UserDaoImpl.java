package cn.albie.dao.impl;

import cn.albie.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public void init() {
        System.out.println("初始化方法");
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl被创建了");
    }

    public void save() {
        System.out.println("保存用户");
    }

    public void destroy() {
        System.out.println("销毁方法");
    }
}
