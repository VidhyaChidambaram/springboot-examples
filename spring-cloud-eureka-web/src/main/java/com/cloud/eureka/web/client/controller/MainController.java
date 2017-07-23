package com.cloud.eureka.web.client.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MainController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/sentence")
	public String getSentence() {
		
		return getWord("spring-eureka-client-red") +" "+
				getWord("spring-eureka-client-blue") +" "+
				getWord("spring-eureka-client-yellow");
	}
	
	public String getWord(String serviceName) {
		List<ServiceInstance> instanceList = discoveryClient.getInstances(serviceName);
		if(instanceList!=null && !instanceList.isEmpty()) {
			URI uri = instanceList.get(0).getUri();
			
			if(uri!=null) {
				return (new RestTemplate()).getForObject(uri,String.class);
			}
		}
		return null;
	}
}
