package com.example.blog.dao;

import com.example.blog.pojo.Blog;
import com.example.blog.pojo.SearchBlog;
import com.example.blog.pojo.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author YZY
 * @date 2020/5/17 - 18:56
 */
@Mapper
@Repository
public interface BlogMapper {

    List<Blog> queryBlogByName(SearchBlog blog);

    List<Blog> queryBlogs();

    Blog quertBlogById(Long id);

    int addBlog(Blog blog);

    int deleteBlog(Long id);

    int updateBlog(Blog blog);


}