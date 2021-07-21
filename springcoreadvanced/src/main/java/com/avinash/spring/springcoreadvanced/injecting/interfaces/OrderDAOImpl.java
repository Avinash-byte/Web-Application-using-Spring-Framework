package com.avinash.spring.springcoreadvanced.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl createOrder()");
	}

}
