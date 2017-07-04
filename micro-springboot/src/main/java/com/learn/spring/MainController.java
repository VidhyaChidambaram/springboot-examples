package com.learn.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/hi")
	public @ResponseBody String sayHi() {
		System.out.println("Hi");
		return "Hi world";
	}
}

