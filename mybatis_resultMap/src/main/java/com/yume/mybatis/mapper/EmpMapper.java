package com.yume.mybatis.mapper;

import com.yume.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {

   /**
    * 通过id查询员工信息
    * @param empId
    * @return
    */
   Emp selectEmpById(@Param("empId") int empId);

   /**
    * 通过id查询员工及其所在的部门
    * @param empId
    * @return
    */
   Emp selectEmpAndDeptById(@Param("empId") int empId);

   /**
    * 分步查询员工信息第一步
    * @param empId
    * @return
    */
   Emp selectEmpAndDeptByStepOne(@Param("empId") int empId);

   /**
    * 分步查询部门及其员工第二步
    * @param deptId
    * @return
    */
   Emp getDeptAndEmpByStepTwo(@Param("deptId") int deptId);
}
