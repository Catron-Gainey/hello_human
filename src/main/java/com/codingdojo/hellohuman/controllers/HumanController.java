package com.codingdojo.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String searchQuery) {
		if (searchQuery != null) {
			return "Hello " + searchQuery;
		}
		return "Hello Human";
		}
//	@RequestMapping("/")
//	public String secondRoute(@RequestParam(value="name") String searchQuery) {
//		return "Hello " + searchQuery;
//		}
	}
