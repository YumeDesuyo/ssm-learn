package com.yume.mybatis.pojo;

public class Emp {
   private int empId;
   private String empName;
   private int empAge;
   private String empGender;
   private Dept dept;

   @Override
   public String toString() {
      return "Emp{" +
              "empId=" + empId +
              ", empName='" + empName + '\'' +
              ", empAge=" + empAge +
              ", empGender='" + empGender + '\'' +
              ", dept=" + dept +
              '}';
   }

   public Dept getDept() {
      return dept;
   }

   public void setDept(Dept dept) {
      this.dept = dept;
   }

   public int getEmpId() {
      return empId;
   }

   public void setEmpId(int empId) {
      this.empId = empId;
   }

   public String getEmpName() {
      return empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public int getEmpAge() {
      return empAge;
   }

   public void setEmpAge(int empAge) {
      this.empAge = empAge;
   }

   public String getEmpGender() {
      return empGender;
   }

   public void setEmpGender(String empGender) {
      this.empGender = empGender;
   }

   public Emp(int empId, String empName, int empAge, String empGender, Dept dept) {
      this.empId = empId;
      this.empName = empName;
      this.empAge = empAge;
      this.empGender = empGender;
      this.dept = dept;
   }

   public Emp() {
   }
}
