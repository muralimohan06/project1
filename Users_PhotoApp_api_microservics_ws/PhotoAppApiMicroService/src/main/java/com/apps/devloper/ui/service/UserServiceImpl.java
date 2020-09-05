package com.apps.devloper.ui.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.devloper.ui.CurdRepo.UsersRepository;
import com.apps.devloper.ui.dao.data.UserEntity;
import com.apps.devloper.ui.shared.UserDto;

@Service
public class UserServiceImpl implements UserService {

	UsersRepository usersRepository;
	
	@Autowired
	public UserServiceImpl(UsersRepository usersRepository) {
		this.usersRepository=usersRepository;
		
	}
	
	
	@Override
	public UserDto createUser(UserDto userDetails) {

		userDetails.setUserId(UUID.randomUUID().toString());
		ModelMapper modelMapper =new ModelMapper(); 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		
		UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);		
		userEntity.setEncryptedPassword("cdfgbgvfdvd");

		usersRepository.save(userEntity);
		return null;
	}

}
