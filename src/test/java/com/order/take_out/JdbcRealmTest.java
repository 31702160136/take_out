package com.order.take_out;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-02-22 16:34
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class JdbcRealmTest {
    @Autowired
    DataSource dataSource;
    @Test
    public void testAuthentication(){

        JdbcRealm jdbcRealm=new JdbcRealm();
        jdbcRealm.setDataSource(dataSource);
        jdbcRealm.setPermissionsLookupEnabled(true);
        String sql="select p.password as password from users u,pass p where u.username=? and u.key=p.key";
        jdbcRealm.setAuthenticationQuery(sql);

        //1.构建SecurityManager环境
        DefaultSecurityManager manager=new DefaultSecurityManager();
        manager.setRealm(jdbcRealm);
        //2.主体提交认证请求
        SecurityUtils.setSecurityManager(manager);
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("Mark","123");
        subject.login(token);
        System.out.println("是否认证："+subject.isAuthenticated());
        subject.checkRoles("admin","user");
        subject.checkPermission("user:select");
    }
}
