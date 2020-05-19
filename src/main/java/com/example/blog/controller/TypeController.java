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
    public String add(String type,Model model){
        Type type1 = typeService.queryTypeByName(type);
        if(type1==null){
            typeService.addType(type);
            model.addAttribute("typeInfo","添加成功");
        }else
            model.addAttribute("typeInfo","该分类已存在，添加失败");
        model.addAttribute("types",typeService.queryTypes());
        return "admin/types";
    }
    @RequestMapping("/delete")
    public String delete(String name,Model model){
        int i = typeService.deleteType(name);
        if (i>0){
            model.addAttribute("typeInfo","删除成功");
        }else{
            model.addAttribute("typeInfo","删除失败");
        }
        model.addAttribute("types",typeService.queryTypes());
        return "admin/types";
    }
    @RequestMapping("/update")
    public String update(Type type,Model model){
        int i = typeService.updateType(type);
        if (i>0){
            model.addAttribute("typeInfo","修改成功");
        }else{
            model.addAttribute("typeInfo","修改失败");
        }
        model.addAttribute("types",typeService.queryTypes());
        return "admin/types";
    }
//          ajax
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
