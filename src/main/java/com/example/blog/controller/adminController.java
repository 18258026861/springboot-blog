package com.example.blog.controller;

import com.example.blog.pojo.Type;
import com.example.blog.service.TypeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.omg.CORBA.UnknownUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author YZY
 * @date 2020/5/14 - 15:30
 */
@Controller
@RequestMapping("/admin")
public class adminController {

    @Autowired
    TypeService typeService;

    @RequestMapping("/tologin")
    public String tologin(){
        return "admin/login";
    }
    @RequestMapping("/login")
    public String login(String username,String password,Model model,HttpSession session){
        //        获取当前用户
        Subject subject = SecurityUtils.getSubject();
//          封装前端传来的信息
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            //        为当前用户登录该账号密码，这个方法会在realm中验证是否正确然后异常
            subject.login(token);
            session.setAttribute("admin",username);
            return "admin/blogs";
        }catch (UnknownAccountException e){
            model.addAttribute("msg","此账号不存在");
            return "admin/login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码错误");
            return "admin/login";
        }

    }

    @RequestMapping("/blogs")
    public String adminblogs(){
        return "admin/blogs";
    }

    @RequestMapping("/input")
    public String input(){
        return "admin/blogs-input";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("admin");
        return "index";
    }
    @RequestMapping("/info")
    public String info(){
        return "admin/info";
    }
    @RequestMapping("/types")
    public String types(Model model){
        List<Type> types = typeService.queryTypes();
        model.addAttribute("types",types);
        return "admin/types";
    }
    @RequestMapping("/tags")
    public String tags(){
        return "admin/tags";
    }

}
