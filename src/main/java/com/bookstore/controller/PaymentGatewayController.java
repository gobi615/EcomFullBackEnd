package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.imojo.CreatePaymentOrderService;
import com.bookstore.resource.PaymentDetails;
import com.bookstore.resource.PaymentGatewayResponse;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PaymentGatewayController {
	
	@Autowired 
	private CreatePaymentOrderService service ; 
	
	@Autowired
	private PaymentGatewayResponse response ; 
	
	@PostMapping("/createPayment")
	public PaymentGatewayResponse createPaymentReq(@RequestBody PaymentDetails payDetails) {
		System.out.println(payDetails.getAmount());
		System.out.println(payDetails.getCurrency());
		System.out.println(payDetails.getEmail());
		System.out.println(payDetails.getName());
		System.out.println(payDetails.getPhno());
		response.setResponse(service.createNewOrder(payDetails));
		return response;
	}

}
