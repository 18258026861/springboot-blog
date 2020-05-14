package com.example.blog.service;

import com.example.blog.entity.User;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.util.List;

public interface UserService {


    User queryByUsername(String username);

    List<User> queryAllByLimit(int offset, int limit);

    List<User> qusryAll();


    int insert(User user);


    int update(User user);


    int deleteById(Integer id);

}
