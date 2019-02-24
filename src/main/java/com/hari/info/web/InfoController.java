package com.hari.info.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	
	@RequestMapping("/")
	public String home()
	{
		return "Hello";
		
	}
	

}
