package com.example.blog.config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

/**
 * @author YZY
 * @date 2020/5/14 - 21:24
 */
public class Realm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String username = "y";
        String password = "1";

//          token是连接controller和realm的桥梁，通过token得到controller传过来的账号密码
        UsernamePasswordToken token1 = (UsernamePasswordToken) token;
//          读取账号密码进行比较
        if(!token1.getUsername().equals(username)){
            return null;
        }
        return new SimpleAuthenticationInfo("",password,"");
    }
}
