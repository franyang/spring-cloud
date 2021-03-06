package com.frank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableCircuitBreaker//开启断路器
//@EnableDiscoveryClient
//@SpringCloudApplication
@EnableEurekaClient
@SpringBootApplication
public class RibbonHystrixApplication {


	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonHystrixApplication.class, args);
	}
}
