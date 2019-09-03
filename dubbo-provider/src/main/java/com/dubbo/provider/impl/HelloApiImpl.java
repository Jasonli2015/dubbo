package com.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.HelloApi;
import org.springframework.stereotype.Component;

@Service
@Component
public class HelloApiImpl implements HelloApi {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
