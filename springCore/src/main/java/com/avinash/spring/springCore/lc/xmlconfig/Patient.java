package com.avinash.spring.springCore.lc.xmlconfig;

public class Patient {

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

}
