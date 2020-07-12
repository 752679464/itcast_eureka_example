package cn.itcast.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ItcastServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItcastServiceProviderApplication.class, args);
	}

}
