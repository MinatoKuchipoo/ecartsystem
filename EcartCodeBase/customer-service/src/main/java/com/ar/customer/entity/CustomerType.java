package com.ar.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_type")
public class CustomerType {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	@Column(name = "type")
	private String type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CustomerType(long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public CustomerType() {
		super(); // TODO Auto-generated constructor stub

	}

}
