package com.example.blog;

import com.example.blog.pojo.Type;
import com.example.blog.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    TypeService typeService;

    @Test
    void contextLoads() {
    }

}
