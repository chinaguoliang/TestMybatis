package com.chen.model;

import java.util.List;

/**
 * Created by chen on 2017/4/21.
 */
public class BaseEntity {
    int resultCode = 0;
    String errorMsg;
    int AllPageSize;
    Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public int getAllPageSize() {
        return AllPageSize;
    }

    public void setAllPageSize(int allPageSize) {
        AllPageSize = allPageSize;
    }

    List<UserInfo> userList;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<UserInfo> getUserList() {
        return userList;
    }

    public void setUserList(List<UserInfo> userList) {
        this.userList = userList;
    }
}
