package com.example.blog.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YZY
 * @date 2020/5/13 - 21:49
 */
@Controller
public class visitorController {


    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/blog")
    public String blog(){
        return "blog";
    }
    @RequestMapping("/tags")
    public String tags(){
        return "tags";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/archives")
    public String archives(){
        return "archives";
    }
    @RequestMapping("/types")
    public String types(){
        return "types";
    }





}
