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
    public String add(String title,boolean pblished,Long typeId,String content,String description,
    @RequestParam(value = "firstPicture",required = false)String firstPicture,
                      Model model){

        Blog blog1 = blogService.queryBlogByName(title);
        if(blog1==null){
            Blog blog = new Blog();
            blog.setTitle(title);
            blog.setContent(content);
            blog.setTypeId(typeId);
            blog.setCreateTime(new Date());
            blog.setUpdateTime(new Date());
            blog.setFirstPicture(firstPicture);
            blog.setPblished(pblished);
            blog.setViews(0);
            blog.setDescription(description);
            int i = blogService.addBlog(blog);
            if(i>0){
                model.addAttribute("blogInfo","添加成功");
            }else
                model.addAttribute("blogInfo","添加失败");
            model.addAttribute("blogs",blogService.queryBlogs());
            model.addAttribute("types",typeService.queryTypes());
        }else
            model.addAttribute("blogInfo","该标题已存在");
        return "admin/blogs";
    }

    @RequestMapping("/update")
    public String update(Long id, String title,boolean pblished, Long typeId, String content,String description,
                      @RequestParam(value = "firstPicture",required = false)String firstPicture,
                      Model model){
        Blog blog = new Blog();
        blog.setId(id);
        blog.setTitle(title);
        blog.setContent(content);
        blog.setTypeId(typeId);
        blog.setUpdateTime(new Date());
        blog.setFirstPicture(firstPicture);
        blog.setPblished(pblished);
        blog.setDescription(description);
        int i = blogService.updateBlog(blog);
        if(i>0){
            model.addAttribute("bloginfo","修改成功");
        }else
            model.addAttribute("bloginfo","修改失败");
        model.addAttribute("blogs",blogService.queryBlogs());
        model.addAttribute("types",typeService.queryTypes());
        return "admin/blogs";
    }

    @RequestMapping("/query")
    public String query(@RequestParam(value = "title",required = false)String title,
                        @RequestParam(value = "typeId",required = false)Long typeId,
                        Model model){
        SearchBlog blog = new SearchBlog(title,typeId);
        model.addAttribute("types",typeService.queryTypes());
        model.addAttribute("blogs",blogService.queryBlogByTitleAndType(blog));
        return "admin/blogs";
    }

    @RequestMapping("/delete")
    public String delete(Long id,Model model){
        int i = blogService.deleteBlog(id);
        if(i>0){
            model.addAttribute("bloginfo","删除成功");
        }else
            model.addAttribute("bloginfo","删除失败");
        model.addAttribute("blogs",blogService.queryBlogs());
        model.addAttribute("types",typeService.queryTypes());
        return "admin/blogs";
    }


}
