package com.example.AcutionWebApplication.service;

import com.example.AcutionWebApplication.model.UserDetails;

public interface UserService {
	   public UserDetails createUser(UserDetails user);
	   
	   public boolean checkEmail(String email);

	public boolean checkPassword(String password);

	public UserDetails getUserByEmailAndPassword(String email, String password);

	

}
