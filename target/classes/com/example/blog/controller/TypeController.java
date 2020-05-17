package com.example.blog.controller;

import com.example.blog.pojo.Type;
import com.example.blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 17:22
 */
@Controller
@RequestMapping("/type")
public class TypeController {

    @Autowired
    TypeService typeService;

    @RequestMapping("/add")
    public String add(String type,HttpSession session){
        Type type1 = typeService.queryTypeByName(type);
        if(type1==null){
            typeService.addType(type);
            session.setAttribute("info","添加成功");
        }
        return "redirect:/admin/types";
    }
    @RequestMapping("/delete")
    public String delete(String name,HttpSession session){
        int i = typeService.deleteType(name);
        if(i>0){
            session.setAttribute("info","删除成功");
        }else
            session.setAttribute("info","删除失败");
        return "redirect:/admin/types";
    }
    @RequestMapping("/update")
    public String update(Type type,HttpSession session){
        int i = typeService.updateType(type);
        if (i>0){
            session.setAttribute("info","修改成功");
        }else{
            session.setAttribute("info","修改失败");
        }
        return "redirect:/admin/types";
    }

    @RequestMapping("/typeExist")
    @ResponseBody
    public String username(String type){
        String info = "";
        Type type1 = typeService.queryTypeByName(type);
        if(type1 != null){
            info="该分类已存在";
        }
        return info;
    }
}
