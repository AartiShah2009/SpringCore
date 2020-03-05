package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext co= new ClassPathXmlApplicationContext("Beans.xml");
		Employee e = (Employee) co.getBean("employee");
		User u=(User) co.getBean("user");
		e.getEmpDetails();
	
		u.getUserDetails();

	}

}
