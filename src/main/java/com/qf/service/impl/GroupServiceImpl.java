package com.qf.service.impl;

import com.qf.dao.GroupDao;
import com.qf.entity.FunctionWithGroup;
import com.qf.service.GroupService;
import com.qf.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 10:35
 * @Description:
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;


    @Override
    public JsonResult selectFunc(String loginId) {
        List<FunctionWithGroup> functionWithGroups = groupDao.selectFunc(loginId);
        if (functionWithGroups == null) {
            throw new RuntimeException("信息为空");
        }
        return new JsonResult(1,"成功",functionWithGroups);
    }
}
