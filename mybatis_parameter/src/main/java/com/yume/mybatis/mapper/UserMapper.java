package com.yume.mybatis.mapper;

import com.yume.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {

   /**
    * 通过用户名查询用户信息
    * @param username
    * @return
    */
   User getUserinfoByName(String username);

   /**
    * 登录
    */
   User login(String username, String password);

   /**
    * 通过map登录
    */
   User loginByMap(Map<String, Object> map);

   /**
    * 添加用户
    */
   int insertUser(User user);

   /**
    * 通过param登录
    */
   User loginByParam(@Param("username") String username, @Param("password") String password);
}
