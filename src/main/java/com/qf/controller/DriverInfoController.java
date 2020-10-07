package com.qf.controller;

import com.github.pagehelper.Page;
import com.qf.entity.DriverInfo;
import com.qf.service.DriverInfoService;
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
    public List<String> selectAllId(){
        List<String> list = driverInfoService.findAllId();
        return list;
    }

    /**
     * 司机列表分页查询
     * @param pageNum
     * @param limit
     * @return
     */
    @RequestMapping("/selectAllByPage.do")
    public TableResult findALl(Integer pageNum,Integer limit){
        List<DriverInfo> list = driverInfoService.findAll(pageNum, limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"success",total,list);
    }

}
