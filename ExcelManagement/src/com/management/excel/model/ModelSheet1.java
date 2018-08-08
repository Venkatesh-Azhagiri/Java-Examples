package com.management.excel.model;

public class ModelSheet1 {
	private Integer invoiceNo;
	private String customerName;
	private String customerNo;
	
	public ModelSheet1() {		
		invoiceNo = 0;
		customerName = "";
		customerNo = "";
	}

	public Integer getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	
	

}
