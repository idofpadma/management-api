package com.utsav.management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagementController {
	@RequestMapping (value= "/utsav/management", method=RequestMethod.GET)
	public String ManagementMethod(){
		return "managment method";
	}
}
