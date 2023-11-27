package com.yume.mybatis.mapper;

import com.yume.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQL {

   /**
    * 查询员工集合
    * @param emp
    * @return
    */
   List<Emp> getEmpByEmpId(Emp emp);

   /**
    * 添加多个用户
    * @param list
    * @return
    */
   int insertMoreEmps(@Param("empList") List<Emp> list);

   /**
    * 通过id批量删除员工
    * @param empId
    * @return
    */
   int deleteEmpsById(@Param("empId") Integer[] empId);

}
