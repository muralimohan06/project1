package com.apps.devloper.ui.CurdRepo;

import org.springframework.data.repository.CrudRepository;

import com.apps.devloper.ui.dao.data.UserEntity;

public interface UsersRepository extends CrudRepository<UserEntity,Long>{

	
}