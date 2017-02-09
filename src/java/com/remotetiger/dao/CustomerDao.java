package com.remotetiger.dao;

import com.remotetiger.bankapp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDao {

	private Connection getConnection() {// database connection provider method
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useSSL=true", "root", "root");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public void addCustomer(Customer customer) throws SQLException {
		Connection conn = getConnection();
		conn.setAutoCommit(false);

		String logintablesql = "insert into bank.login (username,password,security_question,security_question_answer,customer_id) values(?,?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(logintablesql);
		stmt.setString(1, customer.getLogin().getUsername());
		stmt.setString(2, customer.getLogin().getPassword());
		stmt.setString(3, customer.getLogin().getSecurityQuestion());
		stmt.setString(4, customer.getLogin().getSecurityAnswer());
		stmt.setInt(5, customer.getId());
		stmt.executeUpdate();

		String addresstablesql = "insert into bank.address(customer_id,street_name,house_no,zipcode) values(?,?,?,?)";
		stmt = conn.prepareStatement(addresstablesql);
		stmt.setInt(1, customer.getId());
		stmt.setString(2, customer.getAddress().getStreetname());
		stmt.setInt(3, customer.getAddress().getHouseno());
		stmt.setInt(4, customer.getAddress().getZipcode());

		stmt.executeUpdate();

		String customertablesql = "insert into bank.customer(customer_id,name,dateofbirth) values(?,?,?)";
		stmt = conn.prepareStatement(customertablesql);
		stmt.setInt(1, customer.getId());
		stmt.setString(2, customer.getName());
		stmt.setString(3, customer.getDateofbirth());

		stmt.executeUpdate();

		conn.commit();

		stmt.close();
		conn.close();

	}
}
