package com.ust.SpringBootFeignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//@EnableFeignClient
public class SpringBootFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignClientApplication.class, args);
	}

}
