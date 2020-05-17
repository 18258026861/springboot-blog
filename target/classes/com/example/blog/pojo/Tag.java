package com.example.blog.pojo;

import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 9:27
 */
public class Tag {
    private String name;
    private List<Blog> blogs;

    public Tag() {
    }

    public Tag(String name, List<Blog> blogs) {
        this.name = name;
        this.blogs = blogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                ", blogs=" + blogs +
                '}';
    }
}
