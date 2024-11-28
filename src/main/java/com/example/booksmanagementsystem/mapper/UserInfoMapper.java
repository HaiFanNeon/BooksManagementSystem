package com.example.booksmanagementsystem.mapper;


import com.example.booksmanagementsystem.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    @Select("select id, username, age, gender, phone, delete_flag, create_time, update_time " +
            "from userinfo where username like concat('%', #{key}, '%')")
    List<UserInfo> queryAllUserByLike(String key);

    @Select("select * from userinfo order by id ${sort} ")
    List<UserInfo> selectAll(String sort);

    @Select("select username, `password`, age, gender, phone from userinfo where username= '${name}' ")
    List<UserInfo> queryByName(String name);

//    @Select("select * from userinfo")
//    List<UserInfo> selectAll();

    @Select("select * from userinfo where id = ${userid}")
    UserInfo selectById(@Param("userid") Integer id);



    Integer insert(UserInfo userInfo);

    void delete(Integer id);

    void update(UserInfo userInfo);
}
