package com.atqgh.springboot.service.impl;

import com.atqgh.springboot.bean.User;
import com.atqgh.springboot.mapper.UserMapper;
import com.atqgh.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 11:18 2019/7/23
 * @Modified By:
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public Integer selectOne(String name) {
        return userMapper.selectOne(name);
    }
}
