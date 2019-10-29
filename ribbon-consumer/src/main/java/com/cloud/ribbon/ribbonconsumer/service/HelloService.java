package com.cloud.ribbon.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    //请求熔断注解，当服务出现问题的时候，会执行fallbackMethod属性名为helloFallBack的方法
    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String sayHello() {
        return restTemplate.getForObject("http://ribbon/hello?name=zhangpeng",String.class);
    }

    public String helloFallBack() {
        return "error";
    }
}
