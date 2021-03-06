package com.martin.eurekazuulproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(scanBasePackages = { "com.martin" })
@EnableZuulProxy
@EnableEurekaClient
public class EurekazuulproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekazuulproxyApplication.class, args);
	}

}
