package com.example.AcutionWebApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AcutionWebApplication.model.Auction;

public interface AuctionRepository  extends JpaRepository<Auction, Integer>{

}
