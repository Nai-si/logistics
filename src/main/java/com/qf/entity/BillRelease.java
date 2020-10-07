package com.qf.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/7 13:02
 * @Description: 单据分发表实体类
 */
public class BillRelease {
    private long id;
    private String acceptStation;
    private String billCode;
    private String billType;
    private String receiveBillPerson;

    @DateTimeFormat(pattern = "yy-MM-dd")
    private Date receiveBillTime;
    private String releasePerson;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getReceiveBillPerson() {
        return receiveBillPerson;
    }

    public void setReceiveBillPerson(String receiveBillPerson) {
        this.receiveBillPerson = receiveBillPerson;
    }

    public Date getReceiveBillTime() {
        return receiveBillTime;
    }

    public void setReceiveBillTime(Date receiveBillTime) {
        this.receiveBillTime = receiveBillTime;
    }

    public String getReleasePerson() {
        return releasePerson;
    }

    public void setReleasePerson(String releasePerson) {
        this.releasePerson = releasePerson;
    }
}
