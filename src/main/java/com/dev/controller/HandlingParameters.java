package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.dev.beans.Person;

@Controller
@RequestMapping("/param")
public class HandlingParameters {
	
	@RequestMapping(value = "/form",method = RequestMethod.GET)
	public String getForm(){
		return "Form";
	}
	
	@RequestMapping(value="/query",method=RequestMethod.GET)
	public String getQueryString(
			@RequestParam("name") String name,
			@RequestParam("age") int age
			){
		
		System.out.println(name);
		System.out.println(age);
		
		return "Msg";
	}
	int i;
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public String getFormData(@SessionAttribute("person") Person p){
		
		System.out.println(p);
		
		return "Person";
	}
	
	
	@RequestMapping(value="/path/{name}/{age}")
	public String getPathVariable(
			@PathVariable("name") String name,
			@PathVariable("age") String age
			){
		System.out.println(name);
		System.out.println(age);
		return "Msg";
	}
	
	
	
	
	
}