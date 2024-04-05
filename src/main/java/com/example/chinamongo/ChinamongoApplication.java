package com.example.chinamongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ChinamongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinamongoApplication.class, args);
	}

}
