package com.example.blog.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-05-13 22:11:30
 */
public class User implements Serializable {
    private static final long serialVersionUID = 253832520133449392L;

    private Integer id;

    private String username;

    private String password;

    private String perms;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

}
