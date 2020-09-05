package com.apps.eurekadiscoveryservice.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppAccountManagementMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppAccountManagementMicroServiceApplication.class, args);
	}

}
