package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chen on 17/4/7.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/attendance/getLocation")
    @ResponseBody
    public String getHelloworld() {
        return "helloworld haha chen";
    }

}
