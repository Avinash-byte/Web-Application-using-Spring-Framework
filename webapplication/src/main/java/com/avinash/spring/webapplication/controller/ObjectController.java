package com.avinash.spring.webapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avinash.spring.webapplication.dto.Employee;
@Controller
public class ObjectController {
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Yadav ji");
		employee.setSalary(2000);
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}

}
