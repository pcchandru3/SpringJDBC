package com.learn.java.spring.jdbc.dao;

import learn.java.spring.jdbc.Customer;

public interface CustomerDAO {
	
	public void insertCustomer(Customer customer);
	public Customer getCustomerById(int CustId);

}
