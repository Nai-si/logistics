package com.qf.controller;

import com.qf.service.GroupService;
import com.qf.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 10:47
 * @Description: 用户组控制器
 */
@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    /**
     * 查询功能菜单
     * @param loginId
     * @return
     */
    @RequestMapping("/selectFunc.do")
    public JsonResult selectFunc(String loginId){
        JsonResult jsonResult = groupService.selectFunc(loginId);
        return jsonResult;
    }

}
