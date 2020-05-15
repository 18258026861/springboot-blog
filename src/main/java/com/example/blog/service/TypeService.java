package com.example.blog.service;

import com.example.blog.pojo.Type;

import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 17:16
 */
public interface TypeService {

    int addType(String name);

    int updateType(Type type);

    int deleteType(String name);

    List<Type> queryTypes();

    Type queryType(Long id);
}
