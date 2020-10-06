package com.qf.entity;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 9:35
 * @Description: 用户表实体类
 */
public class User {

    private String loginId;//登录账号
    private String password;//登录密码
    private boolean ifOnline;//是否在线

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIfOnline() {
        return ifOnline;
    }

    public void setIfOnline(boolean ifOnline) {
        this.ifOnline = ifOnline;
    }

    public User() {
    }

    public User(String loginId, String password, boolean ifOnline) {
        this.loginId = loginId;
        this.password = password;
        this.ifOnline = ifOnline;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", ifOnline=" + ifOnline +
                '}';
    }
}
