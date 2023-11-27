package com.yume.mybatis.test;

import com.yume.mybatis.mapper.CacheMapper;
import com.yume.mybatis.pojo.Emp;
import com.yume.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class MybatisCacheTest {

   @Test
   public void testSelectEmpById() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
      Emp emp1 = mapper.selectEmpById(2);
      System.out.println(emp1);
      Emp emp2 = mapper.selectEmpById(3);
      System.out.println(emp2);
      sqlSession.close();
   }
}
