package com.yume.mybatis.test;

import com.yume.mybatis.mapper.UserMapper;
import com.yume.mybatis.pojo.User;
import com.yume.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

   @Test
   public void testInsert() {
      try {
         //获取核心配置文件的输入流
         InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
         //获取sqlSessionFactoryBuilder对象
         SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
         //获取SqlSessionFactory对象
         SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
         //获取sql的会话对象sqlSession(会自动提交事务)，是Mybatis提供的操纵数据库的对象
         SqlSession sqlSession = sqlSessionFactory.openSession(true);
         //获取UserMapper的代理实现类对象
         UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         //调用mapper中的方法，是按添加用户的功能
         int result = mapper.insertUser();
//         int result = sqlSession.insert("com.yume.mybatis.mapper.UserMapper.insertUser");
         System.out.println("结果是" + result);
         //提交事务
//         sqlSession.commit();
         //关闭sqlSession
         sqlSession.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   @Test
   public void testUpdate() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      int result = mapper.updateUser();
      sqlSession.close();
      System.out.println("修改结果为" + result);
   }

   @Test
   public void testDelete() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      int result = mapper.deleteUser();
      sqlSession.close();
      System.out.println("删除结果为" + result);
   }

   @Test
   public void testSelect() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      User user = mapper.selectUserById();
      sqlSession.close();
      System.out.println("查询结果为：" + user);
   }

   @Test
   public void testSelectAll() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      List<User> users = mapper.selectAllUser();
      users.forEach(System.out::println);
      sqlSession.close();
   }

}
