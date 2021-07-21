package com.avinash.spring.springCore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/avinash/spring/springCore/map/mapconfig.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer);
		
		

	}

}
