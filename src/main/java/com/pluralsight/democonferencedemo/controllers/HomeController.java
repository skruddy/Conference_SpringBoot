package com.pluralsight.democonferencedemo.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@Value("${app.version}")
	private String appVersion;
	
	@GetMapping
	@RequestMapping("/")
	public HashMap<String, String> get() {
		HashMap map = new HashMap<>(); 
		map.put("app-version", appVersion);
		return map;
	}
	
}
