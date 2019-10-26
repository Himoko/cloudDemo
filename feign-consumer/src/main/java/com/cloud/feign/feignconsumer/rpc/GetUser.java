package com.cloud.feign.feignconsumer.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "feign-provider")
public interface GetUser {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser();
}
