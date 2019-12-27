package com.provider.payment.dao;

import java.util.List;

import com.provider.payment.model.Payment;


public interface PaymentDao {
	
	public String payNow(Payment payment);
	
	public List<Payment> getTransactionInfo(String vendor);

}