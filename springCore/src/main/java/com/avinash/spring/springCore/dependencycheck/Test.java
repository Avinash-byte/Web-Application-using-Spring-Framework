package com.avinash.spring.springCore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/avinash/spring/springCore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		System.out.println(prescription);

		
		
		

	}

}
