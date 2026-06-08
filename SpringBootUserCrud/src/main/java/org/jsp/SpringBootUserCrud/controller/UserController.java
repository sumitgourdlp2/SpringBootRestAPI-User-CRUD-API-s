package org.jsp.SpringBootUserCrud.controller;

import org.jsp.SpringBootUserCrud.dto.UserEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@PostMapping("/save")
	public void saveUser(UserEntity user) {
		
	}
	
}
