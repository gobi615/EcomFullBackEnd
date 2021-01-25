package com.bookstore.imojo;

import com.instamojo.wrapper.api.ApiContext;
import com.instamojo.wrapper.api.Instamojo;
import com.instamojo.wrapper.api.InstamojoImpl;
import com.instamojo.wrapper.exception.ConnectionException;
import com.instamojo.wrapper.exception.HTTPException;
import com.instamojo.wrapper.model.Refund;

public class RefundCreateService {
	
	ApiContext context = ApiContext.create("test_HfxwVD2dEntKl8QsMiGi4ixVr9oFx9drhOI", "test_GLmp18QtwIgY1uzMICycjOB9hghyU0fcOIcKmhbBoa3WvTrk5VxUas0BKMj5EwrqRxHSycT3JSTj7JwdoX3lkBGwZFwelXUwvK0wD6ur1s2AnOaFwkcTK9ng3V5", ApiContext.Mode.TEST);
	Instamojo api = new InstamojoImpl(context);
	
	public void createtRefund() {
		/*
		 * Create a new refund
		 */
		Refund refund = new Refund();
		refund.setPaymentId("[PaymentId]");
		refund.setStatus("refunded");
		refund.setType("RFD");
		refund.setBody("This is a test refund.");
		refund.setRefundAmount(9D);
		refund.setTotalAmount(10D);

		try {
		    Refund createdRefund = api.createRefund(refund);
		    System.out.println(createdRefund.getId());
		    System.out.println(createdRefund.getStatus());

		} catch (HTTPException e) {
		    System.out.println(e.getStatusCode());
		    System.out.println(e.getMessage());
		    System.out.println(e.getJsonPayload());

		} catch (ConnectionException e) {
		    System.out.println(e.getMessage());
		}
	}

}
