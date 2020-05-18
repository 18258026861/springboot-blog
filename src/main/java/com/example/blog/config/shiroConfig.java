package com.example.blog.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @author YZY
 * @date 2020/5/14 - 21:25
 */
@Configuration
public class shiroConfig {
    @Bean
    public Realm realm(){
        return new Realm();
    }

    @Bean
    public DefaultWebSecurityManager manager(){
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(realm());
        return manager;
    }


    @Bean
    public ShiroFilterFactoryBean bean(DefaultWebSecurityManager manager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();

        HashMap<String,String> map = new HashMap<>();
//        这边的拦截路径不能设置/admim/*，会拦截掉登录请求
        map.put("/admin/blogs","authc");
        map.put("/admin/input","authc");
        map.put("/admin/info","authc");
        map.put("/admin/types","authc");
        map.put("/admin/tags","authc");
        map.put("/admin/type-edit","authc");
//        map.put("/admin/blog-input","authc");



        map.put("/type/*","authc");
//      设置过滤路径
        bean.setFilterChainDefinitionMap(map);
//        将当前用户纳入安全管理
        bean.setSecurityManager(manager);
//      设置登录页面路径
        bean.setLoginUrl("/admin/tologin");
//        bean.setSuccessUrl("/admin/");
        return bean;
    }




}
