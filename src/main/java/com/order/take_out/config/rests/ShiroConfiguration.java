package com.order.take_out.config.rests;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: take_out
 * @description: 权限管理配置
 * @author: Mr.Yang
 * @create: 2019-02-24 00:04
 **/
@Configuration
public class ShiroConfiguration {

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean factoryBean=new ShiroFilterFactoryBean();
        //设置权限环境
        factoryBean.setSecurityManager(securityManager);
        return factoryBean;
    }
}
