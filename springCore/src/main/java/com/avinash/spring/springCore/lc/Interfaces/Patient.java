package com.avinash.spring.springCore.lc.Interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter Method");
		this.id = id;
	}

	public void hi() {
		System.out.println("Inside Hi Method");
	}

	public void bye() {

		System.out.println("Inside Bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Inside destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Inside after properties set");
	}

}
