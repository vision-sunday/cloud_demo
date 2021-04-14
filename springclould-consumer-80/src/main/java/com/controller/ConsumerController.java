package com.controller;

import entity.SysAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController//配置了restController才生效，不会404
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;//提供简单的restful模板

    private static final String PROVIDER8001 = "http://localhost:8001/";

    @GetMapping("account")
    private SysAccount accountById(){
        return restTemplate.getForObject(PROVIDER8001+"springcloud_api/sys-account/account", SysAccount.class);
    }

}
