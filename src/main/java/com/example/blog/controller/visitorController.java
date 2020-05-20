package com.example.blog.controller;


import com.example.blog.pojo.Blog;
import com.example.blog.pojo.SearchBlog;
import com.example.blog.service.BlogService;
import com.example.blog.service.TypeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author YZY
 * @date 2020/5/13 - 21:49
 */
@Controller
public class visitorController {

    @Autowired
    BlogService blogService;
    @Autowired
    TypeService typeService;

    @RequestMapping("/")
    public String index(Model model){
        List<Blog> blogsort = blogService.queryBlogs();
        model.addAttribute("blogs",blogService.queryBlogs());
        model.addAttribute("types",typeService.queryTypes());
        return "index";
    }
    @RequestMapping("/blog")
    public String blog(Long id,Model model){
        model.addAttribute("blog",blogService.markToHTML(id));
        return "blog";
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
    public String types(Model model){
        model.addAttribute("types",typeService.queryTypes());
        model.addAttribute("blogs",blogService.queryBlogs());
        return "types";
    }

    @RequestMapping("/queryblogsbytype")
    public String queryblogsbytype(Long id,Model model){
        model.addAttribute("blogs",typeService.queryBlogsByType(id));
        model.addAttribute("types",typeService.queryTypes());
        return "types";
    }

    @RequestMapping("/search")
    public String search(@RequestParam(value = "search",required = false) String search, Model model){
        model.addAttribute("types",typeService.queryTypes());
        model.addAttribute("blogs",blogService.queryBlogTitleOrContentBysearch(search));
        model.addAttribute("search",search);
        return "index";
    }






}
