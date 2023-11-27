package com.yume.mybatis.pojo;

public class Emp {

   private Integer empId;
   private String empName;
   private Integer empAge;
   private String empGender;


   public void setEmpId(Integer empId) {
      this.empId = empId;
   }

   public void setEmpAge(Integer empAge) {
      this.empAge = empAge;
   }

   @Override
   public String toString() {
      return "Emp{" +
              "empId=" + empId +
              ", empName='" + empName + '\'' +
              ", empAge=" + empAge +
              ", empGender='" + empGender + '\'' +
              '}';
   }

   public Emp(Integer empId, String empName, Integer empAge, String empGender) {
      this.empId = empId;
      this.empName = empName;
      this.empAge = empAge;
      this.empGender = empGender;
   }


   public String getEmpName() {
      return empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public Integer getEmpId() {
      return empId;
   }

   public Integer getEmpAge() {
      return empAge;
   }

   public String getEmpGender() {
      return empGender;
   }

   public void setEmpGender(String empGender) {
      this.empGender = empGender;
   }



}
