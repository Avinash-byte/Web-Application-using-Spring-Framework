package com.avinash.spring.springCore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/avinash/spring/springCore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital name: "+hospital.getName());
		System.out.println(hospital.getDepartments());
		

	}

}
