package com.chen.controller;

import com.chen.dao.UserInfoMapper;
import com.chen.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chen on 17/4/12.
 */
@Controller
public class UserInfoController {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public UserInfo getUserInfo() {
        UserInfo userList = userInfoMapper.selectByPrimaryKey(new Integer(10));

        return userList;
    }
}
