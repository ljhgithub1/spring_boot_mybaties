package com.ljh.controller;

import com.ljh.entity.User;
import com.ljh.service.UserService;
import com.ljh.until.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Liu.jihong
 * @date 2019-09-03 11:46
 */
@RestController
public class UserController {
    private static Logger logger=  LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    /**
     * 验证用户是否存在
     * @param username
     * @return
     */
    @RequestMapping("/findByUserName")
    public JsonResult findByUserName(@RequestParam("username") String username,HttpSession session){
        logger.debug("用户名"+username);
        User user = userService.findByUserName(username);
        String password = user.getPassword();
        JsonResult jsonResult=new JsonResult();
        Map<String,Object> map=new HashMap<>();
        if(user!=null){
            //将用户的密码取出来传到seesion域中
            session.setAttribute("checked_password",user.getPassword());
            return jsonResult;
        }
        jsonResult.setStatusCode(100);
        return jsonResult;
    }

    /**
     * 登陆
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public JsonResult login(User user,HttpSession session){
        JsonResult jsonResult=new JsonResult();
        logger.debug("用户名："+user.getUsername()+"   "+"密码："+user.getPassword());
        if(user.getPassword().equals(session.getAttribute("checked_password"))){
            return jsonResult;
        }
        jsonResult.setStatusCode(100);
        return jsonResult;
    }
}
