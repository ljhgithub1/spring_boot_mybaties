package com.ljh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liu.jihong
 * @date 2019-09-02 13:12
 */
@Service
public class UserSerivceImpl implements UserSerivce {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserInfo findById(int id) {
        return userMapper.findById(id);
    }
}
