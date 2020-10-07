package com.qf.service.impl;

import com.qf.dao.DriverInfoDao;
import com.qf.entity.DriverInfo;
import com.qf.service.DriverInfoService;
import com.qf.util.RandomUtils;
import com.qf.util.StrUtils;
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

    private String prefix = "SJ";

    private String getDriverId(){
        String id = null;
        while(true){
            String s = RandomUtils.RandString(6);
            id = prefix + s;
            DriverInfo driverInfo = driverInfoDao.findDriverById(id);
            if(driverInfo == null){
                break;
            }
        }
        return id;
    }

    @Override
    public List<DriverInfo> selectAllId() {
        return driverInfoDao.selectAllId(StrUtils.DRIVER_STATE);
    }

}
