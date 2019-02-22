package com.order.take_out;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.realm.text.IniRealm;
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
 * @create: 2019-02-21 17:52
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class IniRealmTest {

    @Test
    public void testAuthentication(){

        IniRealm iniRealm=new IniRealm("classpath:user.ini");

        //1.构建SecurityManager环境
        DefaultSecurityManager manager=new DefaultSecurityManager();
        manager.setRealm(iniRealm);
        //2.主体提交认证请求
        SecurityUtils.setSecurityManager(manager);
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("Mark","123");
        subject.login(token);
        System.out.println("是否认证："+subject.isAuthenticated());
        subject.checkRole("admin");
        subject.checkPermission("user:delete");
        subject.checkPermission("user:update");
    }
}
