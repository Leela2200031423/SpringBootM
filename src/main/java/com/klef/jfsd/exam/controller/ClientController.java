package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.service.APIService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class ClientController 
{
	@Autowired
	private APIService service;
	
	@GetMapping("/")
	public String home()
	{
		return "<h3>API Demo</h3>";
	}
	
	
	@GetMapping("demo3") //http://localhost:1423/api/demo3
	public List<Object> demo3() {
		return service.displayAllUsers();
	}
	
	
}
