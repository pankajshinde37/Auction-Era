package com.example.AcutionWebApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AcutionWebApplication.model.UserDetails;
import com.example.AcutionWebApplication.repository.AdminRepository;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	
	@Override
	public List<UserDetails> getAllDetails() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}


	@Override
	public void deleteUserById(int id) {
		
		adminRepository.deleteById(id);
	}
	
	

}
