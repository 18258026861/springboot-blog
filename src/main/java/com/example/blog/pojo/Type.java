package com.example.blog.pojo;

import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 10:07
 */
public class Type {

    private Long id;
    private String name;

    private List<Blog> blogs;

    public Type() {
    }

    public Type(String name, List<Blog> blogs) {
        this.name = name;
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                ", blogs=" + blogs +
                '}';
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
}
