package com.example.blog.controller;

import com.example.blog.pojo.Blog;
import com.example.blog.pojo.SearchBlog;
import com.example.blog.service.BlogService;
import com.example.blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author YZY
 * @date 2020/5/17 - 20:42
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;
    @Autowired
    TypeService typeService;

    @RequestMapping("/add")
    public String add(@RequestParam(value = "title")String title,
    @RequestParam(value = "firstPicture",required = false)String firstPicture,
    @RequestParam(value = "pblished",required = false)boolean pblished,
    @RequestParam(value = "typeId",required = false)Long typeId,
    @RequestParam(value = "content",required = false)String content,
                      HttpSession session){
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setContent(content);
        blog.setTypeId(typeId);
        blog.setCreateTime(new Date());
        blog.setFirstPicture(firstPicture);
        blog.setPblished(pblished);
        int i = blogService.addBlog(blog);
        if(i>0){
            session.setAttribute("bloginfo","添加成功");
        }else
            session.setAttribute("bloginfo","添加失败");
        return "redirect:/admin/blogs";
    }

    @RequestMapping("/update")
    public String update(Blog blog,HttpSession session){
        int i = blogService.updateBlog(blog);
        if(i>0){
            session.setAttribute("bloginfo","修改成功");
        }else
            session.setAttribute("bloginfo","修改失败");
        return "redirect:/admin/blogs";
    }

    @RequestMapping("/delete")
    public String delete(Long id,HttpSession session){
        int i = blogService.deleteBlog(id);
        if(i>0){
            session.setAttribute("bloginfo","删除成功");
        }else
            session.setAttribute("bloginfo","删除失败");
        return "redirect:/admin/blogs";
    }
    @RequestMapping("/query")
//                      required可以为空
    public String query(@RequestParam(value = "title",required = false)String title,@RequestParam(value = "typeId",required = false)Long typeId, Model model){
        SearchBlog blog = new SearchBlog(title,typeId);
        model.addAttribute("types",typeService.queryTypes());
        model.addAttribute("blogs",blogService.queryBlogByName(blog));
        return "admin/blogs";
    }


}
