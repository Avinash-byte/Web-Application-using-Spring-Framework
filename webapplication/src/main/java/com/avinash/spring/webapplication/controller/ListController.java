package com.avinash.spring.webapplication.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avinash.spring.webapplication.dto.Employee;
@Controller
public class ListController {
	@RequestMapping("/readList")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		Employee employee1 = new Employee();
		employee1.setId(123);
		employee1.setName("Yadav ji");
		employee1.setSalary(2000);
		
		Employee employee2= new Employee();
		employee2.setId(456);
		employee2.setName("Pandey ji");
		employee2.setSalary(1000);
		
		Employee employee3 = new Employee();
		employee3.setId(123);
		employee3.setName("Mahto ji");
		employee3.setSalary(500);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

}
