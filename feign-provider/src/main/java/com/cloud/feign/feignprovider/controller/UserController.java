package com.cloud.feign.feignprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description: user
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-10-26 15:22
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    public String getUser() {
        return "himoko is comming!";
    }
}
