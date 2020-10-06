package com.qf.dao;

import com.qf.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 9:42
 * @Description:
 */
@Repository
public interface UserDao {

    User login(@Param("loginId") String loginId);

}
