package com.dubbo.consumer.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.HiApi;
import org.springframework.stereotype.Component;

@Service
@Component
public class HiApiImpl implements HiApi {
    @Override
    public String sayHi(String name) {
        return "Hi, " + name;
    }
}
