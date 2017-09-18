package com.springmvc.service.impl;

import com.springmvc.dao.UserDao;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Resource(name="UserDao")
    private UserDao userDao;

    @Override
    public User findByUsernameAndPwd(String username, String password) {
        return userDao.findByUsernameAndPwd(username, password);
    }

    @Override
    public List<User> find(User user) {
        return userDao.find(user);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }
}
