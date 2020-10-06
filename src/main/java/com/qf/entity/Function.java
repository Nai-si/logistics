package com.qf.entity;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 10:23
 * @Description: 功能实体类
 */
public class Function {
    private long id;
    private String pageName; //功能名
    private String pageFunction; //功能描述

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageFunction() {
        return pageFunction;
    }

    public void setPageFunction(String pageFunction) {
        this.pageFunction = pageFunction;
    }

    public Function() {
    }

    public Function(long id, String pageName, String pageFunction) {
        this.id = id;
        this.pageName = pageName;
        this.pageFunction = pageFunction;
    }

    @Override
    public String toString() {
        return "Function{" +
                "id=" + id +
                ", pageName='" + pageName + '\'' +
                ", pageFunction='" + pageFunction + '\'' +
                '}';
    }
}
