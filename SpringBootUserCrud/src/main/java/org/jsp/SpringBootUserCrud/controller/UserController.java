package org.jsp.SpringBootUserCrud.controller;

import java.util.List;

import org.jsp.SpringBootUserCrud.dto.UserEntity;
import org.jsp.SpringBootUserCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/save")
	public UserEntity saveUser(@RequestBody UserEntity user) {
		return service.saveUser(user);
	}

	@GetMapping("/find")
	public UserEntity findUserById(@RequestParam int id) {
		return service.findUserById(id);
	}

	@PutMapping("/update")
	public UserEntity updateUser(@RequestBody UserEntity user) {
		return service.updateUser(user);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUserById(@PathVariable int id) {
		service.deleteUserById(id);
		return "User Deleted With Id:-" + id;
	}
	
	@GetMapping("/findAll")
	public List<UserEntity> findAllUsers() {
		return service.findAllUsers();
	}
	
}
