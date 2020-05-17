package com.example.blog.dao;

import com.example.blog.pojo.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 14:54
 */
@Mapper
@Repository
public interface TypeMaaper {

    int addType(String name);

    int updateType(Type type);

    int deleteType(String name);

    List<Type> queryTypes();

    Type queryTypeByName(String name);

    Type queryTypeById(Long id);
}
