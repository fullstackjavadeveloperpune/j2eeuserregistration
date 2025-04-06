package com.fullstack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fullstack.model.User;
import com.fullstack.service.UserService;
import com.fullstack.service.UserServiceImpl;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService userService = new UserServiceImpl();

	/**
	 * Default constructor.
	 */
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int userId = Integer.parseInt(request.getParameter("userid"));
		String userName = request.getParameter("username");
		String userAddress = request.getParameter("useraddress");
		String userState = request.getParameter("userstate");
		String userGender = request.getParameter("usergender");
		Date userDOB = null;

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		try {
			userDOB = simpleDateFormat.parse(request.getParameter("userdob"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long userContactNumber = Long.valueOf(request.getParameter("usercontactnumber"));

		String userEmailId = request.getParameter("useremailid");
		String userPassword = request.getParameter("userpassword");

		User user = new User(userId, userName, userAddress, userState, userGender, userDOB, userContactNumber,
				userEmailId, userPassword);

		userService.registerUser(user);

		PrintWriter printWriter = response.getWriter();

		printWriter.println("User Registration Done Successfully, Please check data in Database");
	}

}
