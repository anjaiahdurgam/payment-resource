package com.provider.payment.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.provider.payment.model.Payment;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class PaymentResponse {

	private String status;
	private String message;
	private String txDate;
	private List<Payment> payments;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTxDate() {
		return txDate;
	}

	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public PaymentResponse(String status, String message, String txDate, List<Payment> payments) {
		super();
		this.status = status;
		this.message = message;
		this.txDate = txDate;
		this.payments = payments;
	}

	public PaymentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}