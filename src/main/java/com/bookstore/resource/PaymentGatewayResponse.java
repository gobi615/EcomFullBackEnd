package com.bookstore.resource;

import org.springframework.stereotype.Component;

import com.instamojo.wrapper.model.PaymentOrderResponse;

@Component
public class PaymentGatewayResponse {
	
	private PaymentOrderResponse response ;

	public PaymentOrderResponse getResponse() {
		return response;
	}

	public void setResponse(PaymentOrderResponse response) {
		this.response = response;
	} 

}
