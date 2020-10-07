package com.qf.controller;

import com.github.pagehelper.Page;
import com.qf.entity.BillInfo;
import com.qf.service.BillService;
import com.qf.util.JsonResult;
import com.qf.util.TableResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 15:08
 * @Description:
 */
@RestController
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillService billService;

    /**
     * 票据信息查询
     * @param pageNum
     * @param limit
     * @return
     */
    @RequestMapping("/findByPage.do")
    public TableResult findByPage(Integer pageNum, Integer limit){
        List<BillInfo> list = billService.findByPage(pageNum, limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"success",total,list);
    }

    /**
     * 查询未分发的票据
     * @param pageNum
     * @param limit
     * @return
     */
    @RequestMapping("/findNotRelease.do")
    public TableResult findNotRelease(Integer pageNum, Integer limit){
        List<BillInfo> list = billService.findAllBill(pageNum, limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"success",total,list);
    }

    /**
     * 添加分发票据
     * @param releasePerson
     * @param receiveBillPerson
     * @param receiveBillTime
     * @param acceptStation
     * @param billCode
     * @return
     */
    @RequestMapping("/addRelease.do")
    public JsonResult addRelease(String releasePerson, String receiveBillPerson, @DateTimeFormat(pattern = "yy-MM-dd") Date receiveBillTime, String acceptStation, String billCode){
        billService.addRelease(releasePerson,receiveBillPerson,receiveBillTime,acceptStation,billCode);
        return new JsonResult(1,"SUCCESS");
    }
}
