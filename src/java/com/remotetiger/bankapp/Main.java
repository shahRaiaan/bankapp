package com.remotetiger.bankapp;

import java.sql.SQLException;

import com.remotetiger.dao.CustomerDao;
import com.remotetiger.dao.LoginDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login log = new Login(1, "Raiaan", "shah", "How are you", "I am fine");
		Address address = new Address(1, "Mandan Rd", 7807, 3456);
		Customer customer = new Customer(1, "Raiaan Shah", "7/4/90", address, log);

		CustomerDao dao = new CustomerDao();
		LoginDao logindao = new LoginDao();
		/*try {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
