package com.example.booksmanagementsystem.mapper;


import com.example.booksmanagementsystem.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    @Select("select * from user_info where user_name = #{userName}")
    public UserInfo queryByName(@Param("userName") String userName);
}
