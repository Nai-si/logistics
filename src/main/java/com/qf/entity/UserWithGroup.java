package com.qf.entity;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 10:30
 * @Description: 用户与组连接表实体类
 */
public class UserWithGroup {

    private long id;
    private long groupId;   //组ID
    private String userId;  //用户ID

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserWithGroup() {
    }

    public UserWithGroup(long id, long groupId, String userId) {
        this.id = id;
        this.groupId = groupId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserWithGroup{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", userId='" + userId + '\'' +
                '}';
    }
}
