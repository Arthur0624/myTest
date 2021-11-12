package com.lyc.dao;

import com.lyc.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userDao {

    @Select("select * from student")
    List<user> getAll();

    @Select("select * from student where id =#{id}")
    user getById(Integer id);

}
