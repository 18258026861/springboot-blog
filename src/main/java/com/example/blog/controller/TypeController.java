package com.example.blog.controller;

import com.example.blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

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
        int i = typeService.addType(type);
        if(i>0){
            model.addAttribute("msg","添加成功");
        }else{
            model.addAttribute("msg","添加失败");
        }
        return "redirect:/admin/types";
    }
}
