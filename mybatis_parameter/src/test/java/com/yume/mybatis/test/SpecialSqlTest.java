package com.yume.mybatis.test;

import com.yume.mybatis.mapper.SpecialSqlMapper;
import com.yume.mybatis.pojo.User;
import com.yume.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SpecialSqlTest {

   @Test
   public void selectUserByLike() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
      List<User> list;
      list = mapper.selectUserByLike("y");
      sqlSession.close();
//      list.forEach(System.out::println);
      System.out.println(list);
   }

   @Test
   public void deleteMoreUserById() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
      int result = mapper.deleteMoreUserByIds("8, 11");
      sqlSession.close();
      System.out.println("删除数量为" + result);
   }

   @Test
   public void selectUsers() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
      List<User> users = mapper.selectUsers("t_user");
      sqlSession.close();
      System.out.println(users);
   }

   @Test
   public void selectUser() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
      User user = mapper.selectUser("t_user", "yume");
      sqlSession.close();
      System.out.println(user);
   }

   @Test
   public void insertUser() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
      User user = new User(null, "小明", "123424", 32, "男", "1@q.qew");
      int i = mapper.insertUser(user);
      System.out.println(i);
      System.out.println(user);
   }
}
