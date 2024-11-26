package com.example.booksmanagementsystem.mapper;


import com.example.booksmanagementsystem.model.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    @Select("select * from userinfo")
    List<UserInfo> selectAll();

    @Select("select * from userinfo where id = #{userid}")
    UserInfo selectById(@Param("userid") Integer id);

    @Insert("insert into userinfo (username, password, age, gender, phone) values" +
            " (#{username},#{password},#{age},#{gender},#{phone})")
    void insert(UserInfo userInfo);
}
