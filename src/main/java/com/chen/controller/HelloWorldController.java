package com.chen.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chen on 17/4/7.
 */
@Api(value = "测试文档",description="测试文档是否能生成")
@Controller
public class HelloWorldController {
    @ApiOperation(value="测试Swagger2", notes=" name 32 位数")
    @RequestMapping("/attendance/getLocation")
    @ResponseBody
    public String getHelloworld() {
        return "helloworld haha chen";
    }


    @ApiOperation(value="获取用户数据", notes="获取所有登录用户到数据")
    @RequestMapping("/ok")
    @ResponseBody
    public String getHelloworld2() {
        return "ok";
    }

}
