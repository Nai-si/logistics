package com.qf.controller;

import com.github.pagehelper.Page;
import com.qf.entity.BillInfo;
import com.qf.service.BillService;
import com.qf.util.TableResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/findByPage.do")
    public TableResult billInfo(Integer pageNum, Integer limit){
        List<BillInfo> list = billService.selectBill(pageNum, limit);
        long total = ((Page) list).getTotal();
        return new TableResult(200,"success",total,list);
    }
}
