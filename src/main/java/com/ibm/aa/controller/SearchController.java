package com.ibm.aa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
	
	@RequestMapping("/")
	public String canaryMethod() {
		return "This is a test";
	}
	
}
