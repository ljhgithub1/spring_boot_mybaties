package com.ljh.service;

import com.ljh.entity.User;

/**
 * @author Liu.jihong
 * @date 2019-09-03 11:49
 */
public interface UserService {
    User findByUserName(String userName);

}
