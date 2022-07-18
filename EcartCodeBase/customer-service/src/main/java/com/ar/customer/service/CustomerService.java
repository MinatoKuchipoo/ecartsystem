package com.ar.customer.service;

import java.util.List;

import com.ar.customer.entity.CustomerMaster;
import com.ar.customer.entity.CustomerType;
import com.ar.customer.entity.RetailerMaster;

public interface CustomerService {

	List<CustomerType> save(List<CustomerType> customerType);

	String addCustomer(CustomerMaster customer);

	String addRetailer(RetailerMaster customer);

}
