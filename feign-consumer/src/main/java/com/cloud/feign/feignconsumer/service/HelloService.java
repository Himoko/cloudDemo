package com.cloud.feign.feignconsumer.service;

import com.cloud.feign.feignconsumer.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @description: hello
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-10-26 14:39
 */
@Service
public class HelloService {
    @Autowired
    GetHello getHello;

    public String sayHello() {
        return getHello.sayHello();
    }
}
