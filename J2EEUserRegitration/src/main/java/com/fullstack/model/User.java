package com.fullstack.model;

import java.util.Date;

public class User {

	private int userId;

	private String userName;

	private String userAddress;

	private String userState;

	private String userGender;

	private Date userDOB;

	private long userContactNumber;

	private String userEmailId;

	private String userPassword;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String userAddress, String userState, String userGender, Date userDOB,
			long userContactNumber, String userEmailId, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userState = userState;
		this.userGender = userGender;
		this.userDOB = userDOB;
		this.userContactNumber = userContactNumber;
		this.userEmailId = userEmailId;
		this.userPassword = userPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public Date getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}

	public long getUserContactNumber() {
		return userContactNumber;
	}

	public void setUserContactNumber(long userContactNumber) {
		this.userContactNumber = userContactNumber;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userState="
				+ userState + ", userGender=" + userGender + ", userDOB=" + userDOB + ", userContactNumber="
				+ userContactNumber + ", userEmailId=" + userEmailId + ", userPassword=" + userPassword + "]";
	}

}
