package com.example.blog.pojo;

/**
 * @author YZY
 * @date 2020/5/14 - 21:56
 */
public class admin {

    String username;
    String password;

    public admin() {
    }

    public admin(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
