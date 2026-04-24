package cn.albie.factory;

import cn.albie.dao.UserDao;
import cn.albie.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
