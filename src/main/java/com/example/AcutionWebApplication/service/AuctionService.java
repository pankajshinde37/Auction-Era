package com.example.AcutionWebApplication.service;

import java.util.List;

import com.example.AcutionWebApplication.model.Auction;


public interface AuctionService {

	Auction saveWinner(Auction auction);

	
	List<Auction> getAllDetails();
}
