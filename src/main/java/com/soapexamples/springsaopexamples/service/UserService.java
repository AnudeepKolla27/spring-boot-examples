package com.soapexamples.springsaopexamples.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.springsoapexamples.spring_soap_examples.User;

@Service
public class UserService {
	
	public static Map<String, User> users = new HashMap<>();
	
	@PostConstruct
	public void loadUserData() {
		User ram = new User();
		ram.setEmpID(14);
		ram.setUserName("Ram");
		ram.setEmpSalary(1245);
		
		users.put(ram.getUserName(), ram);
		
		User harish = new User();
		harish.setEmpID(15);
		harish.setUserName("Harish");
		harish.setEmpSalary(857);
		
		users.put(harish.getUserName(), harish);
		
		User anudeep = new User();
		anudeep.setEmpID(14);
		anudeep.setUserName("Anudeep");
		anudeep.setEmpSalary(985);
		
		users.put(anudeep.getUserName(), anudeep);
		
	}
	
	public User getUserDetails(String name) {
		return users.get(name);
	}

}
