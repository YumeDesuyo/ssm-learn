package com.yume.mybatis.test;

import com.github.pagehelper.PageHelper;
import com.yume.mybatis.mapper.EmpMapper;
import com.yume.mybatis.pojo.Emp;
import com.yume.mybatis.pojo.EmpExample;
import com.yume.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.awt.print.Pageable;
import java.util.List;

public class MbgTest {


   @Test
   public void testMBG() {
      SqlSession sqlSession = SqlSessionUtil.getSqlSession();
      EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
      Emp emp = mapper.selectByPrimaryKey(1);
      System.out.println("查询结果为" + emp);
      EmpExample empExample = new EmpExample();
      empExample.createCriteria().andEmpIdGreaterThanOrEqualTo(6);
      List<Emp> list = mapper.selectByExample(empExample);
      list.forEach(System.out::println);
      sqlSession.close();
   }
}
