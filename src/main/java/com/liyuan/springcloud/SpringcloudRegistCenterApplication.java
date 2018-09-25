package com.liyuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudRegistCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudRegistCenterApplication.class, args);
	}
}
