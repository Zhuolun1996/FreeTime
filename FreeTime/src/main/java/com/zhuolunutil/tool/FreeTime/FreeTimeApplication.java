package com.zhuolunutil.tool.FreeTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;

@SpringBootApplication
public class FreeTimeApplication {
	public static void main(String[] args) {
		SpringApplication.run(FreeTimeApplication.class, args);
	}
}
