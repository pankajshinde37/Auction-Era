package com.example.AcutionWebApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AcutionWebApplication.model.feedBackDeatils;
import com.example.AcutionWebApplication.repository.FeedBackReository;

@Service
public class UserFeedBackServiceImp implements UserFeedBackService {
	
	@Autowired
	private FeedBackReository feedBackReository;

	@Override
	public feedBackDeatils saveFeedBack(feedBackDeatils fBDeatils) {
		
		System.out.println(fBDeatils.getName());
		return feedBackReository.save(fBDeatils);

}
}
