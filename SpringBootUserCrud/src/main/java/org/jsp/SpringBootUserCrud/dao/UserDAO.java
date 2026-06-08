package org.jsp.SpringBootUserCrud.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.SpringBootUserCrud.dto.UserEntity;
import org.jsp.SpringBootUserCrud.repository.UserRepo;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	private UserRepo repo;

	public UserEntity saveUser(UserEntity user) {
		return repo.save(user);
	}

	public Optional<UserEntity> findUserById(int id) {
		return repo.findById(id);
	}

	public UserEntity updateUser(UserEntity user) {
		return repo.save(user);
	}
	
	public void deleteUserById(int id) {
		repo.deleteById(id);
	}
	
	public List<UserEntity> findAllUsers() {
		return repo.findAll();
	}
	
}
