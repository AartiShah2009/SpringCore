package com.cts;

public class Employee {
	private int empId;
	private String empName;
	private String empAddress;
	
	public void setEmpId(int empId){
		this.empId=empId;
	}
	
	
	public void setEmpName(String empName){
		this.empName=empName;
	}
	
	
	public void setEmpAddress(String  empAddress){
		this.empAddress=empAddress;
	}
	
	public void getEmpDetails(){
		System.out.println("***************using Property********************");
		System.out.println("employee Id="+empId);
		System.out.println("employee Name="+empName);
		System.out.println("employee Address="+empAddress);
	}
	

}
