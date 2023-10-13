package com.example.AcutionWebApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AcutionWebApplication.model.BidDetails;
import com.example.AcutionWebApplication.repository.BidRepository;

@Service
public class BidDetailsServiceImp  implements BidDeatilsService{

	@Autowired
	private BidRepository bidRepository;

	@Override
	public BidDetails bidSave(BidDetails bidDetails) {
		// TODO Auto-generated method stub
		return bidRepository.save(bidDetails);
	}
	
	
	
	
	
}
