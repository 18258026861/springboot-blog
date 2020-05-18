package com.example.blog.service;

import com.example.blog.pojo.Blog;
import com.example.blog.pojo.SearchBlog;

import java.util.List;

/**
 * @author YZY
 * @date 2020/5/17 - 18:54
 */
public interface BlogService {

    List<Blog> queryBlogByName(SearchBlog blog);

    List<Blog> queryBlogs();

    Blog quertBlogById(Long id);

    int addBlog(Blog blog);

    int deleteBlog(Long id);

    int updateBlog(Blog blog);
}
