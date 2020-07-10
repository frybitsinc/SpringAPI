package com.frybitsinc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi~";
	}
}