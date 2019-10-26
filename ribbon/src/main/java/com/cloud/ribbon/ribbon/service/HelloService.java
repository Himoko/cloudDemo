package com.cloud.ribbon.ribbon.service;

import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @description: hello
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-10-26 14:39
 */
@Service
public class HelloService {
    public String sayHello() {
        return "hello world";
    }
}
