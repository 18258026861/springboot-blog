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
    public List<Blog> queryBlogByTitleAndType(SearchBlog blog) {
        List<Blog> blogs = blogMapper.queryBlogByTitleAndType(blog);
        return blogs;
    }

    @Override
    public Blog queryBlogByName(String title) {
        return blogMapper.queryBlogByName(title);
    }

    @Override
    public List<Blog> queryBlogs() {
        return blogMapper.queryBlogs();
    }

    @Override
    public Blog queryBlogById(Long id) {
        return blogMapper.queryBlogById(id);
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
