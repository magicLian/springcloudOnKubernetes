package com.springcloud.serviceapi.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ApiController {

	@RequestMapping("/me")
	public String showme(){
		return "I'm in! new Api server";
	}

	@Value("${common.db_driver}")
	String db_driver;

	@RequestMapping(value = "/hi")
	public String hi(){
		return db_driver;
	}
}
