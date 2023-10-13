package com.example.AcutionWebApplication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.AcutionWebApplication.repository.UserRepository;

@Service
public class UserDeatilsServiceImp implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		com.example.AcutionWebApplication.model.UserDetails user=userRepo.findByEmail(email);
		
		if(user !=null)
		{
			return new CustomerUserDetails(user);
		}
		
		throw new UsernameNotFoundException("User not Avialable");
	}

}
