package com.springmvc.service;

import com.springmvc.entity.User;

import java.util.List;

public interface UserService {

    public User findByUsernameAndPwd(String username, String password);

    /**
     * 获取用户
     * @param user
     * @return
     */
    public List<User> find(User user);

    public void add(User user);

    public void update(User user);

    public void delete(String id);
}
