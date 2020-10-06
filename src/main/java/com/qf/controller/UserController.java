package com.qf.controller;

import com.qf.entity.User;
import com.qf.service.UserService;
import com.qf.util.JsonResult;
import com.qf.util.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 9:49
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public JsonResult login(String loginId, String password, HttpSession session){
        User user = userService.login(loginId, password);
        session.setAttribute(StrUtils.LOGIN_USER,user);
        return new JsonResult(1,"登陆成功！");

    }

    @RequestMapping("/logOut.do")
    public JsonResult logOut(HttpSession session){
        session.invalidate();
        return new JsonResult(1,"注销登录成功");
    }
}
