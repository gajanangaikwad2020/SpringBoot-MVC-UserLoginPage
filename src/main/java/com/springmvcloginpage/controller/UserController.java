package com.springmvcloginpage.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvcloginpage.dao.UserDao;
import com.springmvcloginpage.entity.User;
@Controller
public class UserController 
{
	@Autowired
	UserDao userDao;
	
	
	@GetMapping("/")
	public String home() 
	{ 
	    return "home";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute User user,HttpSession session)
	{
		userDao.save(user);
		session.setAttribute("message","User Registration is Successfully done.");
		
		System.out.println("User is :"+user);
		
		
		return "redirect:/";
	}
	
	
	
}
