package com.qf.dao;

import com.qf.entity.BillInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 14:58
 * @Description:
 */
@Repository
public interface BillDao {

    List<BillInfo> selectBill();
}
