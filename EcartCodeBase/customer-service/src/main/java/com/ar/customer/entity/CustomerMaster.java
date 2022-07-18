package com.ar.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_master")
public class CustomerMaster {
	
	@Id
	//@GeneratedValue
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "type")
	private long type;
	@Column(name = "name")
	private String name;
	/*@Column(name = "address")
	private AddressMaster address;*/
	@Column(name = "status")
	private String status;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "wallet_id")
	private long walletId;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public long getType() {
		return type;
	}
	public void setType(long type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public long getWalletId() {
		return walletId;
	}
	public void setWalletId(long walletId) {
		this.walletId = walletId;
	}
	public CustomerMaster(String customerId, long type, String name, String status, String email, String mobile,
			long walletId) {
		super();
		this.customerId = customerId;
		this.type = type;
		this.name = name;
		this.status = status;
		this.email = email;
		this.mobile = mobile;
		this.walletId = walletId;
	}
	public CustomerMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerMaster [customerId=" + customerId + ", type=" + type + ", name=" + name + ", status=" + status
				+ ", email=" + email + ", mobile=" + mobile + ", walletId=" + walletId + "]";
	}
	
	
	
	
	
	

}
