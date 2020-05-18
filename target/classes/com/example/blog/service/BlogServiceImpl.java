package com.example.blog.service;

import com.example.blog.dao.BlogMapper;
import com.example.blog.pojo.Blog;
import com.example.blog.pojo.SearchBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YZY
 * @date 2020/5/17 - 18:55
 */
@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    BlogMapper blogMapper;

    @Override
    public List<Blog> queryBlogByName(SearchBlog blog) {
        List<Blog> blogs = blogMapper.queryBlogByName(blog);
        return blogs;
    }

    @Override
    public List<Blog> queryBlogs() {
        return blogMapper.queryBlogs();
    }

    @Override
    public Blog quertBlogById(Long id) {
        return blogMapper.quertBlogById(id);
    }

    @Override
    public int addBlog(Blog blog) {
        return blogMapper.addBlog(blog);
    }

    @Override
    public int deleteBlog(Long id) {
        return blogMapper.deleteBlog(id);
    }

    @Override
    public int updateBlog(Blog blog) {
        return blogMapper.updateBlog(blog);
    }
}
