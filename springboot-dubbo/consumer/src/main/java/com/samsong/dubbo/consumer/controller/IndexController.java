package com.samsong.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @Reference
    private com.samsong.dubbo.api.service.UserService userService;

    @ApiOperation(value = "dubbo获取用户",notes = "用户信息" )
    @RequestMapping(value = "say",method = RequestMethod.POST)
    @ResponseBody
    public String getUser(String name) {
        return userService.sayHello(name);
    }
}
