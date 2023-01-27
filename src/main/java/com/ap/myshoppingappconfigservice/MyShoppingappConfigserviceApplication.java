package com.ap.myshoppingappconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyShoppingappConfigserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyShoppingappConfigserviceApplication.class, args);
	}

}
