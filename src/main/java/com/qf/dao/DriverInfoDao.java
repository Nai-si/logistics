package com.qf.dao;

import com.qf.entity.DriverInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 17:33
 * @Description:
 */
@Repository
public interface DriverInfoDao {

    List<String> findAllId();

    List<DriverInfo> findAll();
}
