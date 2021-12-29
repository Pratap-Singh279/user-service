package com.flightapp.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.flightapp.entities.Flight;
import com.flightapp.repositories.UserRepos;
import com.flightapp.security.services.SecurityService;
@RestController
@RequestMapping("/flight/user")
public class UserController {

	@Autowired
	SecurityService securityService;
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	UserRepos userRepo;
	
	///airline/{airLineName}/status/{airlineStatus}
	
	@PostMapping("/airline/block/{airLineName}/status/{airlineStatus}")
	public String updateAirlineStatus(@PathVariable("airLineName") String airLineName,@PathVariable("airlineStatus") String airlineStatus) throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:"+8101+"/flight/airline/"+airLineName+"/status/"+airlineStatus+"";
	    URI uri = new URI(baseUrl);	 
	    ResponseEntity<String> result = restTemplate.postForEntity(uri, null, String.class);
		
		if(result==null)
			throw new RuntimeException("Some error occurred while registering flight");
		return result.getBody();
	}
	
	@PostMapping("/airline/register")
	public String registerAirline(@RequestBody Flight flight) throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:"+8101+"/flight/airline/register";
	    URI uri = new URI(baseUrl);	 
	    ResponseEntity<String> result = restTemplate.postForEntity(uri, flight, String.class);
		
		if(result==null)
			throw new RuntimeException("Some error occurred while registering flight");
		return result.getBody();
	}
	
	@PostMapping("/admin/login")
	public String login(String email, String password) {
		boolean loginResponse = securityService.login(email, password);
		if (loginResponse) {
			return ">>>>>>>>>Welcome!!! Admin";
		}
		return "Invalid Admin credentials!!!!";

	}
}
