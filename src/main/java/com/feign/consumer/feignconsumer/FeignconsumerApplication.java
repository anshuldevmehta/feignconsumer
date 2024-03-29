package com.feign.consumer.feignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignconsumerApplication.class, args);
	}

}
