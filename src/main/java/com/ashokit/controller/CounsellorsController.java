package com.ashokit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.entity.Counsellors;
import com.ashokit.entity.Login;
import com.ashokit.service.CounsellorsService;

@Controller
public class CounsellorsController {
	
	@Autowired
	private CounsellorsService service;
	
	@GetMapping("/")
	public String login(Model model) {
		Counsellors counsellors=new Counsellors();
		model.addAttribute("counsellors",counsellors);
		return "login";
	}
	@GetMapping("/register")
    public String showSaveForm(Model model) {
        model.addAttribute("counsellors", new Counsellors());
        return "register";
    }
	
	@PostMapping("/saveregister")
    public String saveTask(@ModelAttribute Counsellors counsellors) {
        service.saveTask(counsellors);
        return "login";
    }
	
	@PostMapping("/logging")
	public String loginCheck(Model model,@RequestParam("email") String email , @RequestParam("password") String password) {
	  Counsellors log=	service.findUsers(email,password);
//	  model.addAttribute("counsellors", new Counsellors());
	  if(log!=null) {
		return "deshboard";
	  }
	  return "login";
	}
	
	
	@PostMapping("deshboard")
	public String enquery(@ModelAttribute Counsellors counsellors) {
		service.count(counsellors);
		return null;
		
	}
	

	public String register() {
		
		
		return "register";
	}
}
