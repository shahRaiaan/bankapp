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
		String sql = "insert into car values(?,?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);

		/*stmt.setString(1, car.getVin());
		stmt.setInt(2, car.getModel());
		stmt.setInt(3, car.getYear());
		stmt.setFloat(4, car.getPrice());
		stmt.setString(5, car.getColor());

		stmt.executeUpdate();
		stmt.close();
		conn.close();*/

	}
}
