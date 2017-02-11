package com.remotetiger.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.remotetiger.bankapp.Customer;
import com.remotetiger.dao.CustomerDao;
import com.remotetiger.dao.LoginDao;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public loginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginDao dao = new LoginDao();
		CustomerDao cdao = new CustomerDao();
		String username = request.getParameter("getUserName");
		String password = request.getParameter("getUserPassword");
		int id = dao.validate(username, password);
		
		if (id != -1) {
			try {
				Customer customer = cdao.getCustomerById(id);
				request.setAttribute("Customer", customer);
				request.getRequestDispatcher("accountdetail.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			response.sendRedirect("accountdetail.jsp");
		} else {

			response.sendRedirect("index.jsp");
		}
		;

	}

}
