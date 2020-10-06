package com.qf.controller;

import com.qf.entity.User;
import com.qf.service.UserService;
import com.qf.util.JsonResult;
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

    /**
     * 用户登录
     * @param loginId
     * @param password
     * @return
     */
    @RequestMapping("/login.do")
    public JsonResult login(String loginId, String password){
        User user = userService.login(loginId, password);
        return new JsonResult(1,"登陆成功！",user);

    }

    /**
     * 注销登录
     * @param session
     * @return
     */
    @RequestMapping("/logout.do")
    public JsonResult logOut(HttpSession session){
        session.invalidate();
        return new JsonResult(1,"注销登录成功");
    }
}
