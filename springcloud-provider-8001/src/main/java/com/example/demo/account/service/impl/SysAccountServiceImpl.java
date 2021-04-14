package com.example.demo.account.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.account.dao.SysAccountMapper;
import com.example.demo.account.service.ISysAccountService;
import entity.SysAccount;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统账号表 服务实现类
 * </p>
 *
 * @author zhangyong
 * @since 2021-04-14
 */
@Service
public class SysAccountServiceImpl extends ServiceImpl<SysAccountMapper, SysAccount> implements ISysAccountService {

}
