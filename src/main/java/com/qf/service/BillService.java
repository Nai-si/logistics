package com.qf.service;

import com.qf.entity.BillInfo;

import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 15:04
 * @Description:
 */
public interface BillService {

    List<BillInfo> selectBill(Integer pageNum, Integer limit);
}
