package com.example.AcutionWebApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AcutionWebApplication.model.UserDetails;

public interface AdminRepository  extends JpaRepository<UserDetails, Integer>{

	UserDetails deleteById(int id);

	

	

}
