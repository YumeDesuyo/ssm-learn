package com.yume.mybatis.mapper;

import com.yume.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSqlMapper {

   /**
    * 通过用户名模糊查询
    *
    * @param username
    * @return
    */
   List<User> selectUserByLike(@Param("Like") String username);

   /**
    * 通过id批量删除用户
    *
    * @param ids
    * @return
    */
   int deleteMoreUserByIds(@Param("ids") String ids);

   /**
    * 查询某个表中的用户
    *
    * @param tableName
    * @return
    */
   List<User> selectUsers(@Param("tableName") String tableName);

   /**
    * 查询某个表中的某个用户
    * @param tableName
    * @param userName
    * @return
    */
   User selectUser(@Param("tableName") String tableName, @Param("userName") String userName);

   /**
    * 添加用户
    * @param user
    * @return
    */
   int insertUser(User user);
}
