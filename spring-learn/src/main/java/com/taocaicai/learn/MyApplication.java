package com.taocaicai.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @project spring
 * @author Oakley
 * @created 2021-09-14 16:55:16:55
 * @package com.taocaicai.learn
 * @description TODO
 * @since: 0.0.0.1
 */
public class MyApplication {
  public static void main(String[] args) {
//	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml","application2.xml");
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application3.xml");
	  String[] beanDefinitionNames = context.getBeanDefinitionNames();
    for (String beanDefinitionName : beanDefinitionNames) {
      System.out.println(beanDefinitionName);
    }
  }
}
