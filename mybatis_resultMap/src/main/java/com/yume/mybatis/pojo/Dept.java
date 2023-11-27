package com.yume.mybatis.pojo;

import java.util.List;

public class Dept {
   private int deptId;
   private String deptName;
   private List<Emp> emps;


   public Dept() {
   }

   public Dept(int deptId, String deptName) {
      this.deptId = deptId;
      this.deptName = deptName;
   }

   public Dept(int deptId, String deptName, List<Emp> emps) {
      this.deptId = deptId;
      this.deptName = deptName;
      this.emps = emps;
   }

   public List<Emp> getEmps() {
      return emps;
   }

   public void setEmps(List<Emp> emps) {
      this.emps = emps;
   }

   public int getDeptId() {
      return deptId;
   }

   public void setDeptId(int deptId) {
      this.deptId = deptId;
   }

   public String getDeptName() {
      return deptName;
   }

   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   @Override
   public String toString() {
      return "Dept{" +
              "deptId=" + deptId +
              ", deptName='" + deptName + '\'' +
              '}';
   }
}
