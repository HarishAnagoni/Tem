package com.nineican.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AjaxController {

	@GetMapping("/")
	public String getName() {
		return "index2";
	}
	@GetMapping("/msg")
	public String getName(@RequestParam String name,Model view ) {
		view.addAttribute("name", "Hello "+name);
		return "index";
	}
	@GetMapping("/msg1")
	@ResponseBody
	public String getName1(String name) {
		return "Hello "+name+", Thank you for visiting! come again";
	}
	@GetMapping("/country")
	@ResponseBody
	public String getCountry(@RequestParam String country) {
		String country1="My country is "+country+", and i am going next month";
		return country1;
	}
	
}
