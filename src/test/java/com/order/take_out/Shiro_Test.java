package com.order.take_out;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-02-20 19:49
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class Shiro_Test {
    SimpleAccountRealm simpleAccountRealm=new SimpleAccountRealm();

    @Before
    public void addUser(){
        simpleAccountRealm.addAccount("Mark","123","admin","user");
    }
    @Test
    public void testAuthentication(){
        //1.构建SecurityManager环境
        DefaultSecurityManager manager=new DefaultSecurityManager();
        manager.setRealm(simpleAccountRealm);
        //2.主体提交认证请求
        SecurityUtils.setSecurityManager(manager);
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("Mark","123");
        subject.login(token);
        System.out.println("是否认证："+subject.isAuthenticated());
        subject.checkRoles("admin","user");
    }
}
