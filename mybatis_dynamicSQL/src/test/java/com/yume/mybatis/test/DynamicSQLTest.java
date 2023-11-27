package com.yume.mybatis.test;

import com.mysql.cj.log.NullLogger;
import com.yume.mybatis.mapper.DynamicSQL;
import com.yume.mybatis.pojo.Emp;
import com.yume.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicSQLTest {

    @Test
    public void getEmpById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
        Emp emp = new Emp(null, "", 23, "");
        List<Emp> list = mapper.getEmpByEmpId(emp);
        list.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void insertMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
        Emp emp1 = new Emp(null, "魔礼青", 1145, "");
        Emp emp2 = new Emp(null, "魔礼红", 11345, "");
        Emp emp3 = new Emp(null, "魔礼海", 1145, "");
        Emp emp4 = new Emp(null, "魔礼寿", 1145, "");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3, emp4);
        int i = mapper.insertMoreEmps(list);
        System.out.println(i);
        sqlSession.close();
    }

    @Test
    public void deleteEmpsById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
        Integer[] integers = new Integer[]{11, 12, 131, 14};
        int i = mapper.deleteEmpsById(integers);
        System.out.println(i);
        sqlSession.close();
    }

}
