package com.example.booksmanagementsystem.mapper;


import com.example.booksmanagementsystem.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    List<UserInfo> selectAll();

    @Select("select * from userinfo where id = #{userid}")
    UserInfo selectById(@Param("userid") Integer id);



    Integer insert(UserInfo userInfo);

    void delete(Integer id);

    void update(UserInfo userInfo);
}
