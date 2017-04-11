package com.chen.dao;

import com.chen.model.UserInfo;
import com.chen.util.MyMapper;

public interface UserInfoMapper extends MyMapper<UserInfo>{
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}