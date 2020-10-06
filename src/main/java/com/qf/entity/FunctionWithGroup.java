package com.qf.entity;

/**
 * @ProjectName: logistics
 * @Author: Jsx
 * @Time: 2020/10/6 10:25
 * @Description: 功能用户组实体类
 */
public class FunctionWithGroup {

    private long id;  //功能用户组ID
    private long functionId; //功能ID
    private long groupId; //所属组ID

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(long functionId) {
        this.functionId = functionId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public FunctionWithGroup() {
    }

    public FunctionWithGroup(long id, long functionId, long groupId) {
        this.id = id;
        this.functionId = functionId;
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "FunctionWithGroup{" +
                "id=" + id +
                ", functionId=" + functionId +
                ", groupId=" + groupId +
                '}';
    }
}
