package cn.albie.dao.impl;

import cn.albie.dao.UserDao;
import cn.albie.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {

    private List<String> strList;
    private Map<String, User>userMap;
    private Properties properties;

    private Integer age;
    private String username;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Map<String, User> getUsermap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> usermap) {
        this.userMap = usermap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void init() {
        System.out.println("初始化方法");
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl被创建了");
    }

    public void save() {
//        System.out.println("保存用户");
//        System.out.println("用户名："+username);
//        System.out.println("年龄："+age);
        System.out.println("list集合："+ strList);
        System.out.println("map集合："+userMap);
        System.out.println("properties集合："+properties);
    }

    public void destroy() {
        System.out.println("销毁方法");
    }
}
