package com.avinash.spring.sprinjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		//Dao dao = context.getBean(Dao.class);
		//dao.create();
		
		Service service=context.getBean(Service.class);
		service.save();
		context.close();
	}

}
