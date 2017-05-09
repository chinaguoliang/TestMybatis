package com.chen.controller;

import com.chen.mapper.UserInfoMapper;
import com.chen.model.BaseEntity;
import com.chen.model.UserInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
        UserInfo userList = userInfoMapper.selectByPrimaryKey(10);
        return userList;
    }


    @RequestMapping("/getAllUser")
    @ResponseBody
    public BaseEntity getAllUser() {
        int onePageNum = 20;

        PageHelper.startPage(1, onePageNum);
        List<UserInfo> userList = userInfoMapper.selectAll();
        BaseEntity be = new BaseEntity();
        be.setUserList(userList);
        be.setResultCode(0);
        be.setAllPageSize(getCount() / onePageNum);
        be.setErrorMsg("获取数据成功");
        return be;
    }

    private int getCount() {
        return userInfoMapper.selectCount();
    }

    @RequestMapping("/delUserInfo")
    @ResponseBody
    public String delUserInfo() {
        userInfoMapper.deleteByPrimaryKey(10);

        return "success";
    }





    @RequestMapping("/addUserInfo")
    @ResponseBody
    public String addUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setLatitude("56");
        userInfo.setLongitude("968");
        userInfo.setSchoolId((int)(Math.random() * 10000));
        int result = userInfoMapper.insertSelective(userInfo);
        if (result > 0) {
            return "success";
        } else {
            return "failed";
        }

    }

}
