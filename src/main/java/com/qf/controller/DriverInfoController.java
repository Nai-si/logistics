package com.qf.controller;

import com.github.pagehelper.Page;
import com.qf.entity.DriverInfo;
import com.qf.service.DriverInfoService;
import com.qf.util.JsonResult;
import com.qf.util.TableResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 17:40
 * @Description:
 */
@RestController
@RequestMapping("/driverInfo")
public class DriverInfoController {
    @Autowired
    private DriverInfoService driverInfoService;

    /**
     * 分发操作领票人查询
     * @return
     */
    @RequestMapping("/selectAllId.do")
    public JsonResult selectAllId(){
        List<DriverInfo> list = driverInfoService.selectAllId();
        System.out.println("list = " + list);
        return new JsonResult(1,list);
    }

    /**
     * 添加司机
     * @param driverInfo
     * @return
     */
    @RequestMapping("/add.do")
    public JsonResult addDriver(DriverInfo driverInfo){
        driverInfoService.addDriver(driverInfo);
        return new JsonResult(1,"添加成功");
    }

    /**
     * 司机列表分页展示
     * @param pageNum
     * @param limit
     * @return
     */
    @RequestMapping("/selectAllByPage.do")
    public TableResult selectAllByPage(Integer pageNum,Integer limit){
        List<DriverInfo> list = driverInfoService.selectAllByPage(pageNum, limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"success",total,list);
    }

}
