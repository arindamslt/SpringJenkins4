package com.arindam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	public String getData()
	{
		return "<h2>WELCOME</h2>";
	}
	@GetMapping("/home")
	public String getDatas()
	{
		return "<h2> TEST FOR JENKINS</h2>";
	}

}
