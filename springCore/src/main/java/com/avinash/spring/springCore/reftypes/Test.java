package com.avinash.spring.springCore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/avinash/spring/springCore/reftypes/reftypesconfig.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
		
		

	}

}
