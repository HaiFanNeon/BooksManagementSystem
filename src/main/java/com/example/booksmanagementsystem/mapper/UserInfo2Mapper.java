package com.example.booksmanagementsystem.mapper;


import com.example.booksmanagementsystem.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfo2Mapper {

    public Integer insert(UserInfo userInfo);

    public List<UserInfo> select();

    public List<UserInfo> selectByCondition(@Param("username") String username,@Param("age") Integer age,@Param("gender") Integer gender);

    public Integer update(UserInfo userinfo);

    public Integer delete(@Param("ids") List<Integer> ids);
}
