package com.springmvc.dao;

import com.springmvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public interface UserDao {

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
