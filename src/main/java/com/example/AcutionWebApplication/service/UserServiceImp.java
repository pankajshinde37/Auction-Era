package com.example.AcutionWebApplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AcutionWebApplication.model.UserDetails;
import com.example.AcutionWebApplication.repository.UserRepository;


@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	
	
	@Override
	public UserDetails createUser(UserDetails user) {
		
		
		System.out.println(user.getPassword());
		
		user.setRole("Beader");
		return userRepository.save(user);
	}


	@Override
	public boolean checkEmail(String email) {
		
		return userRepository.existsByEmail(email);
	}


	@Override
	public boolean checkPassword(String password) {
		// TODO Auto-generated method stub
		return userRepository.existsByPassword(password);
	}


	@Override
	public UserDetails getUserByEmailAndPassword(String email, String password) {
		  Optional<UserDetails> userOptional = userRepository.findByEmailAndPassword(email, password);
	        return userOptional.orElse(null); 	}


	
	
	

}
