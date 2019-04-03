package com.samsong.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = main.java.com.samsong.dubbo.api.service.UserService.class)
public class UserServiceImpl implements main.java.com.samsong.dubbo.api.service.UserService {

    @Override
    public String sayHello(String name) {
        return "hello word"+name;
    }
}
