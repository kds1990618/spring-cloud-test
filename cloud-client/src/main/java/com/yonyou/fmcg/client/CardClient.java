package com.yonyou.fmcg.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="CLOUD-SERVER",fallbackFactory=CardClientFallbackFactory.class)
public interface CardClient {

	@GetMapping("/list")
    public String batchDisable() ;
}
