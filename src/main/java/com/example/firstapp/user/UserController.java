package com.example.firstapp.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("all")
	public List<UserEntity> getAll() {
		return userService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<UserEntity> getById(@PathVariable int id) {
		return userService.getById(id);
	}
	@PostMapping
	public UserEntity createUser(@RequestBody() UserEntity userEntity) {
		return userService.create(userEntity);
	}
	
//	@PutMapping("/{id}")
//	public UserEntity update(@PathVariable int id, @RequestBody() UserEntity userEntity) {
//		return userService.update(id, userEntity);
//	}

	
}