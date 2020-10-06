package com.qf.dao;

import com.qf.entity.FunctionWithGroup;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 10:31
 * @Description:
 */
@Repository
public interface GroupDao {

    List<FunctionWithGroup> selectFunc(String loginId);

}
