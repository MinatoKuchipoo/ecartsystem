package com.ar.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="retailer_master")
public class RetailerMaster {
	
	@Id
	//@GeneratedValue
	@Column(name = "retailer_id")
	private String retailerId;
	
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
	
	
	
	
	
	public String getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
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
	public RetailerMaster(String retailerId, long type, String name, String status, String email, String mobile,
			long walletId) {
		super();
		this.retailerId = retailerId;
		this.type = type;
		this.name = name;
		this.status = status;
		this.email = email;
		this.mobile = mobile;
		this.walletId = walletId;
	}
	public RetailerMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerMaster [retailerId=" + retailerId + ", type=" + type + ", name=" + name + ", status=" + status
				+ ", email=" + email + ", mobile=" + mobile + ", walletId=" + walletId + "]";
	}
	
	
	
	
	
	

}
