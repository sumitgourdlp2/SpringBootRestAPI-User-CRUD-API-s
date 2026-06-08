package org.jsp.SpringBootUserCrud.exception;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppException {

	@ExceptionHandler(UserAlreadyExistsException.class)
	public ResponseEntity<Map<String, Object>> UserAlreadyExistsException(UserAlreadyExistsException e) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("date", LocalDate.now());
		map.put("time", LocalTime.now());
		map.put("error", "User Already Exists");
		map.put("message", e.getMessage());

		ResponseEntity<Map<String, Object>> entity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.CONFLICT);

		return entity;
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Map<String, Object>> UserNotFoundException(UserNotFoundException e) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("date", LocalDate.now());
		map.put("time", LocalTime.now());
		map.put("error", "User Not Found");
		map.put("message", e.getMessage());

		ResponseEntity<Map<String, Object>> entity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.NOT_FOUND);

		return entity;
	}

}
