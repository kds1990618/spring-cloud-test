package com.yonyou.fmcg.visit.web;

import javax.annotation.Generated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 拜访卡的控制器
 *
 * @date 2018-05-04 10:21:29
 */
@RestController
//@RequestMapping(value = "/card")
public class CardController{

		@GetMapping("/list")
	    public String batchDisable() {
	       System.out.println("CardController.batchDisable()");
	       return "1111111111111111";
	    }
}
