package com.cloud.eureka.client.yellow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages="com.cloud.eureka.client")
public class SpringEurekaClientYellowApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientYellowApplication.class, args);
	}
}
