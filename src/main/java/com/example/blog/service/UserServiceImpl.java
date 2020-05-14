package com.example.blog.service;

import com.example.blog.dao.UserDao;
import com.example.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YZY
 * @date 2020/5/13 - 22:52
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User queryByUsername(String username) {
        return userDao.queryByUsername(username);
    }

    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return userDao.queryAllByLimit(offset,limit);
    }

    @Override
    public List<User> qusryAll() {
        return userDao.queryAll();
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userDao.deleteById(id);
    }
}
