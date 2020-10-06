package com.qf.entity;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 10:29
 * @Description: 用户所属组实体类
 */
public class UserGroup {

    private long id;
    private String description;   //描述
    private String groupName;     //组名

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public UserGroup() {
    }

    public UserGroup(long id, String description, String groupName) {
        this.id = id;
        this.description = description;
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
