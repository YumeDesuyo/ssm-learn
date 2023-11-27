package com.yume.mybatis.test;

import com.yume.mybatis.mapper.SelectMapper;
import com.yume.mybatis.pojo.User;
import com.yume.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {

   @Test
   public void closeSqlSession() {

   }

   @Test
   public void selectUserByIdTest() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
      User user = mapper.selectUsrById(1);
      sqlSession.close();
      System.out.println(user);
   }

   @Test
   public void selectAllUserTest() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
      List<User> users = mapper.selectAllUser();
      sqlSession.close();
      users.forEach(System.out::println);
   }

   @Test
   public void selectCountTest() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
      Integer count = mapper.selectCount();
      sqlSession.close();
      System.out.println(count);
   }

   @Test
   public void selectUserByIdToMapTest() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
      Map map = mapper.selectUserByIdToMap(1);
      sqlSession.close();
      System.out.println(map);
   }

   @Test
   public void selectAllUserToMapTest() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
      List<User> list = mapper.selectAllUser();
      sqlSession.close();
      System.out.println(list);
   }

}
