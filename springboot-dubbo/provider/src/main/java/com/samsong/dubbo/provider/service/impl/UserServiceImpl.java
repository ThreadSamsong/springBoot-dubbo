package com.samsong.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = com.samsong.dubbo.api.service.UserService.class)
public class UserServiceImpl implements com.samsong.dubbo.api.service.UserService {

    @Override
    public String sayHello(String name) {
        return "hello word"+name;
    }
}
