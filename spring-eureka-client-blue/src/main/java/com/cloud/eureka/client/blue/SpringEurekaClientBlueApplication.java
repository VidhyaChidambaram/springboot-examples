package com.cloud.eureka.client.blue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages="com.cloud.eureka.client")
public class SpringEurekaClientBlueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientBlueApplication.class, args);
	}
}
