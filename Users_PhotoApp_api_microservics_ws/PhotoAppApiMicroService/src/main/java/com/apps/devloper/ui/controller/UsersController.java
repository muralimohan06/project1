package com.apps.devloper.ui.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.devloper.ui.model.CreateUserRequestModel;
import com.apps.devloper.ui.service.UserService;
import com.apps.devloper.ui.shared.UserDto;

@RestController
@RequestMapping("/users")
public class UsersController {


	@Autowired
	private Environment env;
	
	@Autowired
	UserService userService;
	
	///users/user/status
	@GetMapping("/user/status")
	public String getStatus() {
		return "working on port "+env.getProperty("local.server.port");

	}

	@PostMapping
	public String createUser(@Valid @RequestBody CreateUserRequestModel userDetails) {
		
		ModelMapper modelMapper =new ModelMapper(); 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 
		UserDto userDto =modelMapper.map(userDetails, UserDto.class);
		userService.createUser(userDto);
		
		return "ccccuu";

	}

}
