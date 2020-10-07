package com.qf.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 17:29
 * @Description: 司机信息表实体类
 */
public class DriverInfo {
    private String id;
    private String address;
    private double allowCarryVolume;
    private double allowCarryWeight;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String bizLicence;
    private String carDept;
    private String carDeptTel;
    private String carFrameNo;
    private String carLength;
    private String carNo;
    private String carType;
    private String carWidth;
    private boolean companyCar;
    private String driveLicence;
    private String driverName;
    private String engineNo;
    private String gender;
    private String goodsHeight;
    private String idCard;
    private String insuranceCard;
    private String phone;
    private String remark;
    private String runLicence;
    private String state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public double getAllowCarryVolume() {
        return allowCarryVolume;
    }

    public void setAllowCarryVolume(double allowCarryVolume) {
        this.allowCarryVolume = allowCarryVolume;
    }


    public double getAllowCarryWeight() {
        return allowCarryWeight;
    }

    public void setAllowCarryWeight(double allowCarryWeight) {
        this.allowCarryWeight = allowCarryWeight;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setBirthday(java.sql.Date birthday) {
        this.birthday = birthday;
    }


    public String getBizLicence() {
        return bizLicence;
    }

    public void setBizLicence(String bizLicence) {
        this.bizLicence = bizLicence;
    }


    public String getCarDept() {
        return carDept;
    }

    public void setCarDept(String carDept) {
        this.carDept = carDept;
    }


    public String getCarDeptTel() {
        return carDeptTel;
    }

    public void setCarDeptTel(String carDeptTel) {
        this.carDeptTel = carDeptTel;
    }


    public String getCarFrameNo() {
        return carFrameNo;
    }

    public void setCarFrameNo(String carFrameNo) {
        this.carFrameNo = carFrameNo;
    }


    public String getCarLength() {
        return carLength;
    }

    public void setCarLength(String carLength) {
        this.carLength = carLength;
    }


    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }


    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


    public String getCarWidth() {
        return carWidth;
    }

    public void setCarWidth(String carWidth) {
        this.carWidth = carWidth;
    }


    public boolean isCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(boolean companyCar) {
        this.companyCar = companyCar;
    }

    public String getDriveLicence() {
        return driveLicence;
    }

    public void setDriveLicence(String driveLicence) {
        this.driveLicence = driveLicence;
    }


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }


    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getGoodsHeight() {
        return goodsHeight;
    }

    public void setGoodsHeight(String goodsHeight) {
        this.goodsHeight = goodsHeight;
    }


    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }


    public String getInsuranceCard() {
        return insuranceCard;
    }

    public void setInsuranceCard(String insuranceCard) {
        this.insuranceCard = insuranceCard;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public String getRunLicence() {
        return runLicence;
    }

    public void setRunLicence(String runLicence) {
        this.runLicence = runLicence;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
