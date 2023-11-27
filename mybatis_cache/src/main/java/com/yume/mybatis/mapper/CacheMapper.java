package com.yume.mybatis.mapper;

import com.yume.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

   /**
    * 查询员工信息
    * @param empId
    * @return
    */
   Emp selectEmpById(@Param("empId") Integer empId);
}
