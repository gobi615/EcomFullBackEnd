package com.bookstore.imojo;

import com.instamojo.wrapper.api.ApiContext;
import com.instamojo.wrapper.api.Instamojo;
import com.instamojo.wrapper.api.InstamojoImpl;
import com.instamojo.wrapper.exception.ConnectionException;
import com.instamojo.wrapper.exception.HTTPException;
import com.instamojo.wrapper.model.PaymentOrder;

public class GetPaymentDetailsService {
	
	ApiContext context = ApiContext.create("test_HfxwVD2dEntKl8QsMiGi4ixVr9oFx9drhOI", "test_GLmp18QtwIgY1uzMICycjOB9hghyU0fcOIcKmhbBoa3WvTrk5VxUas0BKMj5EwrqRxHSycT3JSTj7JwdoX3lkBGwZFwelXUwvK0wD6ur1s2AnOaFwkcTK9ng3V5", ApiContext.Mode.TEST);
	Instamojo api = new InstamojoImpl(context);

	public void getPaymentDetailsByOrderId() {
		/*
		 * Get details of payment order when order id is given
		 */
		try {
		    PaymentOrder paymentOrder = api.getPaymentOrder("[PAYMENT_ORDER_ID]");
		    System.out.println(paymentOrder.getId());
		    System.out.println(paymentOrder.getStatus());

		} catch (HTTPException e) {
		    System.out.println(e.getStatusCode());
		    System.out.println(e.getMessage());
		    System.out.println(e.getJsonPayload());

		} catch (ConnectionException e) {
		    System.out.println(e.getMessage());
		}
	}
	
	public void getPaymentDetailsByTransactionId() {
		/*
		 * Get details of payment order when transaction id is given
		 */
		try {
		    PaymentOrder paymentOrder = api.getPaymentOrderByTransactionId("[TRANSACTION_ID]");
		    System.out.println(paymentOrder.getId());
		    System.out.println(paymentOrder.getStatus());

		} catch (HTTPException e) {
		    System.out.println(e.getStatusCode());
		    System.out.println(e.getMessage());
		    System.out.println(e.getJsonPayload());

		} catch (ConnectionException e) {
		    System.out.println(e.getMessage());
		}
	}
	
//	public void getAllPaymentDetails() {
//		/*
//		 * Get list of all payment orders
//		 */
//		try {
//		    PaymentOrderFilter paymentOrderFilter = new PaymentOrderFilter();
//		    ApiListResponse<PaymentOrder> paymentOrders = api.getPaymentOrders(paymentOrderFilter);
//
//		    // Loop over all of the payment orders and print status of each
//		    // payment order.
//		    for (PaymentOrder paymentOrder : paymentOrders.getResults()) {
//		        System.out.println("Result = " + paymentOrder.getStatus());
//		    }
//		    System.out.println(paymentOrders);
//
//		} catch (HTTPException e) {
//		    System.out.println(e.getStatusCode());
//		    System.out.println(e.getMessage());
//		    System.out.println(e.getJsonPayload());
//
//		} catch (ConnectionException e) {
//		    System.out.println(e.getMessage());
//		}
//	}
	
	
}
