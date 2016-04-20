package com.learn.java.spring.jdbc.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import learn.java.spring.jdbc.Customer;

import com.learn.java.spring.jdbc.dao.CustomerDAO;

public class JDBCCustomerDAO implements CustomerDAO {

	
	private DataSource dataSource;
	private String sName;
	
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public void insertCustomer(Customer customer) {
		String sqlQuery = "INSERT INTO Customer (CUSTID, NAME, AGE) VALUES (?, ?, ?)";
		Connection conn = null;
		
		try {
			
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ps.setInt(1, customer.getCustId());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.executeUpdate();
			ps.close();
			
			
			
		}catch (SQLException e){
			throw new RuntimeException(e);
		} finally {
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e){
					
				}
		}
		

	}

	public Customer getCustomerById(int CustId) {
		// TODO Auto-generated method stub
		return null;
	}

}
