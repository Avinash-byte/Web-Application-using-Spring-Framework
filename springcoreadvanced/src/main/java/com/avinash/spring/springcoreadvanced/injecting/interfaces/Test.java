package com.avinash.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/avinash/spring/springcoreadvanced/injecting/interfaces/config.xml");
		OrderBo orderBo = (OrderBo) context.getBean("bo");
		orderBo.placeOrder();
		
	}

}
