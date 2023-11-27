package com.yume.mybatis.mapper;

import com.yume.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

   /**
    * 分步查询员工共信息第二步
    * @param deptId
    * @return
    */
   Dept selectEmpAndDeptByStepTwo(@Param("deptId") int deptId);

   /**
    * 查询部门及部门中的员工
    * @param deptId
    * @return
    */
   Dept getDeptAndEmpById(@Param("deptId") int deptId);

   /**
    * 分步查询部门及其员工第一步
    * @param deptId
    * @return
    */
   Dept getDeptAndEmpByStepOne(@Param("deptId") int deptId);

}
