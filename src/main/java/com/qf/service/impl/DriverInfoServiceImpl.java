package com.qf.service.impl;

import com.qf.dao.DriverInfoDao;
import com.qf.service.DriverInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 17:36
 * @Description:
 */
@Service
public class DriverInfoServiceImpl implements DriverInfoService {
    @Autowired
    private DriverInfoDao driverInfoDao;


    @Override
    public List<String> findAllId() {
        return driverInfoDao.findAllId();
    }
}