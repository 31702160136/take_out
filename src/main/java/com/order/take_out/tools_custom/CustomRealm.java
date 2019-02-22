package com.order.take_out.tools_custom;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-02-22 17:40
 **/
public class CustomRealm extends AuthorizingRealm {
    Map<String,String> userMap=new HashMap<>(16);

    {
        userMap.put("Mark","123");
        super.setName("customRealm");
    }
    /**
     * 授权处理
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String userName= (String) principals.getPrimaryPrincipal();
        //模拟数据库获取角色
        Set<String> roles=getRoleByUserName(userName);
        //模拟数据库获取权限
        Set<String> permissions=getPermissionsByUserName(userName);
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(roles);
        authorizationInfo.setStringPermissions(permissions);
        return authorizationInfo;
    }

    private Set<String> getPermissionsByUserName(String userName) {
        Set<String> sets=new HashSet<>();
        sets.add("user:select");
        sets.add("user:update");
        return sets;
    }

    private Set<String> getRoleByUserName(String userName) {
        Set<String> sets=new HashSet<>();
        sets.add("admin");
        sets.add("user");
        return sets;
    }

    /**
     * 认证处理
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1.从主体传过来的认证信息中，获取用户名
        String username= (String) token.getPrincipal();

        //2.通过用户名到数据库中获取凭证

        String password=getPasswordByUserName(username);
        if (password == null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo
                (username,password,"customRealm");
        return authenticationInfo;
    }

    /**
     * 模拟数据库查询
     * @param username
     * @return
     */
    private String getPasswordByUserName(String username) {
        return userMap.get(username);
    }
}
