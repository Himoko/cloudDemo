package com.cloud.ribbon.ribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @description: hello
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-10-26 14:39
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHello() {
        return restTemplate.getForObject("http://ribbon/hello?name=zhangpeng",String.class);
    }
}
