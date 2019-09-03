package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.HelloApi;
import com.dubbo.api.HiApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    private HelloApi helloApi;

    // Reference 中 设置 check 为 false，是生产者成为消费者
    @Reference(check = false)
    private HiApi hiApi;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return helloApi.sayHello("Jay");
    }

    @RequestMapping("/sayHi")
    @ResponseBody
    public String sayHi(){
        return hiApi.sayHi("Joe");
    }
}
