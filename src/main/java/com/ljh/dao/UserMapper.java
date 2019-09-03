package com.ljh.dao;

import com.ljh.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Liu.jihong
 * @date 2019-09-03 11:51
 */
@Mapper
public interface UserMapper {
    User findByUserName(String userName);
    User login(User user);
}
