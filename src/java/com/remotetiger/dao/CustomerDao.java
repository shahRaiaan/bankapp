package com.remotetiger.dao;

import com.remotetiger.bankapp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		Connection conn = null;
		PreparedStatement stmtLogin = null;
		PreparedStatement stmtAddress = null;
		PreparedStatement stmtCustomer = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);

			String logintablesql = "insert into bank.login (username,password,security_question,security_question_answer,customer_id) values(?,?,?,?,?)";
			stmtLogin = conn.prepareStatement(logintablesql);
			stmtLogin.setString(1, customer.getLogin().getUsername());

			stmtLogin.setString(2, customer.getLogin().getPassword());

			stmtLogin.setString(3, customer.getLogin().getSecurityQuestion());
			stmtLogin.setString(4, customer.getLogin().getSecurityAnswer());
			stmtLogin.setInt(5, customer.getId());
			stmtLogin.executeUpdate();

			String addresstablesql = "insert into bank.address(customer_id,street_name,house_no,zipcode) values(?,?,?,?)";
			stmtAddress = conn.prepareStatement(addresstablesql);
			stmtAddress.setInt(1, customer.getId());
			stmtAddress.setString(2, customer.getAddress().getStreetname());
			stmtAddress.setInt(3, customer.getAddress().getHouseno());
			stmtAddress.setInt(4, customer.getAddress().getZipcode());
			stmtAddress.executeUpdate();

			String customertablesql = "insert into bank.customer(customer_id,name,dateofbirth) values(?,?,?)";
			stmtCustomer = conn.prepareStatement(customertablesql);
			stmtCustomer.setInt(1, customer.getId());
			stmtCustomer.setString(2, customer.getName());
			stmtCustomer.setString(3, customer.getDateofbirth());
			stmtCustomer.executeUpdate();

			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
		} finally {
			stmtLogin.close();
			stmtAddress.close();
			stmtCustomer.close();
			conn.close();
		}

	}

	public Customer getCustomerById(int id) throws SQLException {
		Connection conn = null;
		Customer customer = new Customer(id);
		PreparedStatement stmtAddress = null;
		PreparedStatement stmtCustomer = null;

		try {
			conn = getConnection();
			String addresstablesql = "select * from bank.address where customer_id=" + id;
			;
			stmtAddress = conn.prepareStatement(addresstablesql);
			ResultSet rs = stmtAddress.executeQuery();

			Address address = new Address(id);
			while (rs.next()) {
				address.setStreetname(rs.getString(2));
				address.setHouseno(rs.getInt(3));
				address.setZipcode(rs.getInt(4));
			}
			customer.setAddress(address);

			String customertablesql = "select * from bank.customer where customer_id=" + id;
			stmtCustomer = conn.prepareStatement(customertablesql);
			ResultSet rs2 = stmtCustomer.executeQuery();
			while (rs2.next()) {

				customer.setName(rs2.getString(2));
				customer.setDateofbirth(rs2.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {

			stmtAddress.close();
			stmtCustomer.close();
			conn.close();
		}
		return customer;
	}

}
