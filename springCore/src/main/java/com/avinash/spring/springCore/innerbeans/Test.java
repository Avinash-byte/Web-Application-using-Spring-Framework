package com.avinash.spring.springCore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/avinash/spring/springCore/innerbeans/config.xml");
		Employee employee=(Employee) ctx.getBean("employee");
		System.out.println(employee);

		
		
		

	}

}
