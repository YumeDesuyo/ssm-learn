package com.yume.spring.test;

import com.yume.spring.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author yume
 * @date 2022/12/01 上午 09:21
 */
public class HelloTest {

   @Test
   public void helloTest() {
      //获取IOC
      ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
      //获取IOC中的bean
      Hello hello = (Hello) ioc.getBean("hello");
      hello.sayHello();
   }
}
