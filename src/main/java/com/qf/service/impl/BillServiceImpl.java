package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.dao.BillDao;
import com.qf.entity.BillInfo;
import com.qf.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 15:05
 * @Description:
 */
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillDao billDao;

    @Override
    public List<BillInfo> selectBill(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        return billDao.selectBill();
    }
}
