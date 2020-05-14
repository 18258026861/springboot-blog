package com.example.blog.dao;

import com.example.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-13 22:11:31
 */
@Mapper
@Repository
public interface UserDao {


    User queryByUsername(String username);

    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    List<User> queryAll();


    int insert(User user);


    int update(User user);

    int deleteById(Integer id);

}
