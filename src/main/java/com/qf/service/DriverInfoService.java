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

//    List<String> findAllId();

//    List<DriverInfo> findAll(Integer pageNum,Integer limit);

    List<DriverInfo> selectAllId();

    void addDriver(DriverInfo driverInfo);
}
