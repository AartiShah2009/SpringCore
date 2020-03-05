package com.cts;

public class User {

	private String userName;
	private String userAddress;
	public User(String userName, String userAddress) {
		super();
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	public void getUserDetails(){
		System.out.println("**************using Constructor**********************");
		System.out.println("user Name="+userName);
		System.out.println("user Address="+userAddress);
	}
	
}
