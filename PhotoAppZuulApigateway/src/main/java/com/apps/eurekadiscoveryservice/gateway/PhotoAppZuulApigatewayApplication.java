package com.apps.eurekadiscoveryservice.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class PhotoAppZuulApigatewayApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(PhotoAppZuulApigatewayApplication.class, args);
	}

}
