package com.example.AcutionWebApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AcutionWebApplication.model.Auction;
import com.example.AcutionWebApplication.repository.AuctionRepository;

@Service
public class AuctionServiceImp implements AuctionService{

	@Autowired
	private AuctionRepository auctionRepository;

	@Override
	public Auction saveWinner(Auction auction) {
		// TODO Auto-generated method stub
		return auctionRepository.save(auction);
	}

	@Override
	public List<Auction> getAllDetails() {
		// TODO Auto-generated method stub
		return auctionRepository.findAll();
	}
}
