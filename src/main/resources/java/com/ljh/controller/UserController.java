package com.ljh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Liu.jihong
 * @date 2019-09-02 13:08
 */
@RestController
public class UserController {
    @Autowired
    private UserSerivceImpl userSerivce;
    @RequestMapping("/finduser")
    public Map<String,Object> findById(int id){
        UserInfo userInfo = userSerivce.findById(id);
        Map<String,Object> map=new HashMap<>();
        map.put("user",userInfo);
        return map;
    }
}
