package com.example.blog.service;

import com.example.blog.dao.TypeMaaper;
import com.example.blog.pojo.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 17:16
 */
@Service
public class TypeServiceImpl implements TypeService{

    @Autowired
    TypeMaaper typeMaaper;

    @Override
    public int addType(String name) {
        return typeMaaper.addType(name);
    }

    @Override
    public int updateType(Type type) {
        return typeMaaper.updateType(type);
    }

    @Override
    public int deleteType(String name) {
        return typeMaaper.deleteType(name);
    }

    @Override
    public List<Type> queryTypes() {
        return typeMaaper.queryTypes();
    }

    @Override
    public Type queryType(Long id) {
        return typeMaaper.queryType(id);
    }
}
