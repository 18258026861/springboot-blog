package com.example.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author YZY
 * @date 2020/5/14 - 15:30
 */
@Controller
@RequestMapping("/admin")
public class adminController {

    @RequestMapping("/blogs")
    public String adminblogs(){
        return "admin/blogs";
    }

    @RequestMapping("/input")
    public String input(){
        return "admin/blogs-input";
    }
    @RequestMapping("/logout")
    public String logput(HttpSession session){
        session.removeAttribute("admin");
        return "index";
    }
    @RequestMapping("/info")
    public String info(){
        return "admin/info";
    }
    @RequestMapping("/types")
    public String types(){
        return "admin/types";
    }
    @RequestMapping("/tags")
    public String tags(){
        return "admin/tags";
    }
}
