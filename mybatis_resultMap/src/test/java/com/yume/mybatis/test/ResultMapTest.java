package com.yume.mybatis.test;

import com.yume.mybatis.mapper.DeptMapper;
import com.yume.mybatis.mapper.EmpMapper;
import com.yume.mybatis.pojo.Dept;
import com.yume.mybatis.pojo.Emp;
import com.yume.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultMapTest {

   @Test
   public void selectEmpById() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
      Emp emp = mapper.selectEmpById(1);
      sqlSession.close();
      System.out.println(emp);
   }

   @Test
   public void selectEmpAndDeptById() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
      Emp emp = mapper.selectEmpAndDeptById(2);
      sqlSession.close();
      System.out.println(emp);
   }

   @Test
   public void selectEmpAndDeptByStep() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
      Emp emp = mapper.selectEmpAndDeptByStepOne(2);
      System.out.println(emp);
      sqlSession.close();
   }

   @Test
   public void getDeptAndEmpByDeptId() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
      Dept dept = mapper.getDeptAndEmpById(1);
      System.out.println(dept);
      sqlSession.close();
   }

   @Test
   public void getDeptAndEmpByStep() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
      Dept dept = mapper.getDeptAndEmpByStepOne(1);
      System.out.println(dept);
      sqlSession.close();
   }

}
