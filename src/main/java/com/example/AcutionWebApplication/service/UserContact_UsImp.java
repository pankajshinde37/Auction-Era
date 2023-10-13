package com.example.AcutionWebApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AcutionWebApplication.model.Contact_Us;
import com.example.AcutionWebApplication.repository.Contact_UsRepository;

@Service
public class UserContact_UsImp implements UserContact_Us{

	@Autowired
	private Contact_UsRepository contact_UsRepository;

	@Override
	public Contact_Us contactSave(Contact_Us conUs) {
		// TODO Auto-generated method stub
		return contact_UsRepository.save(conUs);
	}
	
	 

	
	
	
	
	
	
}
