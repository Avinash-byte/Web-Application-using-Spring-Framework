package com.avinash.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avinash.spring.springjdbc.employee.dao.EmployeeDao;
import com.avinash.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/avinash/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		/*Employee employee=new Employee();
		employee.setId(2);
		//employee.setFirstName("Ujjawal");
		//employee.setSecondName("Yadav");
		//int result=dao.create(employee);
		//int result=dao.update(employee);
		int result=dao.delete(employee.getId());
		System.out.println("Number of Record inserted are: "+result);*/
		
		//Employee employee = dao.read(5);
		List<Employee> result = dao.read();
		for (Employee employee : result) {
			System.out.println(employee);
		}
		//System.out.println("Employee Record: "+result);

	}

}
