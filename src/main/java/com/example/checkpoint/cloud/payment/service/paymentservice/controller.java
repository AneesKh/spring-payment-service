package com.example.checkpoint.cloud.payment.service.paymentservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Value("${eureka.instance.instanceId}")
	private String appId;
	
	@RequestMapping
	public @ResponseBody String getMsg()
	{
		return "This is payment-service. "+appId;
	}
	
}
