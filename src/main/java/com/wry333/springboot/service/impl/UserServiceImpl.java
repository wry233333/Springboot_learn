package com.wry333.springboot.service.impl;

import com.wry333.springboot.dao.UserDao;
import com.wry333.springboot.domain.User;
import com.wry333.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserById(int id) {
        return userDao.selectById(id);
    }
    @Override
    public int deleteById(int id) {

        return userDao.deleteById(id);
    }
}
