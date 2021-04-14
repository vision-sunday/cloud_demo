package com.example.demo.account.controller;


import com.example.demo.account.service.ISysAccountService;
import entity.SysAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统账号表 前端控制器
 * </p>
 *
 * @author zhangyong
 * @since 2021-04-14
 */
@RestController
@RequestMapping("/springcloud_api/sys-account")
public class SysAccountController {

    @Autowired
    private ISysAccountService iSysAccountService;

    @GetMapping("account")
    public SysAccount selectOne(){
        return iSysAccountService.getById(1L);
    }

}
