package com.bookstore.imojo;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.bookstore.resource.PaymentDetails;
import com.instamojo.wrapper.api.ApiContext;
import com.instamojo.wrapper.api.Instamojo;
import com.instamojo.wrapper.api.InstamojoImpl;
import com.instamojo.wrapper.exception.ConnectionException;
import com.instamojo.wrapper.exception.HTTPException;
import com.instamojo.wrapper.model.PaymentOrder;
import com.instamojo.wrapper.model.PaymentOrderResponse;

@Service
public class CreatePaymentOrderService {
	
	ApiContext context = ApiContext.create("test_HfxwVD2dEntKl8QsMiGi4ixVr9oFx9drhOI", "test_GLmp18QtwIgY1uzMICycjOB9hghyU0fcOIcKmhbBoa3WvTrk5VxUas0BKMj5EwrqRxHSycT3JSTj7JwdoX3lkBGwZFwelXUwvK0wD6ur1s2AnOaFwkcTK9ng3V5", ApiContext.Mode.TEST);
	Instamojo api = new InstamojoImpl(context);

	
	public PaymentOrderResponse createNewOrder(PaymentDetails details) { 
		
		PaymentOrder order = new PaymentOrder();
		order.setName(details.getName());
		order.setEmail(details.getEmail());
System.out.println("details.getPhno()"+details.getPhno());
		order.setPhone(details.getPhno());
		order.setCurrency(details.getCurrency());
		order.setAmount(details.getAmount());
		order.setDescription("This is a test transaction.");
		order.setRedirectUrl(details.getRedirectedTo());
		order.setWebhookUrl("http://www.someurl.com/");
		order.setTransactionId(UUID.randomUUID().toString());
		
//	    /connectionEstablishementInstamojo();
	    
	   // boolean isOrderValid = order.validate();
	     
	    
		PaymentOrderResponse paymentOrderResponse = null ;

		try {
		    paymentOrderResponse = api.createPaymentOrder(order);
		    System.out.println(paymentOrderResponse.getPaymentOrder().getStatus());

		} catch (HTTPException e) {
		    System.out.println(e.getStatusCode());
		    System.out.println(e.getMessage());
		    System.out.println(e.getJsonPayload());

		} catch (ConnectionException e) {
		}
		
		return paymentOrderResponse;
	}
	
	

}
