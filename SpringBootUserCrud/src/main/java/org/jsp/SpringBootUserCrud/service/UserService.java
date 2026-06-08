package org.jsp.SpringBootUserCrud.service;

import java.util.List;
import java.util.Optional;

import org.jsp.SpringBootUserCrud.dao.UserDAO;
import org.jsp.SpringBootUserCrud.dto.UserEntity;
import org.jsp.SpringBootUserCrud.exception.UserAlreadyExistsException;
import org.jsp.SpringBootUserCrud.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserDAO dao;

	public UserEntity saveUser(UserEntity user) {
		Optional<UserEntity> optional = dao.findUserById(user.getId());
		if (optional.isEmpty()) {
			return dao.saveUser(user);
		} else
			throw new UserAlreadyExistsException("User Found With Id:- " + user.getId());
	}

	public UserEntity findUserById(int id) {
		Optional<UserEntity> optional = dao.findUserById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else
			throw new UserNotFoundException("User Not Found With Id:- " + id);
	}

	public UserEntity updateUser(UserEntity user) {
		Optional<UserEntity> optional = dao.findUserById(user.getId());
		if (optional.isPresent()) {
			return dao.updateUser(user);
		} else
			throw new UserNotFoundException("User Not Found With Id:- " + user.getId());
	}

	public void deleteUserById(int id) {
		Optional<UserEntity> optional = dao.findUserById(id);
		if (optional.isPresent()) {
			dao.deleteUserById(id);
		} else
			throw new UserNotFoundException("User Not Found With Id:- " + id);
	}
	
	public List<UserEntity> findAllUsers() {
		return dao.findAllUsers();
	}

}
