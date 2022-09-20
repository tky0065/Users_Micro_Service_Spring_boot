package com.example.users.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.entities.User;
import com.example.users.repos.UserRepository;
import com.example.users.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRESTController {
	
	@Autowired
	UserRepository userRep;
	@RequestMapping(path = "all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
	return userRep.findAll();
	}
	

}
