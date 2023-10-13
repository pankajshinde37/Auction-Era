package com.example.AcutionWebApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AcutionWebApplication.model.BidDetails;

public interface BidRepository  extends JpaRepository<BidDetails,Integer>{

}

