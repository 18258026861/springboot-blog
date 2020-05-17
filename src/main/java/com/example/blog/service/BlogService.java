package com.example.blog.service;

import com.example.blog.pojo.Blog;

/**
 * @author YZY
 * @date 2020/5/17 - 18:54
 */
public interface BlogService {

    Blog queryBlogByName(String name);

    Blog quertBlogById(Long id);

    int addBlog(Blog blog);

    int deleteBlog(Long id);

    int dupdateBlog(Blog blog);
}
