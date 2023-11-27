package com.yume.mybatis.mapper;

import com.yume.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
   /**
    * 通过id查询用户
    */
   User selectUsrById(@Param("id") int id);

   /**
    * 查询所有用户
    */
   List<User> selectAllUser();

   /**
    * 查询用户数量
    */
   Integer selectCount();

   /**
    * 查询一个用户信息为map集合
    * @param id
    * @return
    */
   Map selectUserByIdToMap(@Param("id") Integer id);

   /**
    * 查询所有用户为List<map>集合
    * @return
    */
   List<Map> selectAllUserToList();
}
