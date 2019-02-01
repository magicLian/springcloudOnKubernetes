package com.springcloud.serviceapi.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ApiController {

	@RequestMapping("/me")
	public String showme(){
		return "I'm in! new Api server";
	}
}
