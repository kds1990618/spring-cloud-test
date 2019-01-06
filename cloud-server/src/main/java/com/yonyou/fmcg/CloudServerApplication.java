package com.yonyou.fmcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//@EnableDiscoveryClient
//@SpringBootApplication
@SpringCloudApplication
@EnableFeignClients
public class CloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServerApplication.class, args);
	}

}

