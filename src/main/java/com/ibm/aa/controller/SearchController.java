package com.ibm.aa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.aa.repository.LinksRepository;

@RestController
public class SearchController {
	@Autowired
	LinksRepository linksRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String canaryMethod() {
		return "This is a test";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/getData", method=RequestMethod.GET)
	public String retrieveData() {
		return "JSONDATA";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/setData", method=RequestMethod.POST)
	public String postData(String jsonData) {
		linksRepository.saveAndFlush(jsonData);
		return "Success";
	}
	
}
