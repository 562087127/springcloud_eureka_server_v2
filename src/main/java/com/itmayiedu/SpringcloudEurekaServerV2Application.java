package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServerV2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServerV2Application.class, args);
	}

}

