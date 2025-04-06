package com.fullstack.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fullstack.model.User;

public class UserDaoImpl implements UserDao {

	Connection connection = null;

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?useSSL=false", "root",
						"root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(
					"insert into user(userid, username, useraddress, userstate, usergender, userdob, usercontactnumber, useremailid, userpassword)values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			preparedStatement.setInt(1, user.getUserId());
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.setString(3, user.getUserAddress());
			preparedStatement.setString(4, user.getUserState());
			preparedStatement.setString(5, user.getUserGender());
			preparedStatement.setDate(6, new Date(user.getUserDOB().getTime()));
			preparedStatement.setLong(7, user.getUserContactNumber());
			preparedStatement.setString(8, user.getUserEmailId());
			preparedStatement.setString(9, user.getUserPassword());

			preparedStatement.executeUpdate();

			System.out.println("Data Inserted into DB Successfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
