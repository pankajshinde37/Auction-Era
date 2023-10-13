package com.example.AcutionWebApplication.service;

import java.util.List;

import com.example.AcutionWebApplication.model.UserDetails;

public interface AdminService {
	

	List<UserDetails> getAllDetails(); 
	
	void deleteUserById(int id);

}
