package com.example.checkpoint.cloud.payment.service.paymentservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@RequestMapping
	public @ResponseBody String getMsg()
	{
		return "This is payment-service.";
	}
	
}
