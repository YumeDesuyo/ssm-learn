package com.yume.spring.pojo;

/**
 * @author yume
 * @date 2022/12/04 下午 01:59
 */
public class Teacher {
   private Integer tId;
   private String tName;

   public Integer gettId() {
      return tId;
   }

   public void settId(Integer tId) {
      this.tId = tId;
   }

   public String gettName() {
      return tName;
   }

   public void settName(String tName) {
      this.tName = tName;
   }

   public Teacher(Integer tId, String tName) {
      this.tId = tId;
      this.tName = tName;
   }

   public Teacher() {
   }

   @Override
   public String toString() {
      return "Teacher{" +
              "tId=" + tId +
              ", tName='" + tName + '\'' +
              '}';
   }
}
