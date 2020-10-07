package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.dao.BillDao;
import com.qf.dao.DriverInfoDao;
import com.qf.entity.BillInfo;
import com.qf.entity.BillRelease;
import com.qf.entity.DriverInfo;
import com.qf.service.BillService;
import com.qf.util.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    @Autowired
    private DriverInfoDao driverInfoDao;

    @Override
    public List<BillInfo> findByPage(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        return billDao.findByPage();
    }

    @Override
    public List<BillInfo> findAllBill(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum,limit);
        return billDao.findAllBill(StrUtils.BILL_STATE);
    }

    @Override
    public void addRelease(String releasePerson, String receiveBillPerson, Date receiveBillTime, String acceptStation, String billCode) {
        BillRelease billRelease = new BillRelease();
        billRelease.setReleasePerson(releasePerson);
        billRelease.setReceiveBillPerson(receiveBillPerson);
        billRelease.setReceiveBillTime(receiveBillTime);
        billRelease.setAcceptStation(acceptStation);
        billDao.addRelease(billRelease);

        BillInfo billInfo = new BillInfo();
        billInfo.setBillCode(billCode);
        billInfo.setBillState(StrUtils.BILL_ON_STATE);
        billDao.updateBillInfo(billInfo);

        DriverInfo driverInfo = new DriverInfo();
        driverInfo.setState(StrUtils.DRIVER_ON_STATE);
        driverInfo.setId(receiveBillPerson);
        driverInfoDao.updateDriverInfo(driverInfo);
    }
}
