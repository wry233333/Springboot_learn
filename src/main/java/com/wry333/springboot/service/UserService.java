package com.wry333.springboot.service;

import com.wry333.springboot.domain.User;

public interface UserService {

    User findUserById(int id);

    int deleteById(int id);
}
