package com.soapexamples.springsaopexamples.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soapexamples.springsaopexamples.service.UserService;
import com.springsoapexamples.spring_soap_examples.GetUserRequest;
import com.springsoapexamples.spring_soap_examples.GetUserResponse;

@Endpoint
public class UserEndpoint {
	
	@Autowired
	private UserService userService;
	
	@PayloadRoot( namespace ="http://springSoapExamples.com/spring-soap-examples", 
			localPart = "getUserRequest")
	@ResponsePayload
	public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
		GetUserResponse response = new GetUserResponse();
		response.setUser(userService.getUserDetails(request.getUserName()));
		return response;
	}

}
