package com.cloud.config.configclient.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description: 测试配置中心
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-10-28 15:09
 */
@RestController
//开启刷新配置
@RefreshScope
public class TestAPI {

    @Value("${myblog.name}")
    private String name;

    @Value("${myblog.url}")
    private String url;

    @Value("${myblog.location}")
    private String location;

    @RequestMapping("/blog-info")
    public String getBlogInfo() {
        return "从github仓库获取到我的博客信息：" + location + "," + name + "," + url;
    }
}
