package com.qf.service;

import com.qf.entity.User;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 9:44
 * @Description:
 */
public interface UserService {

    User login(String loginId,String password);

}
