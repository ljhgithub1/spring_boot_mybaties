package com.ljh.service.impl;

import com.ljh.dao.UserMapper;
import com.ljh.entity.User;
import com.ljh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liu.jihong
 * @date 2019-09-03 11:50
 */
@Service
public class UserSerivceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }

}
