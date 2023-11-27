package com.yume.spring.test;

import com.yume.spring.pojo.Clazz;
import com.yume.spring.pojo.Person;
import com.yume.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yume
 * @date 2022/12/01 上午 09:42
 */
public class StuTest {

   @Test
   public void test() {
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");
      Student studentOne = (Student) ioc.getBean("studentOne");
      System.out.println(studentOne);
   }

   @Test
   public void beanTestIOC() {
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");
      Student student = ioc.getBean("studentTwo", Student.class);
      System.out.println(student);
   }

   @Test
   public void beanTestDI() {
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");
      Person studentTwo = ioc.getBean("studentThree", Student.class);
      Person person = ioc.getBean("studentOne", Person.class);
      System.out.println(person);
      System.out.println(studentTwo);
   }

   @Test
   public void bean() {
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");
      Student studentFour = ioc.getBean("studentFour", Student.class);
      System.out.println(studentFour.getStuGender());
   }

   @Test
   public void beanFive() {
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");
      Student studentFour = ioc.getBean("studentFive", Student.class);
      System.out.println(studentFour);
   }

   @Test
   public void beanSix() {
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");
      Student student = ioc.getBean("studentSix", Student.class);
      System.out.println(student);
   }

   @Test
   public void clazzOne() {
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");
      Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
      System.out.println(clazz);
   }
}
