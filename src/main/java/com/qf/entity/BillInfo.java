package com.qf.entity;

import java.util.Date;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 14:55
 * @Description: 单据明细表
 */
public class BillInfo {
    private long id;
    private String billType;
    private String billCode;
    private String billState;
    private Date writeDate;
    private String acceptStation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation;
    }

    public BillInfo() {
    }

    public BillInfo(long id, String billType, String billCode, String billState, Date writeDate, String acceptStation) {
        this.id = id;
        this.billType = billType;
        this.billCode = billCode;
        this.billState = billState;
        this.writeDate = writeDate;
        this.acceptStation = acceptStation;
    }

    @Override
    public String toString() {
        return "BillInfo{" +
                "id=" + id +
                ", billType='" + billType + '\'' +
                ", billCode='" + billCode + '\'' +
                ", billState='" + billState + '\'' +
                ", writeDate=" + writeDate +
                ", acceptStation='" + acceptStation + '\'' +
                '}';
    }
}
