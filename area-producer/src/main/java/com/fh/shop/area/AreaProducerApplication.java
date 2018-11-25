package com.fh.shop.area;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.fh.shop.area.mapper")
@EnableDiscoveryClient
public class AreaProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(AreaProducerApplication.class, args);
	}
}
