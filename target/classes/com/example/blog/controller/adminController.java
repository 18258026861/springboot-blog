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
import org.springframework.web.bind.annotation.ResponseBody;

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

        /*登录模块*/
    @RequestMapping("/tologin")
    public String tologin(){
        return "admin/login";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("admin");
        return "redirect:/";
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
            return "redirect:/admin/blogs";
        }catch (UnknownAccountException e){
            model.addAttribute("msg","此账号不存在");
            return "admin/login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码错误");
            return "admin/login";
        }

    }

        /*验证模块*/
    @RequestMapping("/username")
    @ResponseBody
    public String username(String username){
        String info = "";
        if(username.length()==0){
            info="不能为空";
        }
        return info;
    }
    @RequestMapping("/password")
    @ResponseBody
    public String password(String password){
        String info = "";
        if(password.length()==0){
            info="不能为空";
        }
        return info;
    }
        /*跳转模块*/
    @RequestMapping("/blogs")
    public String adminblogs(){
        return "admin/blogs";
    }
    @RequestMapping("/input")
    public String input(){
        return "admin/blogs-input";
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
    @RequestMapping("/type-edit")
    public String typeedit(Long id,Model model){
        Type type = typeService.queryTypeById(id);
        model.addAttribute("type",type);
        return "admin/types-edit";
    }

}
