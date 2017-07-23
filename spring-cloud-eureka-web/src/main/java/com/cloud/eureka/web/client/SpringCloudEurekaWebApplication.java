package com.cloud.eureka.web.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages="com.cloud.eureka.web.client")
public class SpringCloudEurekaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaWebApplication.class, args);
	}
}
