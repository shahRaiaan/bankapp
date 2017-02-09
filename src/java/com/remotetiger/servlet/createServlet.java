package com.remotetiger.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.remotetiger.bankapp.Address;
import com.remotetiger.bankapp.Customer;
import com.remotetiger.bankapp.Login;
import com.remotetiger.dao.CustomerDao;

/**
 * Servlet implementation class createServlet
 */
public class createServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public createServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String securityQuestion = request.getParameter("securityquestion");
		String securityAnswer = request.getParameter("securityanswer");
		String name = request.getParameter("name");
		String dateOfBirth = request.getParameter("dateofbirth");
		String streetName = request.getParameter("streetname");
		int houseNo = Integer.parseInt(request.getParameter("houseno"));
		int zipcode = Integer.parseInt(request.getParameter("zipcode"));
		int givenId = Integer.parseInt(request.getParameter("id"));

		Login log = new Login(givenId, username, password, securityQuestion, securityAnswer);
		Address address = new Address(givenId, streetName, houseNo, zipcode);
		Customer customer = new Customer(givenId, name, dateOfBirth, address, log);

		CustomerDao dao = new CustomerDao();
		try {
			dao.addCustomer(customer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("index.jsp");
	}

}
