package com.avinash.spring.springCore.propertyPlaceHoldere;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/avinash/spring/springCore/propertyPlaceHoldere/config.xml");
	
		MyDAO dao = (MyDAO) context.getBean("myDAO");
		System.out.println(dao);
	}
}