package com.qf.service;

import com.qf.entity.BillInfo;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 15:04
 * @Description:
 */
public interface BillService {

    List<BillInfo> findByPage(Integer pageNum, Integer limit);

    List<BillInfo> findAllBill(Integer pageNum, Integer limit);

    void addRelease(String releasePerson, String receiveBillPerson, Date receiveBillTime, String acceptStation, String billCode);


}
