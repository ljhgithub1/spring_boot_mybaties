package com.ljh.dao;

import org.springframework.stereotype.Component;

/**
 * @author Liu.jihong
 * @date 2019-09-02 13:13
 */
@Component
public interface UserMapper {
     UserInfo findById(int id);
}
