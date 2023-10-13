package com.example.AcutionWebApplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.AcutionWebApplication.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {
	public boolean existsByEmail(String email);
	
	public UserDetails findByEmail(String email);

	public boolean existsByPassword(String password);

	public Optional<UserDetails> findByEmailAndPassword(String email, String password);

	
	
	

	

	

}
