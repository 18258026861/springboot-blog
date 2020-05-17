package com.example.blog.pojo;

import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 10:07
 */
public class Type {

    private Long id;
    private String name;


    public Type() {
    }


    public Type(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
