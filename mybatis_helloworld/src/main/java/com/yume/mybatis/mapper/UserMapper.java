package com.yume.mybatis.mapper;

import com.yume.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

   /**
    * 添加用户
    *
    * @return
    */
   int insertUser();

   /**
    * 修改数据
    *
    * @return
    */
   int updateUser();

   /**
    * 删除用户
    */
   int deleteUser();

   /**
    * 通过id查询用户
    */
   User selectUserById();

   /**
    * 查询所有用户
    */
   List<User> selectAllUser();
}
