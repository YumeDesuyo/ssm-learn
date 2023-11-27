package com.yume.mybatis.test;

import com.yume.mybatis.mapper.UserMapper;
import com.yume.mybatis.pojo.User;
import com.yume.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ParameterTest {

   @Test
   public void testGetUserByName() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      User user = mapper.getUserinfoByName("yume");
      sqlSession.close();
      System.out.println("查询结果为：" + user);
   }

   @Test
   public void testLogin() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      User user = mapper.login("yume", "66226");
      sqlSession.close();
      System.out.println(user);
   }

   @Test
   public void testLoginByMap() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      Map<String, Object> map = new HashMap<>();
      map.put("username", "yume");
      map.put("password", "666");
      User user = mapper.loginByMap(map);
      sqlSession.close();
      System.out.println(user);
   }

   @Test
   public void testInsertUser() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      User user = new User(null, "精精爆", "1234", 21, "男", "1@we.c");
      int result = mapper.insertUser(user);
      sqlSession.close();
      System.out.println(result);
   }

   @Test
   public void testLoginByParam() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      User user = mapper.login("yume", "666");
      sqlSession.close();
      System.out.println(user);
   }
}
