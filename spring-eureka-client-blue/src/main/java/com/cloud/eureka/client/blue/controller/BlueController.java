package com.cloud.eureka.client.blue.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlueController {

	@Value("${words}")
	public String words;
	
	@RequestMapping("/")
	public String getRandomWord() {
		String[] wordArray  = words.split(",");
		int i = (int)Math.round(Math.random() * (wordArray.length - 1));
		return wordArray[i];
	}
}
