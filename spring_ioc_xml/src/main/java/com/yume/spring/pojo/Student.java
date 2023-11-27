package com.yume.spring.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * @author yume
 * @date 2022/12/01 上午 09:35
 */


public class Student implements Person {

   private Integer stuId;
   private String stuName;
   private Integer stuAge;
   private String stuGender;
   private Double score;
   private Clazz clazz;
   private String[] hobby;
   private Map<String, Teacher> teacherMap;

   public Integer getStuId() {
      return stuId;
   }

   public void setStuId(Integer stuId) {
      this.stuId = stuId;
   }

   public String getStuName() {
      return stuName;
   }

   public void setStuName(String stuName) {
      this.stuName = stuName;
   }

   public Integer getStuAge() {
      return stuAge;
   }

   public void setStuAge(Integer stuAge) {
      this.stuAge = stuAge;
   }

   public String getStuGender() {
      return stuGender;
   }

   public void setStuGender(String stuGender) {
      this.stuGender = stuGender;
   }

   public Double getScore() {
      return score;
   }

   public void setScore(Double score) {
      this.score = score;
   }

   public Clazz getClazz() {
      return clazz;
   }

   public void setClazz(Clazz clazz) {
      this.clazz = clazz;
   }

   public String[] getHobby() {
      return hobby;
   }

   public void setHobby(String[] hobby) {
      this.hobby = hobby;
   }

   public Map<String, Teacher> getTeacherMap() {
      return teacherMap;
   }

   public void setTeacherMap(Map<String, Teacher> teacherMap) {
      this.teacherMap = teacherMap;
   }

   public Student() {
   }

   public Student(Integer stuId, String stuName, String stuGender, Integer atuAge) {
      this.stuId = stuId;
      this.stuName = stuName;
      this.stuGender = stuGender;
      this.stuAge = atuAge;
   }

   public Student(Integer stuId, String stuName, String stuGender, Double score) {
      this.stuId = stuId;
      this.stuName = stuName;
      this.stuGender = stuGender;
      this.score = score;
   }

   @Override
   public String toString() {
      return "Student{" +
              "stuId=" + stuId +
              ", stuName='" + stuName + '\'' +
              ", stuAge=" + stuAge +
              ", stuGender='" + stuGender + '\'' +
              ", score=" + score +
              ", clazz=" + clazz +
              ", hobby=" + Arrays.toString(hobby) +
              ", teacherMap=" + teacherMap +
              '}';
   }
}
