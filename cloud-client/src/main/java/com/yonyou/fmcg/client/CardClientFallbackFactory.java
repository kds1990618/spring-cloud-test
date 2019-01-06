package com.yonyou.fmcg.client;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class CardClientFallbackFactory implements  FallbackFactory<CardClient>{

	@Override
	public CardClient create(Throwable cause) {
		return new CardClient() {
			
			@Override
			public String batchDisable() {
				System.out.println("CardClientFallbackFactory.create(...).new CardClient() {...}.batchDisable()");
				return "调用服务端出错啦";
			}
		};
	}

}
