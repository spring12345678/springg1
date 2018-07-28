package com.spring.model;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String ccemails;
	private String phone;
	private  String organization;
	private String reference_id;
	private String customer_since;
	private String subscription;
	private String shipping_addresses;
	private Double check_payment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCcemails() {
		return ccemails;
	}
	public void setCcemails(String ccemails) {
		this.ccemails = ccemails;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getReference_id() {
		return reference_id;
	}
	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}
	public String getCustomer_since() {
		return customer_since;
	}
	public void setCustomer_since(String customer_since) {
		this.customer_since = customer_since;
	}
	public String getSubscription() {
		return subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	public String getShipping_addresses() {
		return shipping_addresses;
	}
	public void setShipping_addresses(String shipping_addresses) {
		this.shipping_addresses = shipping_addresses;
	}
	public Double getCheck_payment() {
		return check_payment;
	}
	public void setCheck_payment(Double check_payment) {
		this.check_payment = check_payment;
	}

}
