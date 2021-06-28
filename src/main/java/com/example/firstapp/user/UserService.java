package com.example.firstapp.user;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public UserEntity create(UserEntity userEntity) {	
		return userRepository.save(userEntity);
	}
	
	
	public List<UserEntity> getAll() {	
		return userRepository.findAll();
	}
	
	public Optional<UserEntity> getById(int id) {	
		return userRepository.findById(id);
	}
	
//	public UserEntity update(int id,UserEntity userEntity) {	
//		try {
//		List<UserEntity> entity = userRepository.findAll();
//		UserEntity user = entity.stream().filter(userr -> userr.getId() == id ).collect(Collectors.toList());
//		user.setFirstName(userEntity.getFirstName());
//		user.setGender(userEntity.getGender());
//		user.setLastName(userEntity.getLastName());
//		return userRepository.save(user) ;
//		}
//		catch(Exception exception) {
//		return ;
//		}
//	}
	
}
