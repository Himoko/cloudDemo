package com.cloud.feign.feignconsumer.controller;

import com.cloud.feign.feignconsumer.rpc.GetUser;
import com.cloud.feign.feignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description: hello
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-10-26 14:29
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    GetUser getUser;

    @RequestMapping("/hello")
    public String sayHello(String name) {
        return helloService.sayHello() + " " + name;
    }

    @RequestMapping("/user")
    public String getUser() {
        return getUser.getUser();
    }
}
