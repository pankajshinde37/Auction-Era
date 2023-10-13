package com.example.AcutionWebApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.AcutionWebApplication.model.Auction;
import com.example.AcutionWebApplication.model.UserDetails;
import com.example.AcutionWebApplication.repository.UserRepository;
import com.example.AcutionWebApplication.service.AdminService;
import com.example.AcutionWebApplication.service.AuctionService;


@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private AuctionService auctionService;
	
	
	@PostMapping("/Acheck")
	public String check(@ModelAttribute com.example.AcutionWebApplication.model.Admin admin)
	{
		if((admin.getUserName().equals("Admin"))&&(admin.getPassword().equals("Admin")))
				{
			            return "AdminControl";
				}
		
			return "redirect:Alogin";
	}
	
	@PostMapping("Aback")
	public  String adminBack()
	{
		return "AdminControl";
		
	}
   
	
	@GetMapping("/Alogin")
	public String Admin()
	{
		return "Adminlogin";
	}
	
	
	
	 @GetMapping("/Admingo")
	    public String listdetails(Model model) {
		 
		 model.addAttribute("userDetails",adminService.getAllDetails());
	        return "Admin";
	    }
	 
	  @GetMapping("/delete/{id}")
	 public String deleteUser(@PathVariable int id)
	 {
		 System.out.print("Hello");
		 adminService.deleteUserById(id);
		 
		 return "redirect:/Admin";
	 }
	  
	  
	  @PostMapping("/winnersave")
	  public String saveWinner(@ModelAttribute Auction auction)
	  {
		  auctionService.saveWinner(auction);
		  
		  return "redirect:AdminControl";
	  }
	  
	  @GetMapping("AdminControl")
	  public String goAdminControl()
	  {
		  return "AdminControl";
	  }
	  
	  @GetMapping("/winnerlist")
	  public String winnerList(Model model)
	  {
		  model.addAttribute("Auction",auctionService.getAllDetails());
	      return "/user/WinnerList";
	  }
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
