package com.test.SpringJdbcTask;

public class Customer {
	private int cust_id;
	private String customerName;
	private String city;
	private String mobile_no;

	public Customer() {

	}

	public Customer(String customerName, String city, String mobile_no) {
		super();
		this.customerName = customerName;
		this.city = city;
		this.mobile_no = mobile_no;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

}
