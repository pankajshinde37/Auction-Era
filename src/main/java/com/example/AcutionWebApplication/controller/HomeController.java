package com.example.AcutionWebApplication.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.AcutionWebApplication.model.BidDetails;
import com.example.AcutionWebApplication.model.Contact_Us;
import com.example.AcutionWebApplication.model.UserDetails;
import com.example.AcutionWebApplication.model.feedBackDeatils;
import com.example.AcutionWebApplication.service.BidDeatilsService;
import com.example.AcutionWebApplication.service.UserContact_Us;
import com.example.AcutionWebApplication.service.UserFeedBackService;
import com.example.AcutionWebApplication.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserFeedBackService userFeedBackService;
	
	@Autowired
	private UserContact_Us userContact_Us;
	
	@Autowired
	private BidDeatilsService bidDeatilsService;
	
	@GetMapping("/")
	public String Index()
	{
		return "index1";
	}
	
	@GetMapping("/signin")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute UserDetails user,HttpSession session) {
		
		//System.out.println(user);
		
		boolean f=userService.checkEmail(user.getEmail());
		
		System.out.print(f);
		if(f)
		{
			session.setAttribute("msg","Email ID is Already Exists");
		} 
		else
		{
			UserDetails  userDetails=userService.createUser(user);
			
			if(userDetails!=null)
			{
				session.setAttribute("msg","Register SuccessFull");
				//return "redirect:/register";
			}
			else
			{
				session.setAttribute("msg","Error on Server");
			}
			
		}
		
		
		
		return "redirect:/register";
	}
	
	
      @PostMapping("/mean")
	    public String loginUser(@RequestParam String email, @RequestParam String password) {
	        UserDetails user = userService.getUserByEmailAndPassword(email, password);
	        if (user != null) {
	            return "/user/home";
	        } else {
	            return "redirect:/signin";
	        }
	    }
	
	
	
	@GetMapping("/index")
	public String liveacutionr()
	{
		return "index";
	}
	
	
	
	@GetMapping("/image1")
	public String image1()
	{
		return "/user/image1";
	}
	
	@GetMapping("/image2")
	public String image2()
	{
		return "/user/image2";
	}
	
	@GetMapping("/image3")
	public String image3()
	{
		return "/user/image3";
	}
	
	@GetMapping("/image4")
	public String image4()
	{
		return "/user/image4";
	}
	@GetMapping("/image5")
	public String image5()
	{
		return "/user/image5";
	}
	@GetMapping("/image6")
	public String image6()
	{
		return "/user/image6";
	}
	@GetMapping("/image7")
	public String image7()
	{
		return "/user/image7";
	}
	@GetMapping("/image8")
	public String image8()
	{
		return "/user/image8";
	}
	
	@GetMapping("/image9")
	public String image9()
	{
		return "/user/image9";
	}
	
	@GetMapping("/image10")
	public String image10()
	{
		return "/user/image10";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "/user/about";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "/user/contact";
	}
	
	
	
	@GetMapping("/feedback")
	public String feedback()
	{
		return "/user/feedback";
	}
	
	@GetMapping("/biding")
	public String biding()
	{
		return "/user/biding";
	}
	
	@PostMapping("/back")
	public String back()
	{
		return "/user/home";
	}
	
	@PostMapping("/feed")
	public String saveFeedBack(@ModelAttribute feedBackDeatils fBDeatils)
	{
		userFeedBackService.saveFeedBack(fBDeatils);
		
		return "/user/home";
	
    }
	
	
	@PostMapping("/contact")
	public String contactSave(@ModelAttribute Contact_Us conUs)
	{
		userContact_Us.contactSave(conUs);
		return "/user/home";
		
	}
	
	@PostMapping("/bid")
	public String bidSave(@ModelAttribute BidDetails bidDetails )
	{
		bidDeatilsService.bidSave(bidDetails);
		return "/user/home";
	}
}
