package com.github.acnaweb.ping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class PingController {

	@GetMapping("/ping")
	public String ping() {
		return "Pong";
		
	}
	
	@GetMapping("/nome")
	public String nome() {
		return "Dayane";
	}

}
