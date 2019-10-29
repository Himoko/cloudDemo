package com.cloud.ribbon.ribbonconsumer.controller;

import com.cloud.ribbon.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;

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
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String sayHello(String name) throws ExecutionException, InterruptedException {
        return helloService.sayHello() + " " + name;
    }

    @RequestMapping("/hello1")
    public String sayHello1(String name) throws ExecutionException, InterruptedException {
        HelloServiceCommand helloServiceCommand = new HelloServiceCommand("hello",restTemplate);
        String result = helloServiceCommand.execute();
        return result;
    }
}
