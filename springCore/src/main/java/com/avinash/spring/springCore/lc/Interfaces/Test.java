package com.avinash.spring.springCore.lc.Interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/avinash/spring/springCore/lc/Interfaces/config.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		System.out.println(patient);
		ctx.registerShutdownHook();
		
		

	}

}
