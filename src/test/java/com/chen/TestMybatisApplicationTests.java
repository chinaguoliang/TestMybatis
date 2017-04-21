package com.chen;

import com.chen.mapper.UserInfoMapper;
import com.chen.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatisApplicationTests {
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Test
	public void contextLoads() {
		UserInfo ui = userInfoMapper.selectByPrimaryKey(10);
		System.out.println("------------------>" + ui.getId());
	}
}
