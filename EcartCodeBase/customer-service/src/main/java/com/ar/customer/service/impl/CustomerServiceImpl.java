package com.ar.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.customer.entity.CustomerMaster;
import com.ar.customer.entity.CustomerType;
import com.ar.customer.entity.RetailerMaster;
import com.ar.customer.repository.CustomerRepository;
import com.ar.customer.repository.CustomerTypeRepository;
import com.ar.customer.repository.RetailerRepository;
import com.ar.customer.service.CustomerService;
import com.ar.customer.util.CusomerUtility;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerTypeRepository customerTypeRepository;

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private RetailerRepository retailerRepository;

	@Override
	public List<CustomerType> save(List<CustomerType> customerType) {

		System.out.println("inside type save service...");

		return customerTypeRepository.saveAll(customerType);
	}

	@Override
	public String addCustomer(CustomerMaster customer) {

		try {
			if (customer != null) {
				customer.setCustomerId(CusomerUtility.createcustomerId());

			}
			customerRepository.save(customer);
		} catch (Exception ex) {

			ex.printStackTrace();

		}

		return "{customerId:" + customer.getCustomerId() + "}";
	}

	@Override
	public String addRetailer(RetailerMaster customer) {
		try {
			if (customer != null) {
				customer.setRetailerId(CusomerUtility.createcustomerId());

			}
			retailerRepository.save(customer);
		} catch (Exception ex) {

			ex.printStackTrace();

		}

		return "{retailerId:" + customer.getRetailerId() + "}";
	}

}
