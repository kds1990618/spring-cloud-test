package com.yonyou.fmcg.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ConsumerController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	CardClient cardClient;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	@HystrixCommand/*(fallbackMethod = "helloError")*/
	public String hello() {
		System.out.println("ConsumerController.hello()");
//		return restTemplate.getForEntity("http://CLOUD-SERVER/card/list", String.class).getBody();
		return cardClient.batchDisable();
	}
	
	 public String helloError() {
        return "服务器出现故障";
    }
}
