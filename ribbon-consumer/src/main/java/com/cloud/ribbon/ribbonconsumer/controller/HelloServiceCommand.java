package com.cloud.ribbon.ribbonconsumer.controller;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixThreadPoolKey;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @description: 自定义熔断器command
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-10-29 09:49
 */
public class HelloServiceCommand extends HystrixCommand<String> {

    private RestTemplate restTemplate;

    protected HelloServiceCommand(String commandGroupKey, RestTemplate restTemplate) {
        super(HystrixCommandGroupKey.Factory.asKey(commandGroupKey));
        this.restTemplate = restTemplate;
    }

    @Override
    protected String run() throws Exception {
        return restTemplate.getForObject("http://ribbon/hello?name=zhangpeng",String.class);
    }

    @Override
    protected String getFallback() {
        return "error";
    }
}
