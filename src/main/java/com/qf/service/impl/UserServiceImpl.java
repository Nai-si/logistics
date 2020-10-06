package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.entity.User;
import com.qf.service.UserService;
import com.qf.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 9:45
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(String loginId, String password) {
        User user = userDao.login(loginId);
        if (user == null) {
            throw new RuntimeException("账号错误");
        }
        if (!user.getPassword().equals(MD5Utils.MD5(password))){
            throw new RuntimeException("密码错误");
        }
        return user;
    }
}
