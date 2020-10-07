package com.qf.service;

import com.qf.entity.DriverInfo;

import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 17:35
 * @Description:
 */
public interface DriverInfoService {

    List<DriverInfo> selectAllId();

    void addDriver(DriverInfo driverInfo);

    List<DriverInfo> selectAllByPage(Integer pageNum,Integer limit);
}
