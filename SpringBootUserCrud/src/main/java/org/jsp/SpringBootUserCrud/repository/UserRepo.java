package org.jsp.SpringBootUserCrud.repository;

import org.jsp.SpringBootUserCrud.dto.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

	
	
}
